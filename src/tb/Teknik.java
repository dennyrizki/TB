package tb;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class Teknik extends Fakultas {
    Scanner r = new Scanner(System.in);
    Enkapsulasi on = new Enkapsulasi();
    
    @Override
    public void nama_ruang(){
        in.setRuang(JOptionPane.showInputDialog("masukkan ruang"));
        in.setLokasi_ruang(JOptionPane.showInputDialog("masukkan lokasi ruang"));
        in.setProdi(JOptionPane.showInputDialog("masukkan fakultas / program studi"));
    }
    
    @Override
    public void ukuran_ruang(){
        in.setP_ruang(Integer.parseInt(JOptionPane.showInputDialog("masukkan panjang")));
        in.setL_ruang(Integer.parseInt(JOptionPane.showInputDialog("masukkan lebar")));
    }

    public void kebersihan(){
        on.setKon_lantai((JOptionPane.showInputDialog("kondisi lantai")));
        on.setKon_dinding((JOptionPane.showInputDialog("kondisi dinding")));
        on.setKon_atap((JOptionPane.showInputDialog("kondisi atap")));
        on.setKon_pintu((JOptionPane.showInputDialog("kondisi pintu")));
        on.setKon_jendela((JOptionPane.showInputDialog("kondisi jendela")));
    }
    public void lingkungan(){
        System.out.println("sirkulasi udara : ");
        on.setSir_udara((JOptionPane.showInputDialog("sirkulasi udara")));
        System.out.println("pencahayaan : ");
        on.setPencahayaan(Integer.parseInt((JOptionPane.showInputDialog("pencahayaan"))));
        System.out.println("kelembapan : ");
        on.setKelembapan(r.nextDouble());
        System.out.println("suhu : ");
        on.setSuhu(r.nextDouble());
    }
    public void kenyamanan(){
        on.setKebisingan((JOptionPane.showInputDialog("kebisingan")));
        on.setBau((JOptionPane.showInputDialog("bau")));
        on.setKebocoran((JOptionPane.showInputDialog("kebocoran")));
        on.setKerusakan((JOptionPane.showInputDialog("kerusakan")));
        on.setKeausan((JOptionPane.showInputDialog("keausan")));
    }
    public void keamanan(){
        on.setKekokohan((JOptionPane.showInputDialog("kekokohan")));
        on.setKunci_pintu((JOptionPane.showInputDialog("kunci pintu")));
        on.setKunci_jendela((JOptionPane.showInputDialog("kunci jendela")));
        on.setKeamanan((JOptionPane.showInputDialog("keamanan")));
    }
}