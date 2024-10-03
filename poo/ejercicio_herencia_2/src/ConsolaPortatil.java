// Clase derivada para consolas portátiles
public class ConsolaPortatil extends Consola {
    private int duracionBateria; // en horas

    // Constructor
    public ConsolaPortatil(String nombre, String fabricante, int anioLanzamiento, int duracionBateria) {
        super(nombre, fabricante, anioLanzamiento); // Llamada al constructor de la superclase
        this.duracionBateria = duracionBateria;
    }

    // Getter y Setter para duracionBateria
    public int getDuracionBateria() {
        return duracionBateria;
    }

    public void setDuracionBateria(int duracionBateria) {
        this.duracionBateria = duracionBateria;
    }

    // Sobrescribir el método mostrarDetalles
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles(); // Llama al método de la superclase
        System.out.println("Duración de Batería: " + duracionBateria + " horas");
    }
}

