package dineshPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;


public class repeatwords {
	
	public static void main(String[]args) {
		
		Scanner sa = new Scanner(System.in);
		System.out.println("Enter a String");
		String dk = sa.next();
		
		char[] ch = dk.toCharArray();
		Map<Character, Integer> charmap = new HashMap<Character, Integer>();
		for (char c : ch) {
		if (charmap.containsKey(c)) {
			
		Integer it = 	charmap.get(c);
		charmap.put(c, it+1);
			
			
		} else {
			charmap.put(c,1);

		}	
		}
		
Set<Entry<Character, Integer>>entryset = charmap.entrySet();
for (Entry<Character, Integer> entry : entryset) {
	
	if (entry.getValue()>1) {
	Character key =	entry.getKey();
	Integer value = entry.getValue();
	System.out.println(key+"="+value);
	}
	
	
}



	
}
}