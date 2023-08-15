import java.util.Scanner;

public class Main {
	
    public static void faktoriyel() {
    	
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Sayı değeri:");
    	int sayi=scan.nextInt();
    	int faktoriyel=1;
    	while(sayi>0) {
    		faktoriyel*=sayi;
    		sayi--;
    		
    	}
    	System.out.println("Faktoriyel "+faktoriyel);
    	
    	
    	
    	
    }
	public static void main(String[] args) {
		faktoriyel();		
		
		
		

	}

}
