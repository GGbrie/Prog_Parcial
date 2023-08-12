public class Persona {
    private String nombre;
    private int edad;
    private String género;
    private String dirección;

    public Persona(String nombre, int edad, String género, String dirección) {
        this.nombre = nombre;
        this.edad = edad;
        this.género = género;
        this.dirección = dirección;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGénero() {
        return género;
    }

    public void setGénero(String género) {
        this.género = género;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }
}