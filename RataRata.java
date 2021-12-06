package Mencobaaa;

import java.util.Scanner;

public class RataRata {

public static void main(String[] args) {
		
	int elemen=4,e1,e2,e3,e4;
	int jumlah,rata;
	Scanner x= new Scanner(System.in);
	System.out.println("masukkan elemen 1 ");
	e1=x.nextInt();
	System.out.println("masukkan elemen 2 ");
	e2=x.nextInt();
	System.out.println("masukkan elemen 3 ");
	e3=x.nextInt();
	System.out.println("masukkan elemen 4 ");
	e4=x.nextInt();
	jumlah=+e1+e2+e3+e4;
	rata=jumlah/elemen;
	System.out.println(rata);
	}

}
