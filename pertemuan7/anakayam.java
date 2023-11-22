package pertemuan7;

public class anakayam {
    public static void main(String[] args) {
        int jumlahanakayam = 5;  // Ganti dengan jumlah anak ayam yang diinginkan
        System.out.println("Lagu Anak Ayam Turun " + jumlahanakayam);

        for (int i = jumlahanakayam; i > 0; i--) {
            if (i == 1) {
                System.out.println("Anak ayam turun " + i + ", mati satu tinggal induknya.");
            } else {
                System.out.println("Anak ayam turun " + i + ", mati satu tinggal " + (i - 1) + ".");
            }
        }
    }
}

