package tb;
public class Output {
    Analisis in = new Analisis();
    public void tampil(){ 
        System.out.println("hasil luas : "+in.hitung());
        System.out.println("hasil rasio : "+in.hitung_rasio());
        if(in.a == true){
            System.out.println("bentuk : persegi panjang");
            System.out.println("analisis bentuk : sesuai");
        }
        else{
            System.out.println("analisis bentuk : tidak sesuai");
        }
        if(in.b == true){
            System.out.println("analisis rasio : sesuai");
        }
        else{
            System.out.println("analisis rasio : tidak sesuai");
        }
        if(in.c == true){
            System.out.println("analisis pintu : sesuai");
        }
        else{
            System.out.println("analisis pintu : tidak sesuai");
        }
        if(in.d == true){
            System.out.println("analisis jendela : sesuai");
        }
        else{
            System.out.println("analsisi jendela : tidak sesuai");
        }
        if(in.e == true){
            System.out.println("analisis steker : sesuai");
        }
        else{
            System.out.println("analisis steker : tidak sesuai");
        }
        if(in.f == true){
            System.out.println("analisis kabel LCD : sesuai");
        }
        else{
            System.out.println("analisis kabel LCD : tidak sesuai");
        }
        if(in.g == true){
            System.out.println("analisis lampu : sesuai");
        }
        else{
            System.out.println("analisis lampu : tidak sesuai");
        }
        if(in.h == true){
            System.out.println("analisis kipas : sesuai");
        }
        else{
            System.out.println("analisis kipas : tidak sesuai");
        }
        if(in.i == true){
            System.out.println("analisis AC : sesuai");
        }
        else{
            System.out.println("analisis AC : tidak sesuai");
        }
        if(in.k == true){
            System.out.println("analisis CCTV : sesuai");
        }
        else{
            System.out.println("analisis CCTV : tidak sesuai");
        }
        if(in.l == true){
            System.out.println("analisis pencahayaan : sesuai");
        }
        else{
            System.out.println("analisis pencahayaan :tidak sesuai");
        }
        if(in.m == true){
            System.out.println("analisis kelembapan : sesuai");
        }
        else{
            System.out.println("analisis kelmbapan :tidak sesuai");
        }
        if(in.n == true){
            System.out.println("analisis suhu : sesuai");
        }
        else{
            System.out.println("analisis suhu : tidak sesuai");
        }
    }
}
