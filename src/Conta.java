// tipo Conta : saldo, agencia, numero e titular

public class Conta {
    private double saldo;
    int agencia;
    int numero;
    Cliente titular;

    public Conta(double saldo, int agencia, int numero, Cliente titular) {
        this.saldo = saldo;
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
    }

    void depositar(double valor) {
        if (valor > 0) {
            System.out.println("You deposited " + "$" + valor);
            this.saldo += valor;
        } else {
            System.out.println("You can't deposit " + "$" + valor);
        }
    }

    public boolean sacar(double valor) {
        if (valor > this.saldo || valor <= 0) {
            System.out.println("You don't have money enough for withdraw!");
            return false;
        } else {
            System.out.println("You withdrawed " + "$" + valor);
            this.saldo -= valor;
            return true;
        }
    }

    public boolean transferir(double valor, Conta contaDestino) {
        if (valor > this.saldo || valor <= 0) {
            System.out.println("You don't have money enough for transfer to other account!");
            return false;
        } else {
            this.saldo -= valor;
            contaDestino.saldo += valor;
            return true;
        }
    }

    public double verificarSaldo() {
        return this.saldo;
    }

}