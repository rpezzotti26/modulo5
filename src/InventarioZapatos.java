import java.util.Scanner;

public class InventarioZapatos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables para almacenar la información del producto
        String nombreProducto;
        double precioProducto;
        int cantidadInicial;
        int unidadesVendidas;
        int stockDisponible;

        // Ingreso de información del producto
        System.out.print("Ingrese el nombre del producto: ");
        nombreProducto = scanner.nextLine();

        System.out.print("Ingrese el precio del producto: ");
        precioProducto = scanner.nextDouble();

        System.out.print("Ingrese la cantidad inicial del producto: ");
        cantidadInicial = scanner.nextInt();

        System.out.print("Ingrese la cantidad de unidades vendidas: ");
        unidadesVendidas = scanner.nextInt();

        // Calcular la disponibilidad en inventario
        stockDisponible = cantidadInicial - unidadesVendidas;

        // Determinar si hay suficiente stock para una venta
        if (stockDisponible < 0) {
            System.out.println("Error: Se han vendido más unidades de las disponibles en el inventario.");
            stockDisponible = 0;
        } else if (stockDisponible == 0) {
            System.out.println("El producto se ha vendido completamente.");
            // Duplicar el inventario inicial si el producto se vendió completamente
            cantidadInicial *= 2;
            stockDisponible = cantidadInicial;
            System.out.println("El inventario inicial ha sido duplicado. Nuevas unidades disponibles: " + stockDisponible);
        } else {
            System.out.println("Hay suficiente stock disponible para nuevas ventas.");
        }

        // Mostrar la información actualizada del producto
        System.out.println("\nInformación actualizada del producto:");
        System.out.println("Nombre del producto: " + nombreProducto);
        System.out.println("Precio del producto: $" + precioProducto);
        System.out.println("Unidades vendidas: " + unidadesVendidas);
        System.out.println("Unidades disponibles en inventario: " + stockDisponible);

        // Cerrar el escáner
        scanner.close();
    }
}
