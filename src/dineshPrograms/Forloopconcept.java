package dineshPrograms;

public class Forloopconcept {

	public static void main(String[] args){
 
		int n= 5;
		

		for ( int row =1; row<=n; row++ )

		{


		for (int col = n-1; col>=row; col--)

		{
        
		System.out.print(" ");
		
		
		}
		
		for (int i = 1; i < row; i++) {
			
			System.out.print("*");	
			
		}

		System.out.println();

		}}}



