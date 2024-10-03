// Clase derivada para consolas de sobremesa
public class ConsolaDeSobremesa extends Consola {
    private String tipoDeControlador; // Ejemplo: "Inalámbrico", "Cableado"

    // Constructor
    public ConsolaDeSobremesa(String nombre, String fabricante, int anioLanzamiento, String tipoDeControlador) {
        super(nombre, fabricante, anioLanzamiento); // Llamada al constructor de la superclase
        this.tipoDeControlador = tipoDeControlador;
    }

    // Getter y Setter para tipoDeControlador
    public String getTipoDeControlador() {
        return tipoDeControlador;
    }

    public void setTipoDeControlador(String tipoDeControlador) {
        this.tipoDeControlador = tipoDeControlador;
    }

    // Sobrescribir el método mostrarDetalles
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles(); // Llama al método de la superclase
        System.out.println("Tipo de Controlador: " + tipoDeControlador);
    }
}
