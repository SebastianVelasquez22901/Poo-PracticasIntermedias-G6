public class CuentaBancaria {
    // Atributos privados (encapsulados)
    private String titular;
    private double saldo;
    private String tipoCuenta;
    private String numeroCuenta;
    private static int contadorCuentas = 0; // Contador para generar números de cuenta únicos

    // Constructor
    public CuentaBancaria(String titular, double saldoInicial, String tipoCuenta) {
        this.titular = titular;
        this.saldo = saldoInicial > 0 ? saldoInicial : 0; // Validacion para saldo inicial
        this.tipoCuenta = tipoCuenta;
        this.numeroCuenta = generarNumeroCuenta();
    }

    // Getter para el titular
    public String getTitular() {
        return titular;
    }

    // Setter para el titular (controlado para no aceptar nulos o vacios)
    public void setTitular(String nuevoTitular) {
        if (nuevoTitular != null && !nuevoTitular.isEmpty()) {
            this.titular = nuevoTitular;
        } else {
            System.out.println("El nombre del titular no puede estar vacio.");
        }
    }

    // Getter para el saldo (solo lectura)
    public double getSaldo() {
        return saldo;
    }

    // No hay setter para el saldo porque se modifica a través de los métodos depositar y retirar

    // Getter para el tipo de cuenta
    public String getTipoCuenta() {
        return tipoCuenta;
    }

    // Setter para el tipo de cuenta (permite cambiar de tipo, pero con restricciones)
    public void setTipoCuenta(String nuevoTipoCuenta) {
        if (nuevoTipoCuenta.equals("Ahorros") || nuevoTipoCuenta.equals("Corriente")) {
            this.tipoCuenta = nuevoTipoCuenta;
        } else {
            System.out.println("Tipo de cuenta invalido. Solo se permiten 'Ahorros' o 'Corriente'.");
        }
    }

    // Getter para el número de cuenta (solo lectura)
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    // Método para depositar dinero (modifica el saldo)
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Se deposito: " + cantidad);
        } else {
            System.out.println("La cantidad a depositar debe ser positiva.");
        }
    }

    // Método para retirar dinero (modifica el saldo con control de errores)
    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Se retiro: " + cantidad);
        } else {
            System.out.println("Fondos insuficientes o cantidad invalida.");
        }
    }

    // Método privado para generar un número de cuenta único (encapsulado)
    private String generarNumeroCuenta() {
        contadorCuentas++;
        return "CTA-" + contadorCuentas;
    }

    // Método para transferir dinero entre cuentas (encapsula la logica de transferencia)
    public void transferir(CuentaBancaria destino, double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            this.retirar(cantidad);
            destino.depositar(cantidad);
            System.out.println("Transferencia exitosa de " + cantidad + " de " + this.titular + " a " + destino.getTitular());
        } else {
            System.out.println("Error en la transferencia. Fondos insuficientes o cantidad invalida.");
        }
    }
}
