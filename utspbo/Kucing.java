
public class Kucing extends Hewan {
	public Kucing(String jenisSuara) {
		super("Meong");
	}

	public void suara() {
		System.out.println("Suara Kucing: "+jenisSuara);
	}
	
	public void jenis() {
		System.out.println("Hewan ini addalah Mamalia");
	}
}
