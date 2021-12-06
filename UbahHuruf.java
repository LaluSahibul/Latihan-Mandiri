package Mencobaaa;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class UbahHuruf {

	public static void main(String[] args) {
		
		//Mengubah huruf dari kalimat ke huruf yang berada di depan huruf tersebut

		Scanner x= new Scanner (System.in);
		System.out.println("masukkan teks");
		String kalimat=x.nextLine();
		ubahHuruf(kalimat);
	}
	static void ubahHuruf(String teks) {
		String abjad="  abcdefghijklmnopqrstuvwxyz ";
		String data[]=teks.split("");
		String data2[]=abjad.split("");
		List<String> storeText=new ArrayList<String>();
		String hasil="";
		for(int i=0;i<data.length;i++) {
			int cariIndex=abjad.indexOf(data[i])+1;
			storeText.add(data2[cariIndex]);
		}
		for (int i=0;i<storeText.size();i++) {
			hasil=hasil+storeText.get(i);
		}
		System.out.println(hasil);
	}
}
