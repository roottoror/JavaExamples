
public class OracleDatabase implements IDatabase{

	@Override
	public void add() {
		System.out.println("Oracle Ekleme");
		
	}

	@Override
	public void delete() {
		System.out.println("Oracle Silme");
		
	}

	@Override
	public void get() {
		System.out.println("Oracle Elde etme");
		
	}

	@Override
	public void update() {
		System.out.println("Oracle Güncelleme");
		
	}

}
