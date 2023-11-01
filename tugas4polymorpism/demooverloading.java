package tugas4polymorpism;

public class demooverloading {
    public static void main(String[] args) {
     balok b = new balok(2, 3, 4);
     kubus k = new kubus(3);

        System.out.println("perhitungan balok");
        System.out.println("Volume balok= "+b.volume());
        System.out.println("luas Balok= "+b.luas());
        System.out.println();
        System.out.println("Perhitungan Kubus");
        System.out.println("Volume Kubus= "+k.volume());
        System.out.println("Luas Kubus = "+k.luas());

    }
    
}