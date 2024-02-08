public class CriaConta {
    
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        Conta segundaConta = new Conta();

        primeiraConta.titular = "Leonardo";
        segundaConta.titular = "Paulo";

        primeiraConta.depositar(100);
        primeiraConta.depositar(500);

        System.out.println("First account balance: " + primeiraConta.saldo);

        primeiraConta.sacar(500);

        System.out.println("First account balance: " + primeiraConta.saldo);

        primeiraConta.sacar(200);

        primeiraConta.transferir(50, segundaConta);

        System.out.println("Seccond account balance: " + segundaConta.saldo);
        System.out.println("First account balance: " + primeiraConta.saldo);
    }

}
