package moodel;

public class Masajista extends IntegranteSeleccion{
    private String titulacion;
    private int experientzia;

    public Masajista(String titulacion, int experientzia) {
        this.titulacion = titulacion;
        this.experientzia = experientzia;
    }

    public Masajista(String titulacion, int experientzia, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.experientzia = experientzia;
    }

    public void darMasaje(){
        System.out.println("Masajeatzen");
    }
    public String getTitulacion() {
        return titulacion;
    }

    public int getExperientzia() {
        return experientzia;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public void setExperientzia(int experientzia) {
        this.experientzia = experientzia;
    }
     @Override
    public String toString() {
        return "Masajista{" + "id=" + id + ", nombre=" + nombre + ", apellidos=" + super.getApellidos() + ", edad=" + super.getEdad() + ", titulazioa=" + titulacion + ", experientzia=" + experientzia + '}';
    }
}
