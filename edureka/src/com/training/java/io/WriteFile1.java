package com.training.java.io;

import java.io.FileWriter;

public class WriteFile1 {

	public static void main(String[] args) throws Exception {
		@SuppressWarnings("resource")
		FileWriter fout = new FileWriter("src/com/training/java/io/edureka-writer.txt", true);
		String str = "Enroll in Edureka's certification course & give your tech career a much-needed boost.\n";
		fout.write(str);

	}

}
