public class Nilai {
    String Nim;
    String Nama;
    double NilaiAbsen;
    double NilaiTugas;
    double NilaiUTS;
    double NilaiUAS;

    double nilai (double NilaiAbsen, double NilaiTugas, double NilaiUTS, double NilaiUAS)
    {
        return (NilaiAbsen * 10 / 100) + (NilaiTugas * 20 / 100) + (NilaiUTS * 30 / 100) + (NilaiUAS * 40 / 100);
    }
    void printnilai() {
        System.out.println("Nim = " + Nim);
        System.out.println("Nama = " + Nama);
        System.out.println("NilaiAbsen = " + NilaiAbsen);
        System.out.println("NilaiTugas = " + NilaiTugas);
        System.out.println("NilaiUTS = " + NilaiUTS);
        System.out.println("NilaiUAS = " + NilaiUAS);
        System.out.println("Nilai Akhir = " + nilai(NilaiAbsen,NilaiTugas,NilaiUTS,NilaiUAS));
    }
}
