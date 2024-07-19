//final class A{
class A{
	final void display(){}
}

class B extends A{
	void display(){}
}

class FinalTest 
{
	final int n = 13; //instance variable
	final String name; //blank final variable

	//final FinalTest(){} //error: modifier final not allowed here
	FinalTest(){
		name = "edureka";
	}
	public static void main(String[] args) 
	{
		final int n = 12; //local variable
		//n = 13; //error: cannot assign a value to final variable n
		System.out.println(n);

		FinalTest obj = new FinalTest();
		//obj.n = 13; //error: cannot assign a value to final variable n
		System.out.println(obj.n);

		System.out.println(obj.name);
	}
}
