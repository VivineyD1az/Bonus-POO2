public class Empleado {
    String nombre;
    int edad;
    int Id;

    public Empleado(String nombre, int edad, int id) {
        this.nombre = nombre;
        this.edad = edad;
        Id = id;
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

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }
}
