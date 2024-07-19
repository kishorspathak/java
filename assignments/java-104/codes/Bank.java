interface Bank
{
	int n = 12;

	void deposit(float amt);
	//default void withdraw(float amt){}   //from Java 8
	void withdraw(float amt);
}