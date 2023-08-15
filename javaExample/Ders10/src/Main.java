import java.util.Scanner;

public class Main {
														
	public static void main(String[] args) {
		int i=10;
		while(i>0) {
			System.out.println("Java");
			i-=2;
		}
		System.out.println("Döngü Bitti"+i);
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Sayıyı Giriniz");
		int sayi=scan.nextInt();
		int faktoriyel=1;
		while(sayi>=1) {
			faktoriyel=faktoriyel*sayi;
			sayi--;
			
		}
	System.out.println(faktoriyel);


	}

}
