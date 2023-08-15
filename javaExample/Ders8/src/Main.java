import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir Sayi Giriniz:");
		int sayi = scan.nextInt();
		
		switch(sayi) {
		case 1:
			System.out.println("Sayi 1");
			break;
		case 2:
			System.out.println("Sayi 2");
			break;
		case 3:
			System.out.println("Sayi 4");
		case 4:
			System.out.println("Sayi 5");
			break;
			default:
				System.out.println("Geçersiz");
				break;
		}

	}

}
