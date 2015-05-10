package tb;
public class Analisis {
    boolean a, b, c, d, e, f, g, h, i, j, k, l, m, n;
    Enkapsulasi in = new Enkapsulasi();
    
    public double hitung(){
        return in.getP_ruang() * in.getL_ruang();
    }
    public double hitung_rasio(){
        return hitung() / in.getJ_kursi();
    }
    public boolean analisis_bentuk(){
        if(in.getP_ruang() != in.getL_ruang()){
            System.out.println("bentuk : persegi panjang");
            System.out.println("sesuai");
            a = true;
        }
        else{
            System.out.println("tidak sesuai");
            a = false;
        }
        return a;
    }
    public boolean analisis_rasio(){
        if(hitung_rasio() >= 0.5){
            System.out.println("sesuai");
            b = true;
        }
        else{
            System.out.println("tidak sesuai");
            b = false;
        }
        return b;
    }
    public boolean analisis_pintu(){
        if(in.getJ_pintu() >= 2){
            System.out.println("sesuai");
            c = true;
        }
        else{
            System.out.println("tidak sesuai");
            c = false;
        }
        return c;
    }
    public boolean analisis_jendela(){
        if(in.getJ_jendela() >= 1){
            System.out.println("sesuai");
            d = true;
        }
        else{
            System.out.println("tidak sesuai");
            d = false;
        }
        return d;
    }
    public boolean analisis_steker(){
        if(in.getJ_steker() >= 4){
            System.out.println("sesuai");
            e = true;
        }
        else{
            System.out.println("tidak sesuai");
            e = false;
        }
        return e;
    }
    public boolean analisis_kabel_lcd(){
        if(in.getJ_kabel_lcd() >= 1){
            System.out.println("sesuai");
            f = true;
        }
        else{
            System.out.println("tidak sesuai");
            f = false;
        }
        return f;
    }
    public boolean analisis_lampu(){
        if(in.getJ_lampu() >= 18){
            System.out.println("sesuai");
            g = true;
        }
        else{
            System.out.println("tidak sesuai");
            g = false;
        }
        return g;
    }
    public boolean analisis_kipas(){
        if(in.getJ_kipas() >= 2){
            System.out.println("sesuai");
            h = true;
        }
        else{
            System.out.println("tidak sesuai");
            h = false;
        }
        return h;
    }
    public boolean analisis_ac(){
        if(in.getJ_ac() >= 1){
            System.out.println("sesuai");
            i = true;
        }
        else{
            System.out.println("tidak sesuai");
            i = false;
        }
        return i;
    }
    /*public boolean analisis_internet(){
        if(in.getSsid() == in.getSsid().equalsIgnoreCase("umm")){
            System.out.println("sesuai");
            j = true;
        }
        else{
            System.out.println("tidak sesuai");
        }
        return j;
    }*/
    public boolean analisis_cctv(){
        if(in.getJ_cctv() == 2){
            System.out.println("sesuai");
            k = true;
        }
        else{
            System.out.println("tidak sesuai");
            k = false;
        }
        return k;
    }
    public boolean analisis_cahaya(){
        if(250 >= in.getPencahayaan() || in.getPencahayaan() <=350){
            System.out.println("sesuai");
            l = true;
        }
        else{
            System.out.println("tidak sesuai");
            l = false;
        }
        return l;
    }
    public boolean analisis_kelembapan(){
        if(70 >= in.getKelembapan() || in.getKelembapan() <= 80){
            System.out.println("sesuai");
            m = true;
        }
        else{
            System.out.println("tidak sesuai");
            m = false;
        }
        return m;
    }
    public boolean analisis_suhu(){
        if(25 >= in.getSuhu() || in.getSuhu() <= 35){
            System.out.println("sesuai");
            n = true;
        }
        else{
            System.out.println("tidak sesuai");
            n = false;
        }
        return n;
    }
}