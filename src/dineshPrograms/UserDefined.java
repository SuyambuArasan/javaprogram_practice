package dineshPrograms;

public class UserDefined {

	public static void main(String[] args) throws User {

		int a = 10;
		
		try {
			if(a>18) {
				System.out.println("true");
				
			}
			else {
			throw new User ("Dinesh exception");
				
			}
		} catch (User  e) {
			//e.printStackTrace();
			System.out.println(e);
		}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
