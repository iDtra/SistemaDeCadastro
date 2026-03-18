
import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PessoaService service = new PessoaService();

        int opcao;

        do{
            System.out.println("\n1 - Cadastro Pessoa Física");
            System.out.println("2 - Cadastrar Pessoa Jurídica");
            System.out.println("3 - Listar");
            System.out.println("4 - Excluir");
            System.out.println("5 - Alterar");
            System.out.println("6 - Sair");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("CPF: ");
                    String cpf = sc.nextLine();

                    if (service.cpfExiste(cpf)){
                        System.out.println("CPF já existe! ");
                        break;
                    }

                    System.out.println("Nome: ");
                    String nome = sc.nextLine();

                    System.out.println("Idade: ");
                    int idade = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Telefone: ");
                    String tel = sc.nextLine();

                    System.out.println("RG: ");
                    String rg = sc.nextLine();

                    service.cadastrar(new PessoaFisica(nome, cpf, idade, tel, rg));
                    break;
                case 2:
                    System.out.println("CPF: ");
                    cpf = sc.nextLine();
                    
                    if (service.cpfExiste(cpf)){
                        System.out.println("CPF já existe! ");
                        break;
                    }

                    System.out.println("Nome: ");
                    nome = sc.nextLine();

                    System.out.println("Idade: ");
                    idade = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Telefone: ");
                    tel = sc.nextLine();

                    System.out.println("CNPJ: ");
                    String cnpj = sc.nextLine();
                    
                    service.cadastrar(new PessoaJuridica(nome, cpf, idade, tel, cnpj));
                    break;

                case 3:
                    service.listar();
                    break;
                
                case 4:
                    System.out.println("CPF para excluir: ");
                    cpf = sc.nextLine();

                    if (service.excluir(cpf)){
                        System.out.println("Removido!");
                    }else{
                        System.out.println("Não encontrado.");
                    }
                    break;
                
                case 5:
                    System.out.println("CPF da pessoa para alterar: ");
                    String cpfAlt = sc.nextLine();

                    Pessoa pessoa = service.buscarPorCpf(cpfAlt);

                    if (pessoa != null){
                        System.out.println("Novo nome: ");
                        String novoNome = sc.nextLine();

                        System.out.println("Nova idade: ");
                        int novaIdade = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Novo telefone: ");
                        String novoTel = sc.nextLine();

                        service.alterar(cpfAlt, novoNome, novaIdade, novoTel);

                        System.out.println("Dados atualizados!");
                    }else{
                        System.out.println("Pessoa não encontrada.");
                    }
                    break;
            }
        }while(opcao != 6);

        sc.close();
    }
}
