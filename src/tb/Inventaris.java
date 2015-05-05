package tb;
import java.util.Scanner;
public class Inventaris extends Input {
    Scanner ruang = new Scanner(System.in);
    Input in = new Input();
    public void input(){
        System.out.println("masukkan ruang : ");
        in.setRuang(ruang.next());
        System.out.println("masukkan lokasi ruang : ");
        in.setLokasi_ruang(ruang.next());
        System.out.println("masukkan fakultas / program studi : ");
        in.setProdi(ruang.next());
        System.out.println("masukkan panjang : ");
        in.setP_ruang(ruang.nextInt());
        System.out.println("masukkan lebar : ");
        in.setL_ruang(ruang.nextInt());
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
    
    public void kebersihan(){
        System.out.println("kondisi lantai : ");
        in.setKon_lantai(ruang.next());
        System.out.println("kondisi dinding : ");
        in.setKon_dinding(ruang.next());
        System.out.println("kondisi atap : ");
        in.setKon_atap(ruang.next());
        System.out.println("kondisi pintu : ");
        in.setKon_pintu(ruang.next());
        System.out.println("kondisi jendela : ");
        in.setKon_jendela(ruang.next());
    }
    public void lingkungan(){
        System.out.println("sirkulasi udara : ");
        in.setSir_udara(ruang.next());
        System.out.println("pencahayaan : ");
        in.setPencahayaan(ruang.nextInt());
        System.out.println("kelembapan : ");
        in.setKelembapan(ruang.nextDouble());
        System.out.println("suhu : ");
        in.setSuhu(ruang.nextDouble());
    }
    public void kenyamanan(){
        System.out.println("kebisingan : ");
        in.setKebisingan(ruang.next());
        System.out.println("bau : ");
        in.setBau(ruang.next());
        System.out.println("kebocoran : ");
        in.setKebocoran(ruang.next());
        System.out.println("kerusakan : ");
        in.setKerusakan(ruang.next());
        System.out.println("keausan : ");
        in.setKeausan(ruang.next());
    }
    public void keamanan(){
        System.out.println("kekokohan : ");
        in.setKekokohan(ruang.next());
        System.out.println("kunci pintu : ");
        in.setKunci_pintu(ruang.next());
        System.out.println("kunci jendela : ");
        in.setKunci_jendela(ruang.next());
        System.out.println("keamanan : ");
        in.setKeamanan(ruang.next());
    }
    
    public double hitung(){
        return in.getP_ruang() * in.getL_ruang();
    }
    public double hitung_rasio(){
        return hitung() / in.getJ_kursi();
    }
    public void tampil(){
        System.out.println("hasil luas : "+hitung());
        System.out.println("hasil rasio : "+hitung_rasio());
    }
}