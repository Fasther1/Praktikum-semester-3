
public class Hewan {
	protected String jenisSuara;
	
	public Hewan(String jenisSuara) {
		this.jenisSuara = jenisSuara;
	}
	
	public void suara() {
		System.out.println("Bersuara: "+jenisSuara);
	}
}
