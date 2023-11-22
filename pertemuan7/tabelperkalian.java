package pertemuan7;

import java.util.Scanner;

public class tabelperkalian {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Masukkan nilai n (<= 10): ");
        int n = input.nextInt();

        
        if (n > 10 || n <= 0) {
            System.out.println("Nilai n harus lebih kecil atau sama dengan 10 dan lebih dari 0.");
            return;
        }

        
        System.out.println("Tabel Perkalian " + n + " x " + n + ":");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((i * j) + "\t");
            }
            System.out.println();
        }
    }
}

