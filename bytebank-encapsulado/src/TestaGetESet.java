public class TestaGetESet {

    public static void main(String[] args) {

        Conta conta = new Conta();
        //conta.numero= 1337
        conta.setNumero(1337);
        System.out.println(conta.getNumero());

        Cliente paulo = new Cliente();
        //conta.titular = paulo;

        conta.setTitular(paulo);

        System.out.println(conta.getTitular());
        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("programador");
        System.out.println(conta.getTitular().getProfissao());


        // agora em duas linhas:
        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissao("programador");



    }
}
