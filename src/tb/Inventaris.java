package tb;
import java.util.Scanner;
public class Inventaris {
    int p_ruang;
    int l_ruang;
    int j_kursi;
    int j_pintu;
    int j_jendela;
    public void input(){
        Scanner ruang = new Scanner(System.in);
        System.out.println("masukkan panjang : ");
        p_ruang = ruang.nextInt();
        System.out.println("masukkan lebar : ");
        l_ruang = ruang.nextInt();
        System.out.println("masukkan jumlah kursi : ");
        j_kursi = ruang.nextInt();
        System.out.println("masukkan jumlah pintu : ");
        j_pintu = ruang.nextInt();
        System.out.println("masukkan jumlah jendela : ");
        j_jendela = ruang.nextInt();
        
    }
    public void jumlah_kondisi(){
        Scanner stop_kontak=new Scanner(System.in);
        System.out.println("masukkan jumlah stop kontak : ");
        int j_stop = stop_kontak.nextInt();
        for (int i=1;i<j_stop;i++){
            System.out.println("kondisi ="+i);
        }
    }
    public void analisis(){
        if(p_ruang != l_ruang){
            System.out.println("bentuk : persegi panjang");
            System.out.println("sesuai");
        }
        else{
            System.out.println("tidak sesuai");
        }
        
        if(hitung_rasio() >= 0.5){
            System.out.println("sesuai");
        }
        
        if(j_pintu >= 2){
            System.out.println("sesuai");
        }
        if(j_jendela >= 1){
            System.out.println("sesuai");
        }
    }
    public double hitung(){
        return p_ruang * l_ruang;
    }
    public double hitung_rasio(){
        return hitung() / j_kursi;
    }
    public void tampil(){
        System.out.println("hasil luas : "+hitung());
        System.out.println("hasil rasio : "+hitung_rasio());
    }
}