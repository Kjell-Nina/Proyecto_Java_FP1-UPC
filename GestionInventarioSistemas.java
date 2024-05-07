import java.util.Scanner;

// Clase principal que maneja la interacción con el usuario
public class GestionInventarioSistemas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InventarioSistemas inventarioSistemas = new InventarioSistemas();

        int opcion;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Agregar Elemento al Inventario");
            System.out.println("2. Buscar Elemento en el Inventario");
            System.out.println("3. Mostrar Inventario");
            System.out.println("4. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del elemento: ");
                    String nombre = scanner.next();
                    scanner.nextLine(); // Limpiar el buffer del scanner
                    System.out.print("Ingrese la descripción del elemento: ");
                    String descripcion = scanner.nextLine();
                    System.out.print("Ingrese la cantidad inicial del elemento: ");
                    int cantidad = scanner.nextInt();
                    inventarioSistemas.agregarElemento(nombre, descripcion, cantidad);
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del elemento a buscar: ");
                    String nombreBuscar = scanner.next();
                    ElementoInventario encontrado = inventarioSistemas.buscarElemento(nombreBuscar);
                    if (encontrado != null) {
                        System.out.println("Elemento encontrado:");
                        System.out.println("Nombre: " + encontrado.getNombre() +
                                ", Descripción: " + encontrado.getDescripcion() +
                                ", Cantidad: " + encontrado.getCantidad());
                    } else {
                        System.out.println("Elemento no encontrado en el inventario");
                    }
                    break;
                case 3:
                    inventarioSistemas.mostrarInventario();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 4);
    }
}
