class Employee 
{
	int empno;
	String name;
	float sal;

	void setDetails(){
		name = "Sanjay Patil";
		sal = 3500.75f;
	}

	void getDetails(){
		System.out.println(empno + " | " + name + " | " + sal);
	}

	public static void main(String[] args) 
	{
		Employee emp = new Employee();

		//--accessing state of object using reference
		System.out.println(emp.empno + " | " + emp.name + " | " + emp.sal);

		//--accessing state of object using method
		emp.getDetails();

		//--changing the state of object using reference
		emp.empno = 101;
		emp.name = "Sanjay";
		emp.sal = 2500f;
		emp.getDetails();

		//--changing the state of object using method
		emp.setDetails();
		emp.getDetails();
	}
}
