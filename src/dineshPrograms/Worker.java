package dineshPrograms;

public class Worker extends Abstract_concepts2 {

	public static void main(String[] args) {

		Worker w = new Worker();
		w.getHikes();
		w.getLeaves();
		w.work();
	}

	public void work() {
		System.out.println("Smart work");	
	}

}
