// Definición de la clase Console
class Console {
    // Atributos de la consola
    String name;
    String manufacturer;
    int storageCapacity; // en GB

    // Método para mostrar los detalles de la consola
    void showDetails() {
        System.out.println("Consola: " + name);
        System.out.println("Fabricante: " + manufacturer);
        System.out.println("Capacidad de almacenamiento: " + storageCapacity + " GB");
    }
}

// Clase principal con el método main
public class Main {
    public static void main(String[] args) {
        // Creación de un objeto Console
        Console console1 = new Console();

        // Asignar valores a los atributos
        console1.name = "PlayStation 5";
        console1.manufacturer = "Sony";
        console1.storageCapacity = 825;

        // Mostrar los detalles de la consola
        console1.showDetails();
    }
}
