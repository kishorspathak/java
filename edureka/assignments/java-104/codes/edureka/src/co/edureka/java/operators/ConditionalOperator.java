package co.edureka.java.operators;

public class ConditionalOperator {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		
		int lar = (x > y) ? x : y;
		
		System.out.println("largest of (" + x + ", " + y + ") = " + lar);
		
		System.out.printf("largest of (%d, %d) = %d", x, y, lar);
	}

}
