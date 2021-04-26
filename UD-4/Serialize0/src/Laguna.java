
import java.io.Serializable;

public class Laguna implements Serializable {
    int id;
    String izena;

    public Laguna(int id, String izena) {
        this.id = id;
        this.izena = izena;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getIzena() {
        return izena;
    }
    public void setIzena(String izena) {
        this.izena = izena;
    }
    @Override
    public String toString() {
        return "Pertsona{" + "id=" + id + ", izena=" + izena + '}';
    }   
    
}