public class Main {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(1000);

        cuenta.depositar(250);
        cuenta.retirar(300);
        System.out.println("Saldo final: " + cuenta.getSaldo());
    }
}

class Cuenta {
    // El saldo es privado: se modifica mediante métodos.
    private double saldo;

    public Cuenta(double saldoInicial) {
        saldo = saldoInicial;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo = saldo + cantidad;
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo = saldo - cantidad;
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
