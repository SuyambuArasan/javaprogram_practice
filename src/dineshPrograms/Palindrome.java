package dineshPrograms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sa = new Scanner (System.in);
		System.out.println("Enter a word ");
		String s= sa.next();
		String reverse = "";

		for( int i = s.length()-1; i>=0; i--)

		{
		reverse = reverse+s.charAt(i);
		}
		if ( s.toLowerCase().equals(reverse.toLowerCase()))

		{
		System.out.println(" The given word is palindrome");
		}
		else
		{

		System.out.println(" The given word is not a palindrome");
		}



		}}