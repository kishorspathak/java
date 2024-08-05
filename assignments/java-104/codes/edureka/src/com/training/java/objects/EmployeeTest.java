package com.training.java.objects;

public class EmployeeTest {
	// These Member datas/variables are created in Heap Memory
	int empno;
	String name;
	float sal;

	void setDetails() {
		empno = 102;
		name = "kishor";
		sal = 25F;
	}

	void getDetails() {
		System.out.println(empno + " | " + name + " | " + sal);
	}

	public static void main(String[] args) {
		/**
		 * create an instance/object of Employee type. This is an object reference &
		 * created in Stack Memory
		 **/
		EmployeeTest emp = new EmployeeTest();

		// Access the state of object using the reference
		System.out.println(emp.empno + " | " + emp.name + " | " + emp.sal);

		// Access the state of object using the reference & method
		emp.getDetails();

		// Change the state of object using reference
		emp.empno = 101;
		emp.name = "Kiyansh";
		emp.sal = 10F;

		emp.getDetails();

		// Change the state of object using reference & method
		emp.setDetails();
		emp.getDetails();

	}

}
