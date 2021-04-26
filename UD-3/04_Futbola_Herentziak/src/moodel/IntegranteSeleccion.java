
package moodel;

public class IntegranteSeleccion {
    protected int id;
    protected String nombre;
    private String apellidos;
    private int edad;
    
    public IntegranteSeleccion(){
        this(1, "Iker", "Porrero", 57);
    }
    public IntegranteSeleccion(int id, String nombre, String apellidos, int edad){
        this.id=id;
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.edad=edad;
    }

    public void concentrarse(){
        System.out.println("Kontzentratuta");
    }
    public void viajar(){
        System.out.println("Viaja");
    }
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "IntegranteSeleccion{" + "id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + '}';
    }
    
}
