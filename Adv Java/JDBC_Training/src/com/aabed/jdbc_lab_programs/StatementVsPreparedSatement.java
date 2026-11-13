package com.aabed.jdbc_lab_programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class StatementVsPreparedSatement
{
    public static void main(String[] args) 
    {
    	try
    	{
        Class.forName("oracle.jdbc.OracleDriver");

        Connection con = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:orcl",
                "AABED",
                "PATHAN");

        // ---------------- STATEMENT ----------------
        Statement stmt = con.createStatement();

        long startStmt = System.currentTimeMillis();

        for (int i = 1; i <= 10000; i++)
        {
            String sql = "INSERT INTO emp_test VALUES(" + i + ",'Emp" + i + "')";
            stmt.executeUpdate(sql);
        }

        long endStmt = System.currentTimeMillis();
        System.out.println("Statement Time: " + (endStmt - startStmt) + " ms");

        // ---------------- PREPARED STATEMENT ----------------
        String psSql = "INSERT INTO emp_test VALUES(?, ?)";
        PreparedStatement ps = con.prepareStatement(psSql);

        long startPs = System.currentTimeMillis();

        for (int i = 10001; i <= 20000; i++)
        {
            ps.setInt(1, i);
            ps.setString(2, "Emp" + i);
            ps.executeUpdate();
        }

        long endPs = System.currentTimeMillis();
        System.out.println("PreparedStatement Time: " + (endPs - startPs) + " ms");

        con.close();
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
}

