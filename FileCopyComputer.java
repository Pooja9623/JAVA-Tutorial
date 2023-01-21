package testQuestions;

import java.io.*;
import java.util.*;

public class FileCopyComputer {

	public static void main(String[] args) throws IOException  {
		FileInputStream fis = new FileInputStream(args[0]);
		FileWriter fw = new FileWriter(args[1]);
		Scanner sc = new Scanner(fis);
		
		String line = new String();
		
		while(sc.hasNextLine()) {
			line = sc.nextLine();
			if(line.indexOf("Computer")>-1) {
				fw.write(line);
				fw.write("\n");
			}
		}
		
		sc.close();
		
		
		fw.close();

	}

}
