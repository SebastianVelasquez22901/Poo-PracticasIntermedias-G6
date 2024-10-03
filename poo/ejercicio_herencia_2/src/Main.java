// Clase principal
public class Main {
    public static void main(String[] args) {
        // Crear un objeto de Consola
        Consola consola1 = new Consola("PlayStation 5", "Sony", 2020);
        consola1.mostrarDetalles();
        System.out.println();

        // Crear un objeto de ConsolaPortatil
        ConsolaPortatil consolaPortatil = new ConsolaPortatil("Nintendo Switch", "Nintendo", 2017, 9);
        consolaPortatil.mostrarDetalles();
        System.out.println();

        // Crear un objeto de ConsolaDeSobremesa
        ConsolaDeSobremesa consolaSobremesa = new ConsolaDeSobremesa("Xbox Series X", "Microsoft", 2020, "Inalámbrico");
        consolaSobremesa.mostrarDetalles();
    }
}
