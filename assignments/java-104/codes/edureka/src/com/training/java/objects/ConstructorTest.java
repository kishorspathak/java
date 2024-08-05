package com.training.java.objects;

class Employee {
	// These Member datas/variables are created in Heap Memory
	int empno;
	String name;
	float sal;

	Employee() {
		System.out.println("*********");
		empno = 102;
		name = "kishor";
		sal = 25F;
	}

	void getDetails() {
		System.out.println(empno + " | " + name + " | " + sal);
	}
}

class ConstructorTest {
	public static void main(String[] args) {
		/** create an instance/object of Employee type. This is an object reference & create in Stack Memory **/
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();
		
		/** Access the state of object using the reference & method **/
		emp1.getDetails();
		emp2.getDetails();
		emp3.getDetails();
	}
}
