
public class Main {

	public static void main(String[] args) {
	
	/*Employee employee=new Employee("Ali","Bilişim",40000);
	Employee employee2=new Employee("Hasan","Muhasebe",50000);
	employee.showInfos();
	employee2.showInfos();*/
		Manager manager=new Manager("Hasan","Bankacı",2000,10);
		/*manager.showInfos();
		manager.raiseSalary(1000);*/
		//System.out.println(manager.toString());
		Employee employee = new Manager("İlhan","Mühendis",100000, 10);
		employee.showInfos();
		
		
	}

}
