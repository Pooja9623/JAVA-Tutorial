package games;

import java.util.Scanner;


public class Outdoor {
	public static Scanner sc = new Scanner(System.in);
	private String player[];
	private int m;

	public Outdoor() {
		m = 5;
		accept(m);
	}
	
	public Outdoor(int b) {
		m = b;
		accept(m);
	}
	
	public void accept(int n) {
		player = new String[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter name of player "+(i+1));
			player[i] = new String();
			player[i] = sc.nextLine();
		}
	}
	
	public void display() {
		System.out.println("\nList of players :");
		for(int i=0;i<m;i++) {
			System.out.println(i+1+"\t"+player[i]);
		}
	}
	
}
