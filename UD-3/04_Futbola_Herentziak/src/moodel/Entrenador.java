
package moodel;

public class Entrenador extends IntegranteSeleccion{
    private String idFederacion;

    public Entrenador(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    public Entrenador(String idFederacion, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    public void dirigirEntrenamiento(){
        System.out.println("Dirigitzen entrenamendua");
    }
    public void dirigirPartido(){
        System.out.println("Dirigitzen partidua");
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }
     @Override
    public String toString() {
        return "Entrernador{" + "id=" + id + ", nombre=" + nombre + ", apellidos=" + super.getApellidos() + ", edad=" + super.getEdad() + ", idFederacion=" + idFederacion +'}';
    }
}
