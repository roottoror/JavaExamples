import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int bakiye=1000;
		int işlem;
		
		System.out.println("1: Bakiye Görüntüle");
		System.out.println("2: Para Yatırma");
		System.out.println("3: Para Çekme");
		System.out.println("4: Sistemden Çıkış");
		int islem=scan.nextInt();
		switch(islem) {
		case 1:
			System.out.println("Bakiyeniz:"+bakiye+"tl'dir");
			break;
		case 2:
			System.out.println("Ne kadar yatıracaksını?");
			int miktar=scan.nextInt();
			bakiye=bakiye+miktar;
			System.out.println("Bakiyeniz"+bakiye+"tl'dir");
			break;
			
		case 3:
			System.out.println("Ne kadar çekeceksiniz?");
			miktar=scan.nextInt();
			bakiye=bakiye-miktar;
			System.out.println("Bakiyeniz"+bakiye+"tl'dir");
			break;
		case 4:
			System.out.println("Sistemden Çıkılıyor");
		break;
		default:
			System.out.println("Geçersiz işlem");
			break;
		
		
		
		
		}

	}

}
