package dineshPrograms;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class WithoutSys {

	public static void main(String[] args) {
		
		for (int i = 1; i <=5; i++) {
			
			PrintStream myOutpPrintStream = new PrintStream(new FileOutputStream(FileDescriptor.out));
			myOutpPrintStream.print("DineshK\n");
			
			
			
		}

		
	
		
		
		
		
		
		
		
		
		
	}

}
