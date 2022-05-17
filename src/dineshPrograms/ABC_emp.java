package dineshPrograms;

import dineshPrograms.Family_rules.famrules;
import dineshPrograms.Interface_Concepts.employeesrules;

public class ABC_emp implements employeesrules,famrules{

	public static void main(String[] args) {
		
		//how to call method by object creation
		
		ABC_emp abc = new ABC_emp();
		
		abc.maintainhrs();
		abc.locate();
		abc.report();
		abc.dress();
		System.out.println();
		System.out.println(employeesrules.salary);
		System.out.println();
		abc.help();
		abc.enjoy();
		System.out.println();
		System.out.println(famrules.enjoy);
		
		famrules father = new ABC_emp();
		father.enjoy();
		

		
	}

	public void maintainhrs() {
		
		System.out.println("120hrs");
		
	}

	public void locate() {
		System.out.println("locate to bangalore");
		
	}

	public void report() {
		
		System.out.println("Report to team lead");
		
	}

	public void dress() {
		System.out.println("no dress codes");
		
	}

	public void help() {
		System.out.println("all help");
	}

	public void enjoy() {
		System.out.println("enjoy every moment");
	}

}
