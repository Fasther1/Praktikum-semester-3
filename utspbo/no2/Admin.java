package no2;
import java.util.List;
public class Admin extends Pengguna {
	public Admin(String nama) {
		super(nama);
	}

	public void cekcase() {
		System.out.println("Admin "+nama);	
	}
	
	public void listBuku(List<Buku> daftarBuku) {
		System.out.println("Daftar Buku: ");
		for (Buku buku : daftarBuku) {
			System.out.println(buku);
		}
	}

}
