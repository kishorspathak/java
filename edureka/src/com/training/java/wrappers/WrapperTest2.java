package com.training.java.wrappers;

public class WrapperTest2 {

	public static void main(String[] args) {
		// Wrapping or boxing
		Integer i1 = Integer.valueOf(12);
		Integer i2 = Integer.valueOf(23);

		Integer i3 = i1 + i2; // 2 objects cannot be added, but internally unboxing, addition, boxing happens first
		System.out.println(i3);
		
		if (i3 instanceof Integer)
			System.out.println("i3 is an Integer object");
		
		System.out.println(i3.getClass().getSimpleName());

	}

}
