public class CriaConta {
    
    public static void main(String[] args) {
        Cliente leonardo = new Cliente("Leonardo", "121.151.645-58", "Estágiario");
        Conta contaLeonardo = new Conta(215, 26, leonardo);
        Cliente jose = new Cliente("Leonardo", "121.151.645-58", "Estágiario");
        Conta contaJose = new Conta(215, 26, jose);

        System.out.println(contaLeonardo.getTitular());
        System.out.println(Conta.getTotal());

    }

}
