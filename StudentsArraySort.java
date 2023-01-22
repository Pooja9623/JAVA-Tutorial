package testQuestions;

import java.util.*;

class Students{
	
	private int rollNo;
	String Name;
	float per;
	
	public static Scanner sc = new Scanner(System.in);
	
	public void accept(int r) {
		System.out.println("Enter name and percentage of student "+r);
		rollNo = r;
		Name = sc.nextLine();
		per = sc.nextFloat();
		sc.nextLine();
	}
	
	public void Display(int r) {
		System.out.println("RollNo:"+rollNo+"\tName:"+Name+"\tPercentage:"+per);
	}
}

public class StudentsArraySort {
	public static Scanner sc = new Scanner(System.in);

	public static void sortStudent(Students []s) {
		int n = s.length;
		for(int i=0; i<n-1; i++) {
			for(int j=0;j<n-1-i;j++) {
				if(s[j].per>s[j+1].per) {
					Students t = s[j];
					s[j]=s[j+1];
					s[j+1] = t;
				}
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.println("Enter no. of students:");
		int n = sc.nextInt();
	
		Students s[]= new Students[n];
		
		for(int i=0;i<n;i++) {
			s[i] = new Students();
			s[i].accept(i+1);
		}
		
		for(int i=0;i<n;i++) {
			s[i].Display(i+1);
		}
		
		sortStudent(s);
		for(int i=0;i<n;i++) {
			s[i].Display(i+1);
		}

	}

}
