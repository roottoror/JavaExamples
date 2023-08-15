import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Kullanıcı Adı Girişi
		
		String sys_kul_adı="Admin";
		String parola="12345";
		System.out.println("Kullanıcı Adınızı Giriniz");
		
		Scanner scan=new Scanner(System.in);
		String kullanıcı_adı=scan.nextLine();
		
		System.out.println("Şifrenizi Griniz");
		Scanner scan2=new Scanner(System.in);
		String kul_parola=scan.nextLine();
		
		if(!(sys_kul_adı.equals(kul_parola)) && !(parola.equals(kul_parola))) {
			System.out.println("Kullanıcı Adı ve Parola Yanlış");
			
		}else if((sys_kul_adı.equals(kul_parola)) && !(parola.equals(kul_parola))) {
			System.out.println("Parola Yanlış");
			
		}
		else if(!(sys_kul_adı.equals(kul_parola)) && !(parola.equals(kul_parola))) {
			
			System.out.println("Kullanıcı Adı Yanlış");
		}
		else {
			System.out.println("Giriş Başarılı");
		}
		
		
		
		
		
		

	}

}
