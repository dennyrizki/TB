package tb;
import java.util.Scanner;
public class Admin {
    public static void main(String[] args) {
        String ul;
        int brp;
        Inventaris[] ulang; 
        ulang = new Inventaris[1];
        Scanner in = new Scanner(System.in);
        Inventaris mulai = new Inventaris();
        for(int i=0; i<ulang.length;){
            mulai.input();
            mulai.kebersihan();
            mulai.lingkungan();
            mulai.kenyamanan();
            mulai.keamanan();
            mulai.analisis_bentuk();
            mulai.tampil();
            System.out.println("edit data (ya / tidak) : ");
            ul = in.next();
            if(ul.equalsIgnoreCase("ya")){
                i=i;
            }
            else{
                i++;
                System.out.println("SELESAI");
            }
        } 
    }
}
