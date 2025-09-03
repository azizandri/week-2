package week02.andri.id.ac.umn;

import java.util.Scanner;

public class Tutorialswitch {
	public static void main(String[] args) {
		String grade;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input your grade : ");
		grade = scanner.next();
		
		//Variabel dalam kurung yang akan diuji
		switch(grade.toUpperCase()) {
		//case jika variabel sam dengan case
		case "A" :
			System.out.println("Perfect");
			break;
		case "B" :
			System.out.println("Great");
			break;
		case "C" :
			System.out.println("Cool");
			break;
		case "D" :
			System.out.println("Bad");
			break;
		case "F" :
			System.out.println("Fail");
			break;
			//Jika variabel tidak sama dengan semua case
		default:
			System.out.println("Invalid grade");
		}
		System.out.println("Your grade is " + grade);
		System.out.println();
	}
	 
}
