public class InformasiNilaiMahasiswa {
    public static void main(String[] args) {
        Nilai NilaiMahasiswa = new Nilai();
        NilaiMahasiswa.Nim = "2210631170119";
        NilaiMahasiswa.Nama = "Fakhri Rifqi Fahreza";
        NilaiMahasiswa.NilaiAbsen = 89;
        NilaiMahasiswa.NilaiTugas = 50;
        NilaiMahasiswa.NilaiUAS = 43;
        NilaiMahasiswa.NilaiUTS = 67;
        NilaiMahasiswa.nilai(NilaiMahasiswa.NilaiAbsen, NilaiMahasiswa.NilaiTugas, NilaiMahasiswa.NilaiUAS, NilaiMahasiswa.NilaiUTS);
        NilaiMahasiswa.printnilai();
    }
}
