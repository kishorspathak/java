package co.edureka.java.oops;

public class Inventory {

	public static void main(String[] args) {
		Product prod = new Product();
		//System.out.println(prod.productId);//The field Product.productId is not visible
		System.out.println(prod.getProductId() + " | " + prod.getProductName());
		
		prod.setProductId(8525226);
		prod.setProductName("Mobile Phone");
		System.out.println(prod.getProductId() + " | " + prod.getProductName());
		
		System.out.println("\"prod\" is of type - " + prod.getClass().getName());
		System.out.println("\"prod\" is of type - " + prod.getClass().getSimpleName());
		
		System.out.println("hashCode() - " + prod.hashCode());
		System.out.println("hashCode() in hexa_decimal form - " + Integer.toHexString(prod.hashCode()));
		
		System.out.println(prod);  //toString()
	}

}
