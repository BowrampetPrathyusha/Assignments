package assignment3;

public class TestProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product1=new Product("Laptop",45000,'E');
		Product product2=new Product("Laptop1",45500);
		System.out.println(product1.getProductName());
		System.out.println(product1.getProductPrice());
		System.out.println(product1.getCategoryCode());
		System.out.println(product2.getProductName());
		System.out.println(product2.getProductPrice());

	}

}
