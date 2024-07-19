package com.training.java.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.Reader;

public class ReadFile {

	public static void main(String[] args) throws Exception {
		//---To handle any exception either use try/catch or add throws statement to the calling method
		FileInputStream fin = new FileInputStream("src/com/training/java/io/java.txt"); // ---This is pointing to the first character of the file

		
		 System.out.println("No of characters to be read = " + fin.available()); //---count the number of characters in the file
		 System.out.println(fin.read());//---read the ASCII numeric value of current character i.e. 1st character and move to next character
		 System.out.println(fin.read());//---read the ASCII numeric value of current character i.e. 2nd character and move to next character
		 System.out.println(fin.read());//---read the ASCII numeric value of current character i.e. 3rd character and move to next character
		 System.out.println("No of characters to be read = " + fin.available()); //count the number of characters in the file
		 

		//---read() method returning -1, indicates the end of stream or characters or data
		//---read file contents character-by-character ---
		
		 int n = fin.read();
		  
		 while (n != -1) {
			System.out.print((char) n); // ---convert numeric ASCII value to character i.e. 65 to A etc..
			n = fin.read();
			Thread.sleep(50);
		 }

		//---read file contents completely ---
		/**
		 * To read file contents completely, take ASCII value of each character and
		 * store into a byte[] then convert the byte[] to a stream
		 **/

		 byte[] b = new byte[fin.available()]; //---Create a byte array with the size of available characters 
		 fin.read(b); //---Entire content is stored into a byte[] hence just read all content 
		 String str = new String(b);
		 System.out.println(str);
		 
		// ---read file contents line-by-line
		/**
		 File input stream does not have a readline() method. 
		 readline() method is in BufferedReader and to create an object of BufferedReader() 
		 we need Reader object but we have FileInputStream object, hence first convert ByteStream to CharacterStream
		**/
		 Reader fileSource = new InputStreamReader(fin); //---To convert ByteStream to CharacterStream 
		 BufferedReader br = new BufferedReader(fileSource); //---Convert reader to BufferedReader
		 
		 String line = br.readLine(); 
		 while (line != null) { 
			 System.out.println(line);
			 Thread.sleep(50); 
			 line = br.readLine(); 
		 } 
		 br.close(); 
		 fin.close();
		 

		//---read file content character-by-character using ReaderObject
		
		FileReader reader = new FileReader("src/com/training/java/io/java.txt");
		
		int n1 = reader.read();
		while (n1 != -1) {
			System.out.print((char) n1);
			n1 = reader.read();
			Thread.sleep(50);
		}
		
		
		//---read file content line-by-line using ReaderObject
		BufferedReader bufferedReader = new BufferedReader(reader);
		String line1 = bufferedReader.readLine();
		while (line1 != null) {
			System.out.println(line1);
			line1 = bufferedReader.readLine();
			Thread.sleep(50);
		}
		
		bufferedReader.close();
		reader.close();

	}
}
