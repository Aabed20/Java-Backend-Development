package com.small_shop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class OperationDao 
{
	private JdbcTemplate template;
	
	public final static String QUERY_FOR_PRODUCTPRICE_BYID="select price from product2 where PRODUCTNAME=?";

	public final static String QUERY_FOR_ALL_PRODUCTS="select PRODUCTNAME, shippingadd, price, quantity, placeddate from product2";
	
	public final static String QUERY_TO_INSERT_PRODUCT="insert into product2 values(?,?,?,?,?)";
	
	public final static String QUERY_TO_DELETE_PRODUCT_BYNAME="delete from product2 where productname=?";
	
	public final static String QUERY_TO_UPDATE_PRODUCT_BYNAME="update table product2 set shippingadd=?, placeddate=? where productname=?";
	
//	public final static String QUERY_TO_COUNT_MATCHING_PRODUCTS="select count(productname) from product2 where productname=?";
	
	@Autowired
	public OperationDao(JdbcTemplate template)
	{
		this.template=template;
	}
	
	public double getPriceByName(String name)
	{
		  Double price = template.queryForObject(QUERY_FOR_PRODUCTPRICE_BYID, Double.class, name);
		  if(price>0)
		  {
			  return price;
		  }
		  return 0;
	}
	
	public List<ProductDelivery> allProducts()
	{
		 return template.query(QUERY_FOR_ALL_PRODUCTS, (rs,rowNum)->
		{
			ProductDelivery product = new ProductDelivery();
			product.setProuductName(rs.getString(1));
			product.setProductShippingAddress(rs.getString(2));
			product.setProductPrice(rs.getFloat(3));
			product.setProductQuantity(rs.getInt(4));
			product.setProductPlaceDate(rs.getString(5));
			return product;
		}
				);
	   
	}
	
	public int insertProduct(ProductDelivery product)
	{
		return template.update(QUERY_TO_INSERT_PRODUCT, new Object[] {product.getProuductName(),product.getProductShippingAddress()
		,product.getProductPrice(),product.getProductQuantity(),product.getProductPlaceDate()});
	}
	
	public int deleteProduct(String productName)
	{
	 return template.update(QUERY_TO_DELETE_PRODUCT_BYNAME, productName);	
	}
	
	public int updateProduct(String address,String placedDate,String productName)
	{
		return template.update(QUERY_TO_UPDATE_PRODUCT_BYNAME, address,placedDate, productName);
	}
	
	public int CountMatchingProducts(String productName)
	{
		List<ProductDelivery> products = allProducts();
		
		long count = products.stream()
		.filter(pr->pr.getProuductName().equals(productName))
		.count();
		return (int)count;
	}
	
	public List<ProductDelivery> productsByShippingAddress(String address)
	{
		List<ProductDelivery> all = allProducts(); 
		
		List<ProductDelivery> list = all.stream()
		.filter(pr->pr.getProductShippingAddress().equals(address))
		.toList();
		return list;
	}
}

