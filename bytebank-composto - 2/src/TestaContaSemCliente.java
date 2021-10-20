public class TestaContaSemCliente {
    public static void main(String[] args) {

        //cria a contaDaMarcela e mosta o saldo da conta recem criada
        Conta contaDaMarcela = new Conta();
        System.out.println(contaDaMarcela.saldo);
        System.out.println(contaDaMarcela.titular);
        System.out.println(contaDaMarcela.residente);

        //Cria o cliente da contaDaMarcela e
        contaDaMarcela.titular = new Cliente();

        //Cria o endereço da contaDaMarcela e mostra o
        contaDaMarcela.residente = new Endereco();

        // mostra o titular e residente da conta sem valor, apenas com endereço da memoria
        System.out.println(contaDaMarcela.titular);
        System.out.println(contaDaMarcela.residente);


        //Associa o nome Marcela ao titular que associa ao nome do cliente Marcela
        contaDaMarcela.titular.nome = "Marcela";

        //Associao o Endereço> nome do Residente com o mesmo valor do nome do conta e Cliente> Nome
        contaDaMarcela.residente.nomeResidente = contaDaMarcela.titular.nome;
        System.out.println(contaDaMarcela.titular.nome);
        System.out.println(contaDaMarcela.residente.nomeResidente);




    }


}
