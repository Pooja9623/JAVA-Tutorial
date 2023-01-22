package testQuestions;

import java.io.*;

public class FileCopyComputer {

	public static void main(String[] args) throws IOException  {
		FileInputStream fis = new FileInputStream(args[0]);
		FileWriter fw = new FileWriter(args[1]);
				
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		
		String line = new String();
		
		while((line=br.readLine())!=null) {
			if(line.indexOf("Computer")>-1) {
				fw.write(line+"\n");
			}
		}
		System.out.println("Copied Successfully!");
		br.close();
		fw.close();

	}

}
