package dineshPrograms;

import java.util.Scanner;

public class Swapping {
	
	public static void main (String[]args) {
	
	Scanner sa = new Scanner(System.in);
	System.out.println("enter 1 no:");
	int a = sa.nextInt();
	Scanner sab = new Scanner(System.in);
	System.out.println("enter 2 no:");
	int b = sab.nextInt();
	
	int c ;
	c=a;
	a=b;
	b=c;
	
	System.out.println("after swapping:");
	System.out.println(a);
	System.out.println(b);
	
	

	}
}
