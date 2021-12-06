package Mencobaaa;
import java.util.Scanner;
public class LogikaLogin {

	public static void main(String[] args) {
	boolean X=true;
		Scanner x=new Scanner(System.in);
		while(X) {
			System.out.print("Masukkan nama pengguna=");
			String nama=x.nextLine();
			System.out.print("masukkan kata sandi=");
			String sandi=x.nextLine();
			if(sandi.equals("Anjing") && nama.equals("Ajis")) {
				System.out.println("anda sukses login");
					X=false;
			}else{
				System.out.println("============================");
				System.out.println("Username atau sandi salah");
				System.out.println("============================");
					X=true;
				
				
	}

}


	}

}
