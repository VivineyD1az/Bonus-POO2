public class ProductoImportado extends Producto {
    public String licenciaImportacion;

    public ProductoImportado(String nombre, int codigo, String licenciaImportacion) {
        super(nombre, codigo);
        this.licenciaImportacion = licenciaImportacion;
    }
    @Override
    public String toString() {
        return "Producto Importado: " + nombre + ", Código: " + codigo + ", Licencia de Importación: " + licenciaImportacion;
    }

}


