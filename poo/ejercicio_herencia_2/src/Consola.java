// Clase base
public class Consola {
    private String nombre;
    private String fabricante;
    private int anioLanzamiento;

    // Constructor
    public Consola(String nombre, String fabricante, int anioLanzamiento) {
        this.nombre = nombre;
        this.fabricante = fabricante;
        this.anioLanzamiento = anioLanzamiento;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }

    public void setAnioLanzamiento(int anioLanzamiento) {
        this.anioLanzamiento = anioLanzamiento;
    }

    // Método para mostrar detalles de la consola
    public void mostrarDetalles() {
        System.out.println("Consola: " + nombre);
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Año de Lanzamiento: " + anioLanzamiento);
    }
}

