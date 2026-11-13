package com.product_record;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class ProductDao 
{
	@Autowired
   private JdbcTemplate template;
	
	private final String QUERY_FOR_FETCHING_ALL_PRODUCTS="select id, name, category, price from product1";

	private final String QUERY_FOR_FETCHING_ONE_PRODUCT="select id, name, category, price from product1 where id=?";
	
	public List<Product> getAllProducts()
	{
        List<Product> list = template.query(QUERY_FOR_FETCHING_ALL_PRODUCTS, (res,rowNum)->new Product(res.getInt(1),res.getString(2),res.getString(3),res.getDouble(4)));
        return list;
	}
	
	public Product getProudctById(int id)
	{
		Product pro = template.queryForObject(QUERY_FOR_FETCHING_ONE_PRODUCT,(res,rowNum)->new Product(res.getInt(1),res.getString(2),res.getString(3),res.getDouble(4)),id);
		return pro;
	}
	
}
