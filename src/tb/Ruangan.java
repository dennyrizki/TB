package tb;
import java.util.Scanner;
public class Ruangan extends Fakultas {
    Scanner r = new Scanner(System.in);
    Enkapsulasi on = new Enkapsulasi();

    public void kebersihan(){
        System.out.println("kondisi lantai : ");
        on.setKon_lantai(r.next());
        System.out.println("kondisi dinding : ");
        on.setKon_dinding(r.next());
        System.out.println("kondisi atap : ");
        on.setKon_atap(r.next());
        System.out.println("kondisi pintu : ");
        on.setKon_pintu(r.next());
        System.out.println("kondisi jendela : ");
        on.setKon_jendela(r.next());
    }
    public void lingkungan(){
        System.out.println("sirkulasi udara : ");
        on.setSir_udara(r.next());
        System.out.println("pencahayaan : ");
        on.setPencahayaan(r.nextInt());
        System.out.println("kelembapan : ");
        on.setKelembapan(r.nextDouble());
        System.out.println("suhu : ");
        on.setSuhu(r.nextDouble());
    }
    public void kenyamanan(){
        System.out.println("kebisingan : ");
        on.setKebisingan(r.next());
        System.out.println("bau : ");
        on.setBau(r.next());
        System.out.println("kebocoran : ");
        on.setKebocoran(r.next());
        System.out.println("kerusakan : ");
        on.setKerusakan(r.next());
        System.out.println("keausan : ");
        on.setKeausan(r.next());
    }
    public void keamanan(){
        System.out.println("kekokohan : ");
        on.setKekokohan(r.next());
        System.out.println("kunci pintu : ");
        on.setKunci_pintu(r.next());
        System.out.println("kunci jendela : ");
        on.setKunci_jendela(r.next());
        System.out.println("keamanan : ");
        on.setKeamanan(r.next());
    }
}