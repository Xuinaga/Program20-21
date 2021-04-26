
package model;

public abstract class Bezeroa {
    private int kodea;
    private String helbidea;

    public Bezeroa(int kodea, String helbidea) {
        this.kodea = kodea;
        this.helbidea = helbidea;
    }

    public int getKodea() {
        return kodea;
    }

    public String getHelbidea() {
        return helbidea;
    }
    abstract String getIzena();
    abstract String getEmaila();
}
