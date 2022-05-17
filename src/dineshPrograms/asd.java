package dineshPrograms;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.file.DirectoryStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class asd {
	
	 public static int addnum(int num) {
		 
		 if (num!=0) {
			 
			 return num+addnum(num-1);
			
		} 
		return num;
		
		// TODO Auto-generated method stub

	}
	
	public static void main(String[] args) {
		int sum = addnum(10);
		PrintStream p = new PrintStream(new FileOutputStream(FileDescriptor.out));
		p.print(sum);
		
		
	}}

	
	





	


