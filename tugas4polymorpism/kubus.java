package tugas4polymorpism;

public class kubus implements rumus{
    int sisi;

    public kubus (int sisi){
        this.sisi=sisi;
    }

    public int luas(){
        return 6*sisi*sisi;
    }

    public int volume(){
        return sisi*sisi*sisi;
    }
}
