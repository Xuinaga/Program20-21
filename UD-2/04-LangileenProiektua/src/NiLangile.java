
import java.util.Scanner;

public class NiLangile {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Langilea l1= new Langilea(1,"Jon","Suinaga",600);
        System.out.println(l1.toString());
        System.out.println("Urteko soldata hurrengoa da: "+l1.getUrtekoSoldata());
        l1.setSoldata(l1.soldataIgo(50));
        System.out.println(l1.toString());
        try{
            System.out.println("Soldataren ze portzentaia igo nahi duzu?");
              l1.setSoldata(l1.soldataIgo(in.nextInt()));
              System.out.println(l1);
        }catch(Exception e){
            System.out.println("Igoera gabe gelditu zara balio okerra sartzearren");
        }
        try{
            System.out.println("Soldataren ze portzentaia igo nahi duzu?");
              l1.setSoldata(l1.soldataIgo(in.nextInt()));
              System.out.println(l1);
        }catch(Exception e){
            System.out.println("Balioa gaizki sartu duzunez soldata %10 jeitsiko zaizu");
            l1.setSoldata(l1.soldataIgo(-10));
            System.out.println(l1);
        }
      
    }
}
