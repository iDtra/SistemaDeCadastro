public class PessoaFisica extends Pessoa {
    private String RG;

    public PessoaFisica (String nome, String CPF, int idade, String telefone, String RG){
        super(nome, CPF, idade, telefone);
        this.RG = RG;
    }
    @Override
    public void mostrarDados(){
        System.out.println("=== PESSOA FISICA ===");
        System.out.println("NOME:" + nome);
        System.out.println("CPF: " + CPF);
        System.out.println("RG: " + RG);
        System.out.println("IDADE: " + idade);
        System.out.println("TELEFONE: " + telefone);
        System.out.println("=====================");
    }
}
