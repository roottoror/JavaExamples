import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
			Scanner scanner=new Scanner(System.in);
	
		int[] arr1= {10,20,30,40,50};
		int[] arr2=new int[5];
		arr2[0]=1;
		arr2[1]=2;
		arr2[2]=3;
		arr2[3]=4;
		arr2[4]=5;
		//System.out.println("Array 2'nin Birinci Elemanı "+arr2[0]);
		
		/*for(int i=0;i<arr1.length;i++) {
			System.out.println("Eleman: "+arr1[i]);	
		}*/
		System.out.println("Array2'nin değerlerini girin...");
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=scanner.nextInt();
			
		}
		System.out.println("Array2'nin değerleri yazılıyor");
		for(int i=0;i<arr2.length;i++) {
			System.out.println("Eleman "+arr2[i]);
			
		}

	}

}
