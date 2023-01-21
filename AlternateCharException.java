package testQuestions;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AlternateCharException {

	public static void main(String[] args) throws IOException {
	
	try{
				
		File f = new File(args[0]);
		FileReader fr = new FileReader(f);
		if(f.exists()) {
		 
			int ch,i=0;
			while((ch=fr.read())!=-1) {
				if(i%2==0)
					System.out.print((char) ch+" ");
				
				i++;				
			}
		}
		fr.close();
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Missing Input!");
		}  catch (FileNotFoundException e) {
			System.out.println("File Not found!");
		} 
		

	}

}
