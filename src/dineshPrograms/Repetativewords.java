package dineshPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Repetativewords {

	public static void main(String[] args) {
		
		Scanner sa = new Scanner(System.in);
		
		final double product_price  = 10;
		final double product_tax = 0.10;
		 double item , tax , selected;
		 
		 System.out.println("enter the item price:");
		 item = sa.nextDouble();
		 
		 tax = item*product_tax;
		 selected = item*product_price;
		 
		 System.out.println("tax of the product:"+tax);
		 System.out.println("selected items :"+selected);
		
		 double totals = item+tax+selected;
		 System.out.println("total price:"+totals);
			

}
}