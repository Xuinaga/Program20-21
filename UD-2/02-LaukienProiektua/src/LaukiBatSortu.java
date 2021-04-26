
import java.util.Scanner;


public class LaukiBatSortu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int zabalera,altuera;
        System.out.println("Sartu nahi duzun zabalera:");
        zabalera=in.nextInt();
        System.out.println("Sartu nahi duzun altuera:");
        altuera=in.nextInt();
        Laukia l1 = new Laukia(zabalera,altuera);
        
        System.out.println("Lauki "+l1.getmota().toLowerCase()+" sortu ->"+l1);
        System.out.println("Laukia beteta:");
        l1.marraztuBeteta(zabalera,altuera);
        System.out.println("Laukia hutsik:");
        l1.marraztuHutsik(zabalera,altuera);
    }    
}
