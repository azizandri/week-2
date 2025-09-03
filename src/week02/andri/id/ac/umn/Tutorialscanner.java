package week02.andri.id.ac.umn;

import java.util.Scanner;

public class Tutorialscanner {

	public static void main(String[] args) {
		int umur;
		String nama;
		
		// Inisialisasi objek Scanner
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nama: ");
		nama = scanner.next();
		
		System.out.print("Umur: ");
		umur = scanner.nextInt();
		
		System.out.println("-------------------");
		System.out.println("Nama : " + nama);
		System.out.println("Umur : " + umur);		
	}

}