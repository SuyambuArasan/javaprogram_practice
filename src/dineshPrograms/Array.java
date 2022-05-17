package dineshPrograms;

public abstract class Array {

	public static void main(String[]args){
		
	int row = 2 , col=2;
	
	int [][] matrixa= { {1,2},{3,4} };
	int [][] matrixb = { {5,6},{7,8} };	
	
	
	 int [][] sum= new int [row][col];
	for (int i=0; i<row; i++)	{
		
		
		for (int j=0; j<col; j++) {
			
			sum[i][j] = matrixa[i][j]+matrixb[i][j];
		}}
		
		
		for (int i=0; i<row; i++)	{
			
			
			for (int j=0; j<col; j++) {
				
		System.out.print(sum[i][j]+ " ");		
		
	}
		
			System.out.println();		
		
		
		
		

	}}}