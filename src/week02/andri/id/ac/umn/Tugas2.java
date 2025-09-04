package week02.andri.id.ac.umn;

import java.util.Scanner;
public class Tugas2 {
	public static void main(String[] arg) {
		Scanner scanner = new Scanner (System.in);
		
		while (true) {
			System.out.println("Masukkan angka prima (0 untuk keluar): ");
			int angka = scanner.nextInt();
			
			if(angka == 0) {
				System.out.println("Program selesai. Terima kasih");
				break;
			}
			
			if(isPrima(angka)) {
				System.out.println("Angka " + angka + " adalah angka prima");
			} else {
				System.out.println("Angka " + angka + " bukan angka prima");
			}
			System.out.println();
		}
		scanner.close();
	}
	static boolean isPrima(int n) {
		if (n <= 1) return false;
		for (int i = 2; i <=Math.sqrt(n); i++) {
			if (n % i == 0) return false;
		}
		return true;
	}
	
}
