package dineshPrograms;



public class Check {

	public static void main (String[]args){

		int c= 0;

		for( int i=1; i<18; i++)

		{
		for( int n=2; n<i/2; n++)
		{

		c=n%i;
		}
		c++;
		System.out.print(i+",");
		}

		}}

