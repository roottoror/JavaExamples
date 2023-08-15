
public class Main {

	public static void skorHesapl(String name,int score) {
		System.out.println(name+" isimli oyuncunun puanı: "+ score);
	}
	
	public static void skorHesapl(int score) {
		System.out.println(" isimsiz oyuncunun puanı: "+ score);
	}
	
	
	
	public static void main(String[] args) {
		skorHesapl("Ali", 1000);
		skorHesapl(500);
		
		
		
		

	}

}
