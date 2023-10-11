public class Nilai {
    String Nim;
    String Nama;
    double Absen;
    double Tugas;
    double UTS;
    double UAS;

    double nilai(double Absen, double Tugas, double UTS, double UAS)
    {
        return (Absen * 10 / 100) + (Tugas * 20 / 100) + (UTS * 30 / 100) + (UAS * 40 / 100);
    }
    void cetaknilai() {
        System.out.println("Nim = " + Nim);
        System.out.println("Nama = " + Nama);
        System.out.println("Nilai Absen = " + Absen);
        System.out.println("Nilai Tugas = " + Tugas);
        System.out.println("Nilai UTS = " + UTS);
        System.out.println("Nilai UAS = " + UAS);
        System.out.println("Nilai Nilai Akhir = " + nilai(Absen,Tugas,UTS,UAS));
    }
}
