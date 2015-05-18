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
            a = true;
        } 
        else{
            a = false;
        }
        return a;
    }
    public boolean analisis_rasio(){
        if(hitung_rasio() >= 0.5){
            b = true;
        }
        else{
            b = false;
        }
        return b;
    }
    public boolean analisis_pintu(){
        if(in.getJ_pintu() >= 2){
            c = true;
        }
        else{
            c = false;
        }
        return c;
    }
    public boolean analisis_jendela(){
        if(in.getJ_jendela() >= 1){
            d = true;
        }
        else{
            d = false;
        }
        return d;
    }
    public boolean analisis_steker(){
        if(in.getJ_steker() >= 4){
            e = true;
        }
        else{
            e = false;
        }
        return e;
    }
    public boolean analisis_kabel_lcd(){
        if(in.getJ_kabel_lcd() >= 1){
            f = true;
        }
        else{
            f = false;
        }
        return f;
    }
    public boolean analisis_lampu(){
        if(in.getJ_lampu() >= 18){
            g = true;
        }
        else{           
            g = false;
        }
        return g;
    }
    public boolean analisis_kipas(){
        if(in.getJ_kipas() >= 2){
            h = true;
        }
        else{            
            h = false;
        }
        return h;
    }
    public boolean analisis_ac(){
        if(in.getJ_ac() >= 1){
            i = true;
        }
        else{
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
            k = true;
        }
        else{
            k = false;
        }
        return k;
    }
    public boolean analisis_cahaya(){
        if(250 >= in.getPencahayaan() || in.getPencahayaan() <=350){
            l = true;
        }
        else{
            l = false;
        }
        return l;
    }
    public boolean analisis_kelembapan(){
        if(70 >= in.getKelembapan() || in.getKelembapan() <= 80){
            m = true;
        }
        else{
            m = false;
        }
        return m;
    }
    public boolean analisis_suhu(){
        if(25 >= in.getSuhu() || in.getSuhu() <= 35){
            n = true;
        }
        else{
            n = false;
        }
        return n;
    }
} 
