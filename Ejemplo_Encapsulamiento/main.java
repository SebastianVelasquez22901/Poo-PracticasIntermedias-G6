public class main {
    public static void main(String[] args) {
        // Crear cuentas bancarias
        CuentaBancaria cuenta1 = new CuentaBancaria("Juan Perez", 1000.0, "Ahorros");
        CuentaBancaria cuenta2 = new CuentaBancaria("Maria Lopez", 500.0, "Corriente");

        // Consultar información de la cuenta 1
        System.out.println("Titular: " + cuenta1.getTitular());
        System.out.println("Saldo inicial: " + cuenta1.getSaldo());
        System.out.println("Tipo de cuenta: " + cuenta1.getTipoCuenta());
        System.out.println("Numero de cuenta: " + cuenta1.getNumeroCuenta());

        // Consultar información de la cuenta 2
        System.out.println("\nTitular: " + cuenta2.getTitular());
        System.out.println("Saldo inicial: " + cuenta2.getSaldo());
        System.out.println("Tipo de cuenta: " + cuenta2.getTipoCuenta());
        System.out.println("Número de cuenta: " + cuenta2.getNumeroCuenta());

        // Realizar un depósito en la cuenta 1
        cuenta1.depositar(500.0);
        System.out.println("Saldo despues del deposito en cuenta 1: " + cuenta1.getSaldo());

        // Realizar un retiro en la cuenta 1
        cuenta1.retirar(300.0);
        System.out.println("Saldo despues del retiro en cuenta 1: " + cuenta1.getSaldo());

        // Intentar retirar más de lo que hay en la cuenta 1
        cuenta1.retirar(1500.0); // Fondos insuficientes

        // Cambiar el titular de la cuenta 2
        cuenta2.setTitular("Maria Rodriguez");
        System.out.println("\nNuevo titular de la cuenta 2: " + cuenta2.getTitular());

        // Transferir dinero de la cuenta 1 a la cuenta 2
        cuenta1.transferir(cuenta2, 200.0);
        System.out.println("\nSaldo final de la cuenta 1: " + cuenta1.getSaldo());
        System.out.println("Saldo final de la cuenta 2: " + cuenta2.getSaldo());

        // Intentar cambiar el tipo de cuenta a un valor inválido
        cuenta2.setTipoCuenta("Inversiones"); // Error: Tipo de cuenta inválido
    }
}
