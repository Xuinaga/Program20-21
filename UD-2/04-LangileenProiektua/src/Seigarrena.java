
import java.util.Scanner;


public class Seigarrena {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Langilea[] arraya=Langilea.nireHamarLagunLangile();
        for(int i=0;i<arraya.length;i++){
            System.out.printf("%4d %15s %15s %8.2f\n", arraya[i].getId(), arraya[i].getIzena(), arraya[i].getAbizena(), arraya[i].getSoldata());
        }
        System.out.println("Sartu bilatu nahi duzun langilearen izena");
        String izen= in.next() ;
        
        Langilea l1 =Langilea.bilatu(izen,arraya);
        if(l1==null){
            System.out.println("Ez dago langilerik izen horrekin");
        }else{
            System.out.println(l1.toString());
        }
        boolean okerra=false;  
        do{
            try{
            System.out.println("Soldataren ze portzentaitan igo nahi duzu?");
            int ehuneko = in.nextInt();
            l1.setSoldata(l1.soldataIgo(ehuneko));            
           okerra=true;
            for(int i=0;i<arraya.length;i++){
                System.out.printf("%4d %15s %15s %8.2f\n", arraya[i].getId(), arraya[i].getIzena(), arraya[i].getAbizena(), arraya[i].getSoldata());            
            }
        }catch(Exception e){
            in.next(); //Bufferra husteko
            System.out.println("Zenbaki bat sartu behar duzu!");
        } 
        }while(okerra!=true);
        double soldatakGuztira=0;
        double soldataMax=0;
        
        for(int i=0;i<arraya.length;i++){
            soldatakGuztira+=arraya[i].getUrtekoSoldata();
        }
        System.out.println("Urte beteko soldata guztien batura hurrengoa da: "+soldatakGuztira+"€");
        
        Langilea lmax= new Langilea(1,"","",0);
        for(int i=0;i<arraya.length;i++){
            if(arraya[i].getSoldata()>soldataMax){
                soldataMax=arraya[i].getSoldata();
                lmax=arraya[i];
            }  
        }
        System.out.println("Soldata handiena duen langilea hurrengoa da: "+lmax.toString());
    }
}
