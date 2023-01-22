package testQuestions;

public class CountInvalidInteger {

	public static void main(String[] args) {
		int m=0,k=0,s=0,n = args.length;
		
		for(int i=0;i<n;i++) {
		try {
		  m = Integer.parseInt(args[i]);
		  s += m;
			}catch(NumberFormatException e){
				k++;
			}
		}
		System.out.println("Total numbers entered = "+n+
				"\nInvalid integers = "+k+"\nSum of integers = "+s);
		

	}

}
