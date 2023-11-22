package pertemuan7;

public class BilanganPrima {
    public static boolean cekPrima(int num) {
        if (num > 1) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Deret bilangan prima:");
        for (int i = 0; i <= 20; i++) {
            if (cekPrima(i)) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nDeret bilangan bukan prima:");
        for (int i = 0; i <= 20; i++) {
            if (!cekPrima(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
