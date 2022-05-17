package dineshPrograms;

public class MethodOverriding2 extends MethodOveriding{
	
	
	void act() {
		
		System.out.println("vikram is acting");
	}
	
	public static void main(String[] args) {
		
		
		MethodOveriding surya = new MethodOveriding();
		surya.act();
		MethodOverriding2 vikram = new MethodOverriding2();
		vikram.act();
		
		
		
		
	}
}
