public class CriaConta {
    
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();

        primeiraConta.depositar(100);
        primeiraConta.depositar(500);

        System.out.println("First account balance: " + primeiraConta.saldo);

        primeiraConta.sacar(500);

        System.out.println("First account balance: " + primeiraConta.saldo);

        primeiraConta.sacar(200);
    }

}
