package dineshPrograms;

import java.util.Scanner;

public abstract class ReverseString {

	public static void main (String[]args){

		Scanner sa = new Scanner(System.in);
		System.out.println("please enter a word");
		String s = sa.next();
		String reverse = "";

		for ( int i =s.length()-1 ; i>=0; i--)

		{

		reverse = reverse+s.charAt(i);
		}
		System.out.println("Reverse of  a word:"  +reverse);

		}}