package dineshPrograms;

public class Patterntry {

	public static void main(String[] args) {
 
		
		int n = 5;
		
		int x = n/2 ;
		int y =1;
		

		 for (int row = 1; row <=n; row++) {
			 
			 for (int col = 1; col <=x; col++) {
				 
				 System.out.print(" ");
			
			}
			
			for (int k = 1; k<=y;k++) {
					 System.out.print(k+"");
			
				
			}
			
			if (row<=n/2) {
				
				x--;
				y+=2;
				
			} else {
				
				x++;
				y-=2;

			}
			System.out.println();
		}

			}

		

		
		
		
	}


