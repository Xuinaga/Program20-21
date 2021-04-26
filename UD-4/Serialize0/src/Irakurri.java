
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;

public class Irakurri {

    public static void main(String[] args) {

        FileInputStream fin = null;
        try {
            fin = new FileInputStream("SuinagarenLagunak.dat");
            ObjectInputStream inStream = new ObjectInputStream(fin);
            Laguna p;
            while (true) {
                p = (Laguna) inStream.readObject();
                System.out.println(p);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Fitxategia ez dago bere lekuan.");
        } catch (IOException ex) {
            System.out.println("Ez dago objektu gehiagorik.");
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFound Salbuespena gertatu da.");
        } finally {
            try {
                fin.close();
            } catch (Exception ex) {
                System.out.println("Fitxategia ixterakoan errorea!");
            }
        }
    }
}
