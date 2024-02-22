public class ProductoNacional extends Producto {
    public String registroDIAN;

    public ProductoNacional(String nombre, int codigo, String registroDIAN) {
        super(nombre, codigo);
        this.registroDIAN = registroDIAN;

    }
    // En la clase ProductoNacional
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Código: " + codigo + ", Registro DIAN: " + registroDIAN;
    }
}





