package tb; 
import java.util.Scanner;
public class Admin {
    public static void main(String[] args) {
        String ul;
        int brp;
        Teknik[] ulang; 
        ulang = new Teknik[1];
        Scanner in = new Scanner(System.in);
        Teknik mulai = new Teknik();
        for(int i=0; i<ulang.length;){
            mulai.data_ruang();
            mulai.kebersihan();
            mulai.lingkungan();
            mulai.kenyamanan();
            mulai.keamanan();
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
 
