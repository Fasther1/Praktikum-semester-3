package pertemuan7;

public class BilanganPrima {
    public static boolean cekPrima(int num) {
        if (num > 1) {
            int i = 2;
            do {
                if (num % i == 0) {
                    return false;
                }
                i++;
            } while (i < num);
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Deret bilangan prima:");
        int i = 0;
        do {
            if (cekPrima(i)) {
                System.out.print(i + " ");
            }
            i++;
        } while (i <= 20);

        System.out.println("\nDeret bilangan bukan prima:");
        i = 0;
        do {
            if (!cekPrima(i)) {
                System.out.print(i + " ");
            }
            i++;
        } while (i <= 20);
    }
}
