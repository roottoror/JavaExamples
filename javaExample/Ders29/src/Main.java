
public class Main {
	
	public static void deneme() {
		System.out.println("Deneme");
	}

	public static void main(String[] args) {
		Student student1=new Student();
		Student student2=new Student();
		Student student3=new Student();
		System.out.println("Öğrenci Sayısı: "+student1.no_of_students);
		System.out.println(Student.deneme());
		
		deneme();
		

		

	}

}
