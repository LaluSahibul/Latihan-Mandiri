package Mencobaaa;

public class MenghitungKeuntungan {
//menghitung jumlah keuntungan dan harga diskon
	public static void main(String[] args) {
		// Ibul membeli ikan dipasar sebanyak 10 ekor dengan harga 10000 dengan mendapatkan diskon 4%
		//ikan tersebut dijual dengan harga 15000 berapa total pengeluaran dan keuntungannya
	int hargaikan=10000,jumlahikan=10,diskon=4,jualikan=15000;
	int hargaasli=hargaikan*jumlahikan;
	int hargadiskon=hargaasli-(hargaasli*diskon/100);
	int hargajual=jumlahikan*jualikan;
	int untung=hargajual-hargadiskon;
	System.out.println("keuntungannya adalah "+untung);
	System.out.println("jumlah pengeluaran "+hargadiskon);
	System.out.println("total harga jual "+hargajual);

	}

}
