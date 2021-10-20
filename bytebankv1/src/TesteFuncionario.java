public class TesteFuncionario {

    public static void main(String[] args) {

        Funcionario nico = new Funcionario();
        nico.setNome("Nico Rosberg");
        nico.setCpf("348525828-82");
        nico.setSalario(3000.00);

        System.out.println(nico.getNome());
        System.out.println(nico.getBonificacao());
    }

}
