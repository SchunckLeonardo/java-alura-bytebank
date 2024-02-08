public class CriaConta {
    
    public static void main(String[] args) {
        Cliente leonardo = new Cliente("Leonardo", "121.151.645-58", "Estágiario");
        Conta contaLeonardo = new Conta(250, 215, 26, leonardo);

        System.out.println(contaLeonardo.getTitular());

    }

}
