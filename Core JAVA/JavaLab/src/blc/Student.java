package blc;

public class Student {
public void getStudentdata(String studentName,int studentRollNo ,int studentBatch)
{
	System.out.println("StudentName is "+studentName);
	System.out.println(studentName+" Roll Number is "+studentRollNo);
	System.out.println(studentName+" is in "+studentBatch+" Batch");
}
public int studentMarks(int subject1, int subject2, int subject3, int subject4, int subject5)
{
	return subject1+subject2+subject3+subject4+subject5;
}
}
