package Mencobaaa;
import java.util.Scanner;
public class MemaksaJomblo {

public static void main(String[] args) {

	Scanner x=new Scanner (System.in);
	boolean a=true;
	while(a) {
		System.out.println("apakah anda jomblo?");
		System.out.println("masukkan jawaban");
			String jawab=x.next();
				if(jawab.equalsIgnoreCase("iya")) {
					System.out.println("nah gitu dong jgn bohong anjing");
					a=false;
			}

		}


	}

}
