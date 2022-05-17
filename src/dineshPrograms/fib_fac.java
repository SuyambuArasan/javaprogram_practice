package dineshPrograms;

import java.util.Scanner;

public class fib_fac {
	
	private static void fac() {
		
		Scanner sa = new Scanner(System.in);
		System.out.print("Enter the factorila no:");
		int s= sa.nextInt();
		
		int count = 1;
		for (int i = 1; i <= s; i++) {
			
			count=count*i;
			
		}
		System.out.println("fac no is :"+count);
	}
	
	private static void fib() {
int a=0,b=1,c;
System.out.println("fibnocci series is");
System.out.print(a+",");
System.out.print(b+",");
for (int i = 0; i < 10; i++) {
	
	c= a+b;
	System.out.print(c+",");
	a=b;
	b=c;
	
}
	}

public static void main(String[] args) {
	fac();
	fib();
}
}
