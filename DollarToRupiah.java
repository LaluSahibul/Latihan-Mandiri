//DOLLAR - RUPIAH
package Mencobaaa;
import java.util.Scanner;
public class DollarToRupiah {

	public static void main(String[] args) {
		Scanner x=new Scanner (System.in);
		System.out.println("masukkan jumlah uang: dollar/rupiah");
		double uang=x.nextDouble();
		rupiahToDollar(uang);
		dollarToRupiah(uang);
		

	}
	static double rupiahToDollar(double rupiah) {
		
		int dollar=1;
		double kurs=14351.45;
		double hasil=dollar/kurs*rupiah;
		System.out.println(hasil);
		return hasil;
	}
static double dollarToRupiah(double dollar) {
		
		double kurs=14351.45;
		double hasil=kurs*dollar;
		System.out.println(hasil);
		return hasil;
	}

}
