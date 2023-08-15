import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		int[] arr2= {1,2,3,4,5,6};
		ArrayList<String> groups= new ArrayList<String>();
		groups.add("Metallica");
		groups.add("Rock");
		groups.add("Guns");
		groups.add("Black");		
		groups.remove("Rock");
		System.out.println("O.indexs:"+ groups.get(0));
		System.out.println("Arraylist uzunluk:"+groups.size());
		/*for(int i=0;i<groups.size();i++) {
			System.out.println("  ");
			System.out.println(groups.get(i));
		}*/
		for(String s:groups) {
			System.out.println("Eleman: " +s);
		}
		for(int i:arr2) {
			System.out.println(i);
		}
		
		
		
		
		

	}

}
