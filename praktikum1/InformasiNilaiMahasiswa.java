public class InformasiNilaiMahasiswa {
    public static void main(String[] args) {
        Nilai NilaiMahasiswa = new Nilai();
        NilaiMahasiswa.Nim = "2210631170119";
        NilaiMahasiswa.Nama = "Fakhri Rifqi Fahreza";
        NilaiMahasiswa.Absen = 89;
        NilaiMahasiswa.Tugas = 50;
        NilaiMahasiswa.UAS = 43;
        NilaiMahasiswa.UTS = 67;
        NilaiMahasiswa.nilai(NilaiMahasiswa.Absen, NilaiMahasiswa.Tugas, NilaiMahasiswa.UAS, NilaiMahasiswa.UTS);
        NilaiMahasiswa.cetaknilai();
    }
}
