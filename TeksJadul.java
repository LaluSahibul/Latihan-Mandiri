package Mencobaaa;

import java.util.Scanner;

public class TeksJadul{

	public static void main(String[] args){

		Scanner x=new Scanner(System.in);
		System.out.println("==teks==");
		String a=x.nextLine();
		teksDjadoel(a);	
	}
	
static String teksDjadoel(String teks) {
	
	String w="j", x="dj", y="oe", z="tj",a="c",b="j",c="u",d="y", k;
	
	k=teks.replace(b, x).replace(c, y).replace(d, w).replace(a, z);
	
	System.out.println("________________________________________________________________________________________________________________________________________________________________________");
	System.out.println("");
	System.out.println(k);
	
	return k;
	}
}
