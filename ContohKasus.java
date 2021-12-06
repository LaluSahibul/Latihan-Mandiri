package Mencobaaa;
import java.util.Scanner;
public class ContohKasus {
//gabungan if else switch case dan looping
	public static void main(String[] args) {
		
		boolean ibul=true;
		String kntl;
		Scanner x=new Scanner(System.in);
		int p1,p2,dis=4;
		System.out.println("masukkan jumlah paket ");
		p1=x.nextInt();
		System.out.println("berapa tambahan paket ");
		p2=x.nextInt();
		int a=p1*165,b=p2*100,jp=p1+p2;
		int harga1=a,harga2=b-(b*dis/100);
		int keluar=harga1+harga2,total=jp*165,untung=total-keluar;
		while (ibul) {
			System.out.println("apkah perbuatan itu baik atau salah?");
			kntl=x.nextLine();
			if(kntl.equalsIgnoreCase("salah"))
				ibul=false;
		}
		System.out.println("apakah bambang bertobat ");
		String pilihan=x.nextLine();
		switch (pilihan) {
		case "ya":
			System.out.println("Alhamdulillah");
			System.out.println("bambang membakar semua paket tersebut");
			break;
		case "tidak":
			System.out.println("inalillah hiwainnailai hiroziun");
			System.out.println("total pengeluaran bambang= "+keluar);
			System.out.println("keuntungan bambang= "+untung);
			break;
		}

	}
}