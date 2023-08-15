import java.util.Scanner;

public class Car {
	// Fields ya da Properties denir.
	private String color;
	private String model;
	private double engine;
	private int doors;
	
	
	public Car(String color,String model) {
		this(color,model,0,0);		
	}
	
	
	public Car() {
		/*this.color="Bilgi Yok";
		this.model="Bilgi Yok";
		this.engine=0;
		this.doors=0;*/ //Diğer bir yöntem aşağıda yazıldı.
		this("Bilgi yok","Bilgi Yok",0,0);
		
		
		
		
	}
	
	public Car(String color,String model,double engine,int doors) {
		this.color=color;
		this.model=model;
		this.engine=engine;
		this.doors=doors;
	}
	public void showInfos() {
		 System.out.println("Arabanın Rengi "+this.color);
		 System.out.println("Arabanın Modeli "+this.model);
		 System.out.println("Arabanın Motor Hacmi "+this.engine);
		 System.out.println("Arabanın Kapı Sayısı " +this.doors);
	}

	public void setColor(String color) {
		this.color = color;

	}

	public String getColor() {
		return this.color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getEngine() {
		return engine;
	}

	public void setEngine(double engine) {
		this.engine = engine;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}
	
	public void start() {
		System.out.println("Araba çalıştı");
	}
	public void stop() {
		System.out.println("Araba Durdu");
	}
	
	public void benzin() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Benzin Litreisini Giriniz");
		int benzin_litre=scan.nextInt();
		if(benzin_litre>=100) {
			System.out.println("Benzininiz var");
		}else {
			System.out.println("Benzin Alınız");
		}
		
		
		
	}
	
	

}
