package tugas4polymorpism;

public class balok implements rumus{
    
    int panjang,lebar,tinggi;

    public balok(int panjang, int lebar, int tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public int luas(){
        return 2*panjang*lebar+lebar*tinggi*+panjang*tinggi;
    }

    public int volume(){
        return panjang*lebar*tinggi;
    }

    
}