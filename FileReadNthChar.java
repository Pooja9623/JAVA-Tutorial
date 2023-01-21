package testQuestions;

import java.io.*;

public class FileReadNthChar {

	public static void main(String[] args) throws IOException {
		File f = new File("File.txt");
		FileReader fr = new FileReader(f);
		
		int ch,i=1,n=Integer.parseInt(args[0]);
		while((ch=fr.read())!=-1) {
			if(i%n==0) System.out.print((char)ch);
			i++;
		}
		fr.close();
	}

}
