package Mencobaaa;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner x = new Scanner (System.in);
		System.out.println("=======================");
		System.out.println("NENU");
		System.out.println("=======================");
		System.out.println("1. Ayam Goreng\n2. Nasi Goreng\n3. Sup Sayur\n4. Rendang");
		System.out.println("Masukkan menu pilihan");
		int i = x.nextInt();
		switch (i) {
		case 1:
			System.out.println("harganya 2000");
			break;
		case 2:
			System.out.println("harganya 7799");
			break;
		case 3:
			System.out.println("harganya 74400");
			break;
		case 4:
			System.out.println("harganya 53790");
			break;
		default:
			System.out.println(" masukkan angka sesuai menu 5");
		}
	}

}
