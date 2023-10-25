import matematika.Matematika1;

class MatematikaInheritance {
    public static void main(String[] args) {
        
        Matematika1 matematika2 = new Matematika1();
        
        
        int hasilTambah = matematika2.tambah(5, 3);
        int hasilKurang = matematika2.kurang(5, 3);
        int hasilKali = matematika2.kali(5, 3);
        int hasilBagi = matematika2.bagi(10, 2);
        int hasilModulus = matematika2.modulus(10, 2);
        
        
        System.out.println("Hasil Penjumlahan: " + hasilTambah);
        System.out.println("Hasil Pengurangan: " + hasilKurang);
        System.out.println("Hasil Pengkalian: " + hasilKali);
        System.out.println("Hasil Pembagian: " + hasilBagi);
        System.out.println("Hasil Modulus: " + hasilModulus);
    }
}