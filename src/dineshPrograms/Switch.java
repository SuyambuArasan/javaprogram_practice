package dineshPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Switch {

	public static void main(String[]args){

		Scanner sa = new Scanner(System.in);
		System.out.println("eneter the words");
		String s  = sa.nextLine();
		String[] k = s.split(" ");

		Map<String, Integer> words = new HashMap<String , Integer>();
		for (String st : k) {
			if (words.containsKey(st)) {
			Integer it =words.get(st);
			words.put(st , it+1);
				
			} else {
				
				words.put(st ,1);

			}
			
		}
			
Set<Entry<String,Integer>> entryset = words.entrySet();
for (Entry<String, Integer> entry : entryset) {
	if (entry.getValue()>1) {
		
		String key = entry.getKey();
	Integer value = 	entry.getValue();
	System.out.println(key+"="+value);
		
		
	}
	
}


		}





		}
