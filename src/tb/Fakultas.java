package tb;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;
import java.util.Scanner;

abstract public class Fakultas {

    Enkapsulasi in = new Enkapsulasi();
    Scanner ruang = new Scanner(System.in);

    public abstract void nama_ruang();

    public abstract void ukuran_ruang();

    public void data_ruang() {
        in.setJ_kursi(Integer.parseInt(JOptionPane.showInputDialog("masukkan jumlah kursi")));
        in.setJ_pintu(Integer.parseInt(JOptionPane.showInputDialog("masukkan jumlah pintu")));
        in.setJ_jendela(Integer.parseInt(JOptionPane.showInputDialog("masukkan jumlah jendela")));
        in.setJ_steker(Integer.parseInt(JOptionPane.showInputDialog("masukkan jumlah stop kontak")));
        in.setKon_steker((JOptionPane.showInputDialog("kondisi stop kontak")));
        in.setPos_steker((JOptionPane.showInputDialog("posisi stop kontak")));
        in.setJ_kabel_lcd(Integer.parseInt(JOptionPane.showInputDialog("masukkan jumlah kabel LCD")));
        in.setKon_kabel_lcd((JOptionPane.showInputDialog("kondisi kabel LCD")));
        in.setPos_kabel_lcd((JOptionPane.showInputDialog("posisi kabel LCD")));
        in.setJ_lampu(Integer.parseInt(JOptionPane.showInputDialog("masukkan jumlah lampu")));
        in.setKon_lampu((JOptionPane.showInputDialog("kondisi stop lampu")));
        in.setPos_lampu((JOptionPane.showInputDialog("posisi lampu")));
        in.setJ_kipas(Integer.parseInt(JOptionPane.showInputDialog("masukkan jumlah kipas angin")));
        in.setKon_kipas((JOptionPane.showInputDialog("kondisi kipas angin")));
        in.setPos_kipas((JOptionPane.showInputDialog("posisi kipas angin")));
        in.setJ_ac(Integer.parseInt(JOptionPane.showInputDialog("masukkan jumlah AC")));
        in.setKon_ac((JOptionPane.showInputDialog("kondisi AC")));
        in.setPos_ac((JOptionPane.showInputDialog("posisi AC")));
        in.setSsid((JOptionPane.showInputDialog("masukkan SSID")));
        in.setBandwidth((JOptionPane.showInputDialog("masukkan bandwidth")));
        in.setJ_cctv(Integer.parseInt(JOptionPane.showInputDialog("masukkan jumlah CCTV")));
        in.setKon_cctv((JOptionPane.showInputDialog("kondisi CCTV")));
        in.setPos_cctv((JOptionPane.showInputDialog("posisi CCTV")));
    }

    public void Serialisasi() {
        //Serialized Object
        try {
            FileOutputStream outputStream = new FileOutputStream("TB.ser");
            ObjectOutputStream stream = new ObjectOutputStream(outputStream);
            stream.writeObject(in);
            stream.close();
            outputStream.close();
        } catch (IOException exception) {
        }

        //Deserialized Object
        try {
            FileInputStream inputStream = new FileInputStream("TB.ser");
            ObjectInputStream stream = new ObjectInputStream(inputStream);
            stream.close();
            inputStream.close();
        } catch (IOException a) {
            System.out.println(a);
        } 
    }
}
