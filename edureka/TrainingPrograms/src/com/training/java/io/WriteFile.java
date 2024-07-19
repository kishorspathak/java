package com.training.java.io;

import java.io.FileOutputStream;

public class WriteFile {

	public static void main(String[] args) throws Exception{
		//---If the file is not available at mentioned path then it will create a new file
		//---If the file with some content already exist, then file is modified & existing content is deleted
		//--- if true is specified the existing content is not deleted and file is just appended with new content
		FileOutputStream fout = new FileOutputStream("src/com/training/java/io/edureka.txt", true);
		
		/**
		 This is the content to be written into the file, but we are working with ByteStream, 
		 so we will have to convert String to Byte[] using getBytes()
		 */
		String str = "Enroll in Edureka's certification course & give your tech career a much-needed boost.\n";
		byte[] b = str.getBytes(); //---To convert string to byte[]
		fout.write(b);//---Write complete data to FileOutputStream. If only limited data using an overloaded method
		
		System.out.println("file saved!!");
		
		fout.close();
		
		
	}

}
