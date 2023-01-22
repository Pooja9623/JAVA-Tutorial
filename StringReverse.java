package testQuestions;

import java.io.*;
import java.util.*;

public class StringReverse {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s;
		System.out.println("Enter string:");
		s = br.readLine();
		br.close();
		Scanner in = new Scanner(s);
		
		String line[] = new String[100];
		int i=0;
		while(in.hasNext()) {
			line[i] = new String();
			line[i] = in.next();
			i++;	
			
			}
		
		System.out.println("Count of words = "+i+"\nScrambled string is: ");
		for(int j=i-1;j>=0;j--) {
				System.out.print(line[j]+" ");
			
		}
		in.close();
		
	}

}
