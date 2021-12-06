package Mencobaaa;

public class LatihanSabtu {

	public static void main(String[] args) {
		
		int tomat=10;
		int harga=7000;
		int hjual=9000;
		int byrkos=4/100;
		int htotal=tomat*harga;
		int hjualtotal=hjual*tomat;
		int a=hjualtotal*3/100;
		int potongan=hjualtotal-a;
		int keuntungan=hjualtotal-htotal-a;
		System.out.println("total pengeluaran donny adalah "+htotal);
		System.out.println("donny mrmbayarkos sebanyak "+a);
		System.out.println("sisa uang donny adalah "+potongan);
		if(potongan>htotal) {
			System.out.println("donny untung "+keuntungan);
		}
		else {
			System.out.println("donny rugi");
		}
		
	}

}