package Mencobaaa;

public class BesarKecilRata {

	public static void main(String[] args) {
		
		int[]nilai= {2,15,100,85,3};
		int terbesar=nilai[0];
		int terkecil=nilai[0];
		double jumlah=0;
		for(int i=0;i<nilai.length;i++) {
			jumlah=jumlah+nilai[i];
			if(terbesar<nilai[i]) {
				terbesar=nilai[i];
			}
			else if (terkecil>nilai[i]) {
				terkecil=nilai[i];
			}else {
				
			}
		}
		double rata=jumlah/nilai.length;
		System.out.println(terbesar+" adalah nilai terbesar");
		System.out.println(terkecil+" adalah nilai terkecil");
		System.out.println(rata+" adalah nilai rata - rata");
		System.out.println("dan kamu sangat bernilai untukku :)");
	}

}
