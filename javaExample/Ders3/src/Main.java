import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		scan.useLocale(Locale.US);
		
		System.out.println("Bir yazi giriniz");
		String a=scan.nextLine();
		System.out.println("a değişkeninin değeri" + a);
		
		
		

	}

}
