
public class Main {
	
	
	public static int ucilecarp(int a) {
		return a*3;
	}
	public static int ikitopla(int a) {
		return a+2;
	}
	
	public static int dortcikart(int a) {
		return a-4;
	}

	public static void main(String[] args) {
		
		System.out.println(dortcikart(ikitopla(ucilecarp(4))));
	}

}
