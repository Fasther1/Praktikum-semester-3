
public class Anjing extends Hewan{
	public Anjing(String jenisSuara) {
		super("gug-gug");
	}
	
	public void suara() {
		System.out.println("Suara Anjing: "+jenisSuara);
	}
	
	public void jenis() {
		System.out.println("Hewan ini adalah Mamalia");
	}

}
