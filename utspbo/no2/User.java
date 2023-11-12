package no2;
import java.util.List;
public class User extends Pengguna {
	public User(String nama) {
		super(nama);
	}
	
	public void cekcase() {
		System.out.println("User "+nama);	
	}
	
	public void listBuku(List<Buku> daftarBuku) {
		System.out.println("Daftar Buku: ");
		for (Buku buku : daftarBuku) {
			System.out.println(buku);
		}
	}
}
