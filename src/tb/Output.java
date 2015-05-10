package tb;
public class Output {
    Analisis in = new Analisis();
    public void tampil(){
        System.out.println("hasil luas : "+in.hitung());
        System.out.println("hasil rasio : "+in.hitung_rasio());
    }
}