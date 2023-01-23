package testQuestions;

import java.io.*;
import java.util.*;

public class StringReverse {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str;
		System.out.println("Enter string:");
		str = br.readLine();
		br.close();
		Scanner in = new Scanner(str);
	
		String[] words = str.split("\\s+");
		int n = words.length;
		String line[] = new String[n];
		
		
	//	StringTokenizer tokens = new StringTokenizer(str);
    //int m = tokens.countTokens();
		
		
		
		for(int i=0;i<n;i++) {
			line[i] = new String();
			line[i] = in.next();
				
			}
		
		System.out.println("Count of words = "+n+"\nScrambled string is: ");
		for(int j=n-1;j>=0;j--) {
				System.out.print(line[j]+" ");			
		}
		in.close();
		
	}

}
