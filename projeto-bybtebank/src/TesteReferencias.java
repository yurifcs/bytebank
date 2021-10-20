import static java.lang.System.*;

public class TesteReferencias {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;

        out.println("saldo da primeira: " + primeiraConta.saldo);

        out.println("saldo da segunda conta " + primeiraConta.saldo);

        primeiraConta.saldo += 100;
        out.println("saldo da segunda conta 2" + primeiraConta.saldo);

        out.println(primeiraConta.saldo);

    }
}
