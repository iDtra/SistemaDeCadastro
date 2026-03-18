
public abstract class Pessoa {
    protected String nome;
    protected String CPF;
    protected int idade;
    protected String telefone;

    public Pessoa(String nome, String CPF, int idade, String telefone){
        this.nome = nome;
        this.CPF = CPF;
        this.idade = idade;
        this.telefone = telefone;
    }
    
    // metodo abstrato
    public abstract void mostrarDados();

    //getters e setters 
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getCPF(){
        return CPF;
    }
    public void setCPF(String CPF){
        this.CPF = CPF;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public String getTelefone(){
        return telefone;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }


}
