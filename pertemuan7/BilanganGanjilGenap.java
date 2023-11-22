package pertemuan7;

public class BilanganGanjilGenap {
    public static void main(String[] args) {
        System.out.println("genap:");
        for (int i = 0; i <= 20; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println("\nganjil:");
        for (int i = 1; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
    }
}
