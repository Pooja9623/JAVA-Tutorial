package testQuestions;

import java.util.Scanner;

import games.*;

public class Games {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Outdoor Cricket = new Outdoor();
		Cricket.display();
		
		
		Outdoor Kabaddi;
		System.out.println("Enter no. of players in Kabaddi:");
		int n = sc.nextInt();
		Kabaddi = new Outdoor(n);
		Kabaddi.display();
		
		Indoor Ludo = new Indoor();
		Ludo.display();
		
		
		Indoor Card;
		System.out.println("Enter no. of players in Card game:");
		int m = sc.nextInt();
		Card = new Indoor(m);
		Card.display();
		
		sc.close();

	}

}
