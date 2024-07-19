import java.util.Scanner;

public class Welcome {

	public static void main(String[] args) {
		System.out.print("Enter the number for multiplication table display : ");
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			int table = sc.nextInt();
			displayMultipleTable(table);
		} finally {
			sc.close();
		}

	}

	static void displayMultipleTable(int num) {
		int itr = 1;
		while (itr <= 10) {
			int result = num * itr;
			System.out.println(num + " x " + itr + " = " + result);
			itr++;
		}
	}

}
