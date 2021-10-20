public class TestaMetodo {
    public static void main(String[] args) {

        Conta contadopaulo = new Conta();
        contadopaulo.saldo = 100;
        contadopaulo.deposita(50);
        System.out.println(contadopaulo.saldo);
        contadopaulo.saca(20);
        System.out.println(contadopaulo.saldo);
        System.out.println(contadopaulo.saldo);

        boolean conseguiuRetirar = contadopaulo.saca(20);
        System.out.println(contadopaulo.saldo);
        System.out.println(conseguiuRetirar);

        Conta condaDaMarcela = new Conta();
        condaDaMarcela.deposita(1000);

        if(condaDaMarcela.transfere(3000, contadopaulo)) {
            System.out.println("Transferência com sucesso");

        }else {
            System.out.println("Saldo insuficiente");
        }

        System.out.println(condaDaMarcela.saldo);
        System.out.println(contadopaulo.saldo);

        contadopaulo.titular = "Paulo Silveira";
        System.out.println(contadopaulo.titular);







    }




}

