class MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika matematika = new Matematika();
        int a = 20;
        int b = 10;

        int hasilPertambahan = matematika.pertambahan(a, b);
        int hasilPengurangan = matematika.pengurangan(a, b);
        int hasilPerkalian = matematika.perkalian(a, b);
        int hasilPembagian = matematika.pembagian(a, b);

        System.out.println("Pertambahan : " + a + "+" + b + " = " + hasilPertambahan);
        System.out.println("Pengurangan : " + a + "-" + b + " = " + hasilPengurangan);
        System.out.println("Perkalian : " + a + "*" + b + " = " + hasilPerkalian);
        System.out.println("Pembagian : " + a + "/" + b + " = " + hasilPembagian);
    }
}