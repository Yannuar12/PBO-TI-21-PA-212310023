import java.util.Date;
import java.util.Scanner;

public class Latihan10 {
	public static void main(String[] args) {
		int harga = 6300;
		String barang = "ROTI ENAK";
		
		System.out.println("===========================================");
		System.out.println("  Selamat datang di TOKO SERBAGUNA IBIK ");
		System.out.println("===========================================");
		System.out.println("  ");
		
		Scanner keyboard = new Scanner(System.in);
		Students s = new Students();
		System.out.print("Masukkan jumlah produk yang dibeli : ");
		int input = keyboard.nextInt();
		
		System.out.println("  ");
		Date waktu = new Date();
		System.out.println(waktu.toString());
		System.out.println("===========================================");
		System.out.print("ITEM");
		System.out.print("\t\t QTY");
		System.out.print("\t HARGA");
		System.out.println("\t    TOTAL");
		System.out.println("===========================================");
		System.out.print(barang);
		System.out.print("\t  " + input);
		System.out.print("\t Rp." + harga);
		
		int total = harga * input;
		System.out.println("   Rp." + total);
		System.out.println("-------------------------------------------");
		
		int disc = 5;
		int potongan = total - (total / 100 * (disc * (input / 3)));
		if(input % 3 == 0) {
			System.out.print("Diskon : ");
			System.out.println(disc * (input/3) + "%");
			System.out.print("Sub Total : ");
			System.out.println(potongan);
			} 
				else if (input % 3 != 0) {
				System.out.print("Diskon : ");
				System.out.println(disc * (input/3) + "%");
				System.out.print("Sub Total : ");
				System.out.println(potongan);
			}
		
		System.out.println("  ");
		System.out.print("Member Name :");
		System.out.println(s.getFullname(" Septiawan Pratama"));
		keyboard.close();
	}
}

class Students {
	
	String getFullname(String Fullname) {
		System.out.println(Fullname);
		return Fullname;
	}

	public void getNpm(int i) {
		// TODO Auto-generated method stub
		
	}

	public void getClassname(String next) {
		// TODO Auto-generated method stub
		
	}

	public float getGpa(float nextFloat) {
		return nextFloat;
		// TODO Auto-generated method stub
		
	}

	public void getNpm(boolean hasNextInt) {
		// TODO Auto-generated method stub
		
	}
	
}

