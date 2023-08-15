import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Notunuzu Giriniz: ");
		int note=scan.nextInt();
		
		if(note>90) {
			System.out.println("Dersten Geçtiniz... Notunuz AA");
		}
		else if(note>85) {
			System.out.println("Dersten Geçtiniz... Notunuz BA");
		}
		
		else if(note>80) {
			System.out.println("Dersten Geçtiniz... Notunuz BB");
		}
		
		
		else {
			System.out.println("Kaldınız");
		}
		
		

	}

}
