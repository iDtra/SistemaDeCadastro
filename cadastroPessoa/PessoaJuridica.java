public class PessoaJuridica extends Pessoa {

    private  String CNPJ;

    public PessoaJuridica(String nome, String CPF, int idade, String telefone, String CNPJ){
    super(nome, CPF, idade, telefone);
    this.CNPJ = CNPJ;
    }
    @Override
    public void mostrarDados(){
        System.out.println("=== PESSOA FISICA ===");
        System.out.println("NOME:" + nome);
        System.out.println("CPF: " + CPF);
        System.out.println("CNPJ: " + CNPJ);
        System.out.println("IDADE: " + idade);
        System.out.println("TELEFONE: " + telefone);
        System.out.println("=====================");
    }
}
