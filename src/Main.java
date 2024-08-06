import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Cliente> clientes = new HashMap<>();
        Map<String, Funcionario> funcionarios = new HashMap<>();
        Map<String, Carro> carros = new HashMap<>();
        Map<String, Servico> servicos = new HashMap<>();

        ArrayList<String> opcoes = new ArrayList<>();
        opcoes.add("1 - Solicitar serviço");
        opcoes.add("2 - Exibir serviços");
        opcoes.add("3 - Cadastrar Cliente");
        opcoes.add("4 - Cadastrar Carro");
        opcoes.add("5 - Cadastrar Funcionario");
        opcoes.add("6 - Sair");

        while (true) {
            System.out.println("\n============== LavaCar do luis ==============");
            for (String opcao : opcoes) {
                System.out.println(opcao);
            }

            System.out.print("\nEscolha uma opcao: ");
            int escolha = scan.nextInt();
            scan.nextLine();

            executar(escolha, clientes, funcionarios, carros, servicos, scan);
        }
    }

    private static void executar(int escolha, Map<String, Cliente> clientes, Map<String, Funcionario> funcionarios, Map<String, Carro> carros, Map<String, Servico> servicos, Scanner scan) {
        System.out.println();

        switch (escolha) {
            case 1:
                if (clientes.isEmpty() || funcionarios.isEmpty() || carros.isEmpty()) {
                    System.out.println("**Você precisa cadastrar pelo menos 1 cliente, 1 funcionário e 1 carro para solicitar um serviço!");
                } else {
                    System.out.println("Solicitar serviço selecionado.");

                    System.out.println();
                    System.out.println("++++++ Cadastrando novo serviço ++++++");
                    System.out.print("1 hora = 30 reais");
                    System.out.println();


                    System.out.print("Digite o cpf do cliente: ");
                    String cpfCliente = scan.nextLine();

                    System.out.print("Digite o cpf do funcionario: ");
                    String cpfFuncionario = scan.nextLine();

                    System.out.print("Digite a descrição do serviço: ");
                    String descricao = scan.nextLine();

                    System.out.print("Digite quantas horas serão gastas no serviço: ");
                    int preco = scan.nextInt() * 30;

                    Servico servico = new Servico(clientes.get(cpfCliente), funcionarios.get(cpfFuncionario), carros.get(cpfCliente), preco, descricao);
                    servicos.put(cpfCliente, servico);
                    System.out.println("servico cadastrado com sucesso!!");

                }
                break;
            case 2:
                System.out.println("-=-=-=-=-=-=- Serviços -=-=-=-=-=-=-");
                if (servicos.isEmpty()) {
                    System.out.println("Nenhum serviço cadastrado.");
                } else {
                    servicos.forEach((k, s) -> {
                        String cliente = s.getCliente().getNome();
                        String modelo = s.getCarro().getModelo();
                        String placa = s.getCarro().getPlaca();
                        String descricao = s.getDescricao();
                        double preco = s.getPreco();
                        String funcionario = s.getFuncionario().getNome();

                        System.out.println();
                        System.out.printf("-------- valor: %s reais --------", preco);
                        System.out.println();
                        System.out.println("ID: " + k);
                        System.out.println("funcionario responsavel: " + funcionario);
                        System.out.println("cliente: " + cliente);
                        System.out.println("carro: " + modelo);
                        System.out.println("placa: " + placa);
                        System.out.println("detalhes: " + descricao);
                        System.out.println("-----------------------------");
                    });
                }
                System.out.println();
                System.out.println("enter para voltar para o menu");

                scan.nextLine();

                break;
            case 3:
                System.out.println("Cadastrar Cliente selecionado.");

                System.out.println();
                System.out.println("++++++ Cadastrando novo Cliente ++++++");
                System.out.print("Digite o nome: ");
                String nome = scan.nextLine();

                System.out.print("Digite o sobrenome: ");
                String sobrenome = scan.nextLine();

                System.out.print("Digite o CPF: ");
                String cpf = scan.nextLine();

                Cliente cliente = new Cliente(nome, sobrenome, cpf);
                clientes.put(cpf, cliente);

                System.out.println();
                System.out.println("Cliente cadastrado com sucesso!!");
                break;
            case 4:
                System.out.println("Cadastrar Carro selecionado.");

                System.out.println("++++++ Cadastrando novo Carro ++++++");
                System.out.print("Digite a placa: ");
                String placa = scan.nextLine();

                System.out.print("Digite o modelo: ");
                String modelo = scan.nextLine();

                Cliente dono = null;
                while (dono == null) {
                    System.out.print("Digite o CPF do dono: ");
                    String cpfDono = scan.nextLine();
                    dono = clientes.get(cpfDono);
                    if (dono == null) {
                        System.out.println("CPF não encontrado. Tente novamente.");
                    }
                }

                Carro carro = new Carro(placa, modelo, dono);
                carros.put(dono.getCpf(), carro);

                System.out.println();
                System.out.println("Carro cadastrado com sucesso!!");
                break;
            case 5:
                System.out.println("Cadastrar Funcionario selecionado.");

                System.out.println("++++++ Cadastrando novo Funcionario ++++++");
                System.out.print("Digite o nome: ");
                String nomeFuncionario = scan.nextLine();

                System.out.print("Digite o sobrenome: ");
                String sobrenomeFuncionario = scan.nextLine();

                System.out.print("Digite o CPF: ");
                String cpfFuncionario = scan.nextLine();

                Funcionario funcionario = new Funcionario(nomeFuncionario, sobrenomeFuncionario, cpfFuncionario);
                funcionarios.put(cpfFuncionario, funcionario);

                System.out.println();
                System.out.println("Funcionario cadastrado com sucesso!!");
                break;
            case 6:
                System.out.println("Saindo...");
                System.exit(0);
                return;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    }
}
