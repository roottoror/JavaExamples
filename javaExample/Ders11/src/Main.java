import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int sayi=scan.nextInt();
	int toplam=0;
	do {
		toplam+=sayi%10;
		sayi=sayi/10;
		System.out.println("Toplam="+toplam+"sayi= "+ sayi);
		
	}while(sayi>0);
	System.out.println("Toplam= "+ toplam);
			
		
		
		
		
		
		
		
		
		
		
	
		

	}

}
