package testQuestions;

import java.io.*;

public class FileReplaceChar {

	public static void main(String []args) {
		try {
		FileReader fr = new FileReader(args[0]);
		FileWriter fw = new FileWriter("output.txt");
		char c = args[1].charAt(0);
		int ch;
		
		while((ch=fr.read())!=-1) {
			if(c == (char)ch) {
				ch='*';
			}
			fw.write((char)ch);
			
			
		}
		fw.close();
		fr.close();
		
		System.out.println("Replaced succesfully");
		
		}catch(IndexOutOfBoundsException e) {
			System.out.println(e);
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}catch(IOException e) {
			System.out.println(e);
		}
		
		
	}

}
