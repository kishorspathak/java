package com.training.java.oops;

import java.util.Scanner;

public class DrawingApp {

	public static void main(String[] args) {
		Shape sh = null;
		//sh = new Shape("yellow"); //Cannot instantiate the type Shape
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("which shape do you want to work with? [1.Rect | 2.Circle]: ");
		int shapeType = sc.nextInt();
		
		switch(shapeType) {
	  	 case 1:
	  		System.out.print("enter color of rectangle: ");
	  		String color = sc.next();
	  		System.out.print("enter length of rectangle: ");
	  		int len = sc.nextInt();
	  		System.out.print("enter breadth of rectangle: ");
	  		int bre = sc.nextInt();
	  		sh = new Rectangle(color, len, bre);
			break;
	  	 case 2:
	  		System.out.print("enter color of circle: ");
	  		color = sc.next();
	  		System.out.print("enter radius of circle: ");
	  		float rad = sc.nextFloat(); 
	  		sh = new Circle(color, rad);
			break;
		 default:
			 System.err.println("INVALID SHAPE SELECTION --- TRY AGAIN");
			 return; //System.exit(0);
		}
		
		System.out.println("======================= SHAPE SELECTED: "+ sh.getClass().getSimpleName().toUpperCase()+ " ==============================");
		System.out.println("color of \"" + sh.getClass().getSimpleName()+"\" = " + sh.getColor());
		sh.setColor("yellow");
		sh.area();
	}
}
