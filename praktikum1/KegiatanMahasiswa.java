public class KegiatanMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();

        System.out.println("Mahasiswa sedang beraksi:");
        System.out.println("------------------------------------");

        mahasiswa.membaca();
        mahasiswa.nyontek();
        mahasiswa.modifikasi();
    }
}
