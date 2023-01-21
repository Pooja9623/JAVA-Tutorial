package testQuestions;

import java.io.*;
import java.util.Scanner;

public class FileLongLen {

	public static void main(String[] args) throws IOException{
		
		FileInputStream fis = new FileInputStream(args[0]);
		FileWriter fw = new FileWriter(args[1]);
		Scanner sc = new Scanner(fis);
		
		String line[] = new String[100];
		int i=0,max=-99;
		while(sc.hasNextLine()) {
			line[i] = new String();
			line[i] = sc.nextLine();
			int n = line[i].length();
			if(n>max) max=n;
			i++;	
			}
		
		for(int j=0;j<i;j++) {
			if(line[j].length() == max) {
				fw.write(line[j]);
				fw.write("\n");
			}
		}
		sc.close();
		fw.close();
	}

}
