import java.util.Scanner;

public class LatihanPertama {

	public static void main(String[] args) {
		Integer number_1; //low value => 126 ~ 127
		int number = 20; //big value => 32bit
		String fullname= "Hai ini saya"; //berupa karakter
		//tipe data desimal
		float decimal; //bilangan koma 0.5
		boolean retuurrn; //true or false
						  //long =>2e
						  //double
		
			//deklarasi nilai number
			number =80;
			decimal =70;
			double decimal2 =2.5;
			//operator
			int jumlah = number * number;
			float jumlah2 = number + decimal;
			
			System.out.println("Var number = "+number);
			System.out.println("var decimal = "+decimal);
			System.out.println("var decimal2 = "+decimal2);
			System.out.println("--------------");
			System.out.println("Sample Operator");
			System.out.println("------------------");
			System.out.println("Perkalian = "+ jumlah);
			System.out.println("Penjumlahan "+number+"+"+decimal+"="+jumlah2);
			
			//input
			Scanner input= new Scanner(System.in);
			int angka = input.nextInt(); //input angka/ integer
			System.out.println("Nama anda adalah "+fullname);
			
			input.close(); //close
			Penjumlahan();
	}
	
	
	void Penjumlahan() {
		int x, y;
		Scanner Input = new Scanner(System.in);
		System.out.print("masukan X");
		x = Input.nextInt();
		
		System.out.print("masukan y");
		y = Input.nextInt();
		
		System.out.println("x + y="+(x+y));
		Input.close();
	}
	

