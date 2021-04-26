
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Idatzi {

    
    public static void main(String[] args) {
        try {
              
            Laguna p1 = new Laguna(17,"Antton");
            Laguna p2 = new Laguna(21,"Peio");
            Laguna p3 = new Laguna(32,"Firulais");
            Laguna p4 = new Laguna(44,"Mitxifu");
            
           
            FileOutputStream x = new FileOutputStream("SuinagarenLagunak.dat");
            ObjectOutputStream y = new ObjectOutputStream(x);
            y.writeObject(p1);
            y.writeObject(p2);
            y.writeObject(p3);
            y.writeObject(p4);
            
           
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}