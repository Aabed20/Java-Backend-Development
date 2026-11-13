package blc;

public class Products {
int productId;
String productName;
double productPrice;
String productType;

public void setProductData(int id, String name,String type, double price)
{
	productId = id;
	productName = name;
	productType = type;
	productPrice = price;
	
}
public void getProductInfo()
{
	System.out.println("This is "+productName+" "+productType);
	System.out.println("It's Id is "+productId);
	System.out.println(productName+" "+productType+" price is "+productPrice);
}




}
