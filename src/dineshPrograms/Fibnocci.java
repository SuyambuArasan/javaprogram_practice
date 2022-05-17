package dineshPrograms;

import java.util.Scanner;

public class Fibnocci {
	public static void main(String[]args){

		Scanner sa = new Scanner(System.in);
		System.out.print("enter a number a=");
		int a = sa.nextInt();
		System.out.print("enter a number b=");
		int b = sa.nextInt();
		
		
	
		for(int i=0 ; i<12 ; i++)

		{
		int c=a+b;
		
		System.out.printf((a+","),(b+","),(c+","));
		a=b;
		b=c;

		}

		}}