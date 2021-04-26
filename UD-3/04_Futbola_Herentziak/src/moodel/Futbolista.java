
package moodel;

public class Futbolista extends IntegranteSeleccion{
    private int dorsal;
    private String demarcacion;

    public Futbolista(int dorsal, String demarcacion) {
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public Futbolista(int dorsal, String demarcacion, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }
    public void entrenar(){
        System.out.println("Entrenatzen");
    }
    public void jugarPartido(){
        System.out.println("Jolasten");
    }

    public int getDorsal() {
        return dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    @Override
    public String toString() {
        return "Futbolista{" + "id=" + id + ", nombre=" + nombre + ", apellidos=" + super.getApellidos() + ", edad=" + super.getEdad() + ", dorsal=" + dorsal + ", demarcacion=" + demarcacion + '}';
    }

    
    
}
