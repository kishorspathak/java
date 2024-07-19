package co.edureka.java.oops;

public class Product {
	private Integer productId;
	private String productName;

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Override
	public String toString() {
		return "Product [PROD_ID= " + productId + ", PROD_NAME= " + productName + "]";
	}
	
	
}
