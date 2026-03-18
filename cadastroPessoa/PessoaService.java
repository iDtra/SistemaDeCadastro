
import java.util.ArrayList;

public class PessoaService {
    private ArrayList<Pessoa> lista = new ArrayList<>();
    public void cadastrar(Pessoa p){
        lista.add(p);
    }
    public void listar(){
        if (lista.isEmpty()){
            System.out.println("Nenhuma pessoa cadastrada. ");
            return;
        }
        for (Pessoa p : lista){
            p.mostrarDados();
            System.out.println("-----------------");
        }
    }

    public Pessoa buscarPorCpf(String CPF){
        for (Pessoa p : lista){
            if (p.getCPF().equals(CPF)){
                return p;
            }
        }
        return null;
    }

    public boolean  cpfExiste(String CPF){
        return buscarPorCpf(CPF) != null;
    }
    public boolean excluir(String CPF){
        Pessoa p = buscarPorCpf(CPF);
        if (p != null){
            lista.remove(p);
            return true;
        }
        return false;
    }
    public boolean alterar(String CPF, String nome, int idade, String telefone){
        Pessoa p = buscarPorCpf(CPF);

        if(p != null){
            p.setNome(nome);
            p.setIdade(idade);
            p.setTelefone(telefone);
            return true;
        }
        return false;
    }
}
