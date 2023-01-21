package testQuestions;


import java.util.Scanner;

class Name{
String F, M, L;
	
	public static Scanner sc = new Scanner(System.in);
	public Name() {
		accept();
		display();
	}
	
	protected void accept() {
		System.out.println("First name:");
		F = sc.next();
		System.out.println("Middle name:");
		M = sc.next();
		System.out.println("Last name:");
		L = sc.next();
	}
	
	protected void display() {
		System.out.println("\nName: "+L+" "+F+" "+M.charAt(0)+".");
	}
}

public class FirstMiddleLastName {
	
	
	public static void main(String[] args) {
		Name n = new Name();
		

	}

}
