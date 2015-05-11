package tb;
import java.util.Scanner;
public class Fakultas {
    Enkapsulasi in = new Enkapsulasi();
    Scanner ruang = new Scanner(System.in);
    public void nama_ruang(){
        in.setData("610", "GKB 3", "Informatika");
    }
    public void ukuran_ruang(){
        in.setData(6, 4);
    }
    public void data_ruang(){
        System.out.println("masukkan jumlah kursi : ");
        in.setJ_kursi(ruang.nextInt());
        System.out.println("masukkan jumlah pintu : ");
        in.setJ_pintu(ruang.nextInt());
        System.out.println("masukkan jumlah jendela : ");
        in.setJ_jendela(ruang.nextInt());
        System.out.println("masukkan jumlah stop kontak : ");
        in.setJ_steker(ruang.nextInt());
        System.out.println("kondisi stop kontak : ");
        in.setKon_steker(ruang.next());
        System.out.println("posisi stop kontak : ");
        in.setPos_steker(ruang.next());
        System.out.println("masukkan jumlah kabel LCD : ");
        in.setJ_kabel_lcd(ruang.nextInt());
        System.out.println("kondisi kabel LCD : ");
        in.setKon_kabel_lcd(ruang.next());
        System.out.println("posisi kable LCD : ");
        in.setPos_kabel_lcd(ruang.next());
        System.out.println("masukkan jumlah lampu : ");
        in.setJ_lampu(ruang.nextInt());
        System.out.println("kondisi lampu : ");
        in.setKon_lampu(ruang.next());
        System.out.println("posisi lampu : ");
        in.setPos_lampu(ruang.next());
        System.out.println("masukkan jumlah kipas angin : ");
        in.setJ_kipas(ruang.nextInt());
        System.out.println("kondisi kipas angin : ");
        in.setKon_kipas(ruang.next());
        System.out.println("posisi kipas angin : ");
        in.setPos_kipas(ruang.next());
        System.out.println("masukkan jumlah AC : ");
        in.setJ_ac(ruang.nextInt());
        System.out.println("kondisi AC : ");
        in.setKon_ac(ruang.next());
        System.out.println("posisi AC : ");
        in.setPos_ac(ruang.next());
        System.out.println("masukkan SSID : ");
        in.setSsid(ruang.next());
        System.out.println("masukkan bandwidth : ");
        in.setBandwidth(ruang.next());
        System.out.println("masukkan jumlah CCTV : ");
        in.setJ_cctv(ruang.nextInt());
        System.out.println("kondisi CCTV : ");
        in.setKon_cctv(ruang.next());
        System.out.println("posisi CCTV : ");
        in.setPos_cctv(ruang.next());
    }
}