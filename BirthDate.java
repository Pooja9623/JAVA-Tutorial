package testQuestions;

import java.util.*;

class InvalidDate extends Exception{}

class InvalidMonth extends Exception{}


public class BirthDate {
	private int date, month, year;
	
	public BirthDate(int d, int m, int y) {
		date = d;
		month = m;
		year = y;
	}
	
	public void display() {
		System.out.println(date+"/"+month+"/"+year);
	}

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int d,m,y;
		System.out.println("Enter date, month and year");
		d = sc.nextInt();
		m = sc.nextInt();
		y = sc.nextInt();
		
		try {
			
			switch(m)
			{
				case 4:
			    case 6:
		     	case 9:
				case 11:
					if (d<1 || d>30)
						throw new InvalidDate();
					break;
					
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
				   	if (d<1 || d>31)
				   		throw new InvalidDate();
				   	break;
				    	
				case 2:
					if ((y%4==0 && y%100!=0 || y%400==0))
				    	{
				    		if(d<1 || d>29) 
				    		throw new InvalidDate();
				    		break;
						}
						else
						{
							if(d<1 || d>28)  
				    		throw new InvalidDate();
							break;
						}	
				default :
					throw new InvalidMonth();
			}
			
			BirthDate b = new BirthDate(d, m, y);
			b.display();
		}catch(Exception e) {
			System.out.println(e);
			
		}

		sc.close();
	}

}
