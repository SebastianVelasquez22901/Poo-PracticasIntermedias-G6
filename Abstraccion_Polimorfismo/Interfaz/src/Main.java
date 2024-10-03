public class Main {
    public static void main(String[] args) {
        Vehiculo carro = new Carro();       // Instanciando un Carro
        Vehiculo bicicleta = new Bicicleta(); // Instanciando una Bicicleta

        carro.acelerar();        // El carro está acelerando
        bicicleta.acelerar();    // La bicicleta está acelerando
        carro.frenar();          // El carro está frenando
    }
}
