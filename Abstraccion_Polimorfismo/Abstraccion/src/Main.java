public class Main {
    public static void main(String[] args) {
        Animal perro = new Perro();  // Instancia de Perro como tipo Animal
        Animal gato = new Gato();    // Instancia de Gato como tipo Animal

        perro.hacerSonido();  // El perro ladra (polimorfismo en acción)
        gato.hacerSonido();   // El gato maúlla (polimorfismo en acción)
        perro.dormir();       // El animal está durmiendo (método de la clase base)
    }
}
