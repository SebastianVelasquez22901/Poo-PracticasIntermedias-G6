class Carro implements Vehiculo {
    @Override
    public void acelerar() {
        System.out.println("El carro está acelerando");
    }

    @Override
    public void frenar() {
        System.out.println("El carro está frenando");
    }
}
