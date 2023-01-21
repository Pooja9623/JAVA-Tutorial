package testQuestions;

public class StringFirstLast {

	public static void main(String[] args) {
		try {
		String s = args[0];
		int n= Integer.parseInt(args[1]);
		
		for(int i=0;i<n;i++) {
			System.out.print(s.charAt(i));
		}
		for(int i=s.length()-n;i<s.length();i++) {
			System.out.print(s.charAt(i));
		}

	}catch(IndexOutOfBoundsException e) {
		System.out.println(e);
	}
}

}
