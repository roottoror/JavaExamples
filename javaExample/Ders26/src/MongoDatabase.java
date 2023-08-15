
public class MongoDatabase implements IDatabase {

	@Override
	public void add() {
		System.out.println("Mongodb Ekleme");
		
	}

	@Override
	public void delete() {
		System.out.println("Mongodb silme");
		
	}

	@Override
	public void get() {
		System.out.println("Mongodb elde etme");
		
	}

	@Override
	public void update() {
		System.out.println("Mongodb güncelleme");
		
	}

}
