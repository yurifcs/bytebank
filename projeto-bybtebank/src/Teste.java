public class Teste {
    public static void main(String [] args) {
        Conta minhaConta = new Conta();
        minhaConta.saldo = 500.0;
        minhaConta.saldo += 1000.0;
        System.out.println(minhaConta.saldo);
    }
}