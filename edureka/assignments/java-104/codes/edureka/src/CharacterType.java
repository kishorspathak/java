
public class CharacterType {

	public static void main(String[] args) {
		char c = 'A';
		System.out.println(c);
		
		c = 65; //implicit type-casting
		System.out.println(c);
		
		c = '\u0041';
		System.out.println(c);
		
		c = '\u0905'; //Hindi
		System.out.println(c);
		
		c = '\u0c05'; //Telugu
		System.out.println(c);
		
		c = '\u0d05'; //malayalam
		System.out.println(c);
		
		c = '\u4eca';
		System.out.println(c);
	}

}
