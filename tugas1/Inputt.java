
import java.util.Scanner;
public class Inputt {
    public static void main( String[] args ){
        Scanner masukan = new Scanner(System.in);
    System.out.print("Masukkan Nama Anda: ");
        String nama = masukan.nextLine();
        System.out.println("Halo, Salam Kenal sdr " + nama +"!");
        
    System.out.print("Masukkan Prodi Anda: ");
        String prodi = masukan.nextLine();
        System.out.println("Prodi saya " + prodi +"!");
        
    System.out.print("Masukkan Semester Anda: ");
        String semester = masukan.nextLine();
        System.out.println("Halo, Salam Kenal saya dari semester " + semester +"!");
        
    System.out.print("Masukkan Target Ipk anda: ");
        String target = masukan.nextLine();
        System.out.println("Target Ipk saya  " +target  +"!");
    }
}