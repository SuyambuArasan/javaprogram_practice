package dineshPrograms;

public class AscendingDecending {
	
	private static void ascending() {
		
		int temp;
		int a[] = {10, 400,1,300};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]>a[j]) {
					
					temp = a[i];
					a[i]=a[j];
					a[j] = temp;
					
				}
				
			}
			
		}
for (int j = 0; j < a.length; j++) {
	System.out.println(a[j]);
	
}
	}
	
private static void decending() {
	
	int temp;
	int a[] = {6000,2,6050,6,3,4};
	for (int i = 0; i < a.length; i++) {
		for (int j = i+1; j < a.length; j++) {
			if (a[i]<a[j]) {
				temp = a[i];
				a[i] = a[j];
				a[j]= temp;
				
			}
			
			
			
		}
		
	}
for (int i = 0; i < a.length; i++) {
	System.out.println(a[i]);
}
	
	
	
}	
	
	
	
	
	public static void main (String[]args) {
		//ascending();
		decending();
	}

}
