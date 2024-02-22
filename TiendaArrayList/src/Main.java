import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Bienvenidos al Inventario de nuestra super Tienda ");
        Scanner scanner = new Scanner(System.in);
        Local tienda = new Local();
        Empleado empleado1 = new Empleado("Pedro",23,12345);
        Empleado empleado2 = new Empleado("Javier",27,1245764);

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1 - Registrar producto nacional");
            System.out.println("2 - Registrar producto importado");
            System.out.println("3 - Listar productos nacionales");
            System.out.println("4 - Listar productos importados");
            System.out.println("5 - Buscar producto nacional");
            System.out.println("6 - Buscar producto importado");
            System.out.println("7 - Salir");
            System.out.print("Ingrese su opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 1) {
                tienda.registrarProductoNacional();
            } else if (opcion == 2) {
                tienda.registrarProductoImportado();
            } else if (opcion == 3) {
                tienda.listarProductosNacionales();
            } else if (opcion == 4) {
                tienda.listarProductosImportados();
            } else if (opcion == 5) {
                tienda.buscarProductoNacional();
            } else if (opcion == 6) {
                tienda.buscarProductoImportado();
            } else if (opcion == 7) {
                System.out.println("Saliendo del programa...");
                break;
            } else {
                System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
            }
        }
    }
}