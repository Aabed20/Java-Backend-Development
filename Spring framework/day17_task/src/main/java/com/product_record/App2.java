package com.product_record;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App2 
{
	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DatabaseConfiguration.class);

		ProductDao bean = context.getBean(ProductDao.class);
		
		List<Product> allProducts = bean.getAllProducts();
		
		System.out.println("----------- All Products -----------");
		allProducts.forEach((pr)->System.out.println(pr.getId()+" "+pr.getName()+" "+pr.getCategory()+" "+pr.getPrice()));
		
		//System.out.println(allProducts);
		
		Product pr = bean.getProudctById(2);
		System.out.println(pr);
		
	}

}
