public class TesteSacaNegativo {

    public static void main(String[] args) {

        Conta contanegativo = new Conta();
        contanegativo.deposita(100);
        contanegativo.saca(200);
        System.out.println("Conta: " + contanegativo.getSaldo());


    }
}
