package dineshPrograms;

public class StringPro {

	public static void main(String[]args){

		String s1 ="Welcome";
		String s2 ="welcome";

		//String a = s1.length();
		//System.out.println("Length="+a);
		
		boolean b= s1.equals(s2);
		System.out.println(b);
		
		boolean c= s1.equalsIgnoreCase(s2);
		System.out.println(c);
		
		String d = s1.toUpperCase();
		System.out.println(d);
		
		boolean e= s1.endsWith("o");
		System.out.println(e);
		
		char f = s1.charAt(4);
		System.out.println(f);
		
		String g = s1.trim();
		System.out.println(g);
		
		
		String h = s1.substring(2);
		System.out.println(h);
		
		int j = s1.compareTo(s2);
		System.out.println(j);
		
		String[] st =s1.split("a");
		
		for (String str : st) {
			
			System.out.println(str);
			
		}
String s=s1+s2;
		int hq = s.hashCode();
		System.out.println("con="+s+":"+hq);
		
		

		}}