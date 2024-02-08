// tipo Conta : saldo, agencia, numero e titular

public class Conta {
    double saldo;
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
        System.out.println("You deposited " + "$" + valor);
        this.saldo += valor;
    }

    public boolean sacar(double valor) {
        if(valor > this.saldo) {
            System.out.println("You don't have money enough for withdraw!");
            return false;
        } else {
            System.out.println("You withdrawed " + "$" + valor);
            this.saldo -= valor;
            return true;
        }
    }

    public boolean transferir(double valor, Conta contaDestino) {
        if(valor > this.saldo) {
            System.out.println("You don't have money enough for transfer to other account!");
            return false;
        } else {
            this.saldo -= valor;
            contaDestino.saldo += valor;
            return true;
        }
    }

}