
public class MysqlDatabase implements IDatabase{

	@Override
	public void add() {
		System.out.println("Mysql Ekleme");
		
	}

	@Override
	public void delete() {
		System.out.println("Mysql Silme");
		
	}

	@Override
	public void get() {
		System.out.println("Mysql Elde etme");
		
	}

	@Override
	public void update() {
		System.out.println("Mysql Güncelleme");
		
	}
	

}
