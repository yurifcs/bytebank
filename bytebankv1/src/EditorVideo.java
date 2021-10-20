public class EditorVideo extends Funcionario {

    public double getBonificacao() {
        System.out.println("Chamando método bonificação Editor de Video");
       return super.getBonificacao() + 100;


    }


}
