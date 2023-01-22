package testQuestions;

import java.io.*;
import java.util.Scanner;

public class FileLongLen {

	public static void main(String[] args) throws IOException{
		
		FileInputStream fis = new FileInputStream(args[0]);

		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		
		String line, s="";
		int max=-99;
		while((line=br.readLine())!=null) {
			
			int n = line.length();
			if(n>max) {
				max=n;
				s = line;
			}
			
				
		}
		System.out.println("Length of longest line is "+max+"\nLongest line is:"+s);
		
		br.close();
		
	}

}
