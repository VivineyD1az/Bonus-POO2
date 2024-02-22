import java.util.*;
public class Local {
    private static final Scanner scanner = new Scanner(System.in);
    private ArrayList<Producto> productosNacionales;
    private ArrayList<Producto> productosImportados;

    public Local() {
        productosNacionales = new ArrayList<>();
        productosImportados = new ArrayList<>();
    }

    public void registrarProductoNacional() {
        System.out.println("Ingrese el nombre del Producto: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el codigo del producto: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese el Registro DIAN del producto: ");
        String registroDIAN = scanner.nextLine();
        productosNacionales.add(new ProductoNacional(nombre, codigo, registroDIAN));
        System.out.println("Producto agregado exitosamente!");
    }

    public void registrarProductoImportado() {
        System.out.println("Ingrese el nombre del Producto: ");
        String nombre2 = scanner.nextLine();
        System.out.print("Ingrese el codigo del producto: ");
        int codigo2 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese La licencia de importacion del producto: ");
        String LicenciaImportacion = scanner.nextLine();
        productosImportados.add(new ProductoImportado(nombre2, codigo2, LicenciaImportacion));
        System.out.println("Producto agregado exitosamente!");
    }

    public void listarProductosNacionales() {
        if (productosNacionales.isEmpty()) {
            System.out.println("No hay productos registrados.");
        } else {
            System.out.println("Productos Nacionales");

            for (Producto producto : productosNacionales) {
                System.out.println(producto);
            }
        }
    }

    public void listarProductosImportados() {
        if (productosImportados.isEmpty()) {
            System.out.println("No hay productos registrados.");
        } else {
            System.out.println("Productos Importados");
            for (Producto producto : productosImportados) {
                System.out.println(producto);
            }
        }
    }


    public void buscarProductoNacional() {
        System.out.print("Ingrese el nombre del producto a buscar: ");
        String nombreABuscar = scanner.nextLine();
        boolean encontrado = false;
        for (Producto producto : productosNacionales) {
            if (producto.getNombre().equalsIgnoreCase(nombreABuscar)) {
                System.out.println("Producto encontrado: " + producto);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Producto no encontrado");
        }
    }


    public Producto buscarProductoImportado() {
        System.out.print("Ingrese el nombre del producto a buscar: ");
        String nombreABuscar2 = scanner.nextLine();
        for (Producto producto : productosImportados) {
            if (producto.getNombre().equalsIgnoreCase(nombreABuscar2)) {
                System.out.println("Producto encontrado: " + producto);
                return producto;
            }
        }
        System.out.println("Producto no encontrado");
        return null;
    }
}