package Mencobaaa;
import java.util.Scanner;
public class LoopingDanBoolean {
//gabungin if else if dan perulangan

	public static void main(String[] args) {
		int a=0;
		boolean b=true;
		Scanner x = new Scanner (System.in);
		while(b) {
			System.out.print("masukkan jenis kelamin ");
			String jk=x.nextLine();
			if(jk.equalsIgnoreCase("laki laki")) {
				System.out.println("dia laki laki");
				a++;
				b=false;
			}else if (jk.equalsIgnoreCase("perempuan")) {
			System.out.println("dia perempuan");
			a++;
			b=false;
			}else {
			System.out.println("anda salah memasukkan jenis kelamin");
			System.out.println(">>>>>>");
			}
		}	
	}

}
