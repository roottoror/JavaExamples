import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Break ve Continue
		//Break:Döngüyü sona erdirir.
		//Continue:Altındaki işlemleri yapmadan döngünün en başına gider.
		
		/*while(true) {
			Scanner scan=new Scanner(System.in);
			String s;
			System.out.println("Karakter Griiniz");
			s=scan.nextLine();
			if(s.equals("q")) {
				System.out.println("Programdan çıkılıyor");
				break;
				
			}
			System.out.println("Karakter"+s);*/
		
		int i=0;
		while(i<10) {
			
			if(i<10)
				if(i==4 || i==7) {
					continue;
				}
			
			System.out.println(i);
			i++;

		}
		
		
		

	}

}
