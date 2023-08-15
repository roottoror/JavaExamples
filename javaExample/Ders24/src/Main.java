class Animal{
	private String name;

	public Animal(String name) {
		//super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void speak() {
		System.out.println(" Hayvan Konuşuyor");
	}
	
}
class Bird extends Animal{

	public Bird(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void speak() {
		System.out.println(getName()+" Ötüyor");
		
	}
}
	
	
	class Dog extends Animal{

		public Dog(String name) {
			super(name);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void speak() {
			System.out.println(getName()+" Avlıyor");
			
		}
	
	
	}
	class Horse extends Animal{

		public Horse(String name) {
			super(name);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void speak() {
			System.out.println(getName()+" Kişniyor");
			
		}
	}






public class Main {
	
    public static void speaktry(Animal animal) {
    	animal.speak();
    }
	public static void main(String[] args) {
		
		//Animal animal=new Animal("Hayvan");
		//Bird bird=new Bird("Limon");
		//Dog dog=new Dog("Karabaş");
		//Horse horse=new Horse("Şahbatur");
		/*animal.speak();
		bird.speak();
		dog.speak();
		horse.speak();*/
		/*Animal animal2=new Dog("Karabaş");
		animal2.speak();*/
		speaktry(new Dog("Karaburun"));
		
	}
}
