// tipo Conta : saldo, agencia, numero e titular

public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;

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

    // Getters
    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public String getTitular() {
        return this.titular.getNome();
    }

    // Setters
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

}