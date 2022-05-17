package dineshPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Demo {

	public static void main(String[] args) {
		list_Iterator();
		
		List<Integer> li = new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		
	Iterator<Integer> iterator =  li.iterator();
	
	while (iterator.hasNext()) {
		//System.out.println(iterator.next());
		
		
	}
	}
	
	public static void list_Iterator() {
		
		List<Integer> li = new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		
	ListIterator<Integer> iterator =  li.listIterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		while (iterator.hasPrevious()) {
			System.out.println(iterator.previous());
			
		}
		
		
		
		
	}

}
