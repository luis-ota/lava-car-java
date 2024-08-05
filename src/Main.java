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
        opcoes.add("1 - Solicitar servico");
        opcoes.add("2 - Cadastrar Cliente");
        opcoes.add("3 - Cadastrar Carro");
        opcoes.add("4 - Cadastrar Funcionario");
        opcoes.add("5 - Sair");

        while (true) {
            System.out.println("\n============== LavaCar do luis ==============");
            for (String opcao : opcoes) {
                System.out.println(opcao);
            }

            System.out.print("\nEscolha uma opcao: ");
            int escolha = scan.nextInt();

            executar(escolha, clientes, funcionarios, carros, servicos, scan);
        }
    }

    private static void executar(int escolha, Map<String, Cliente> clientes, Map<String, Funcionario> funcionarios, Map<String, Carro> carros, Map<String, Servico> servicos, Scanner scan) {
        System.out.println();

        switch (escolha) {
            case 1:
                if (clientes.isEmpty() || funcionarios.isEmpty() || carros.isEmpty()) {
                    System.out.println("**Voce precisar cadastrar pelo menos 1 cliente, \n1 funcionario e 1 carro para solicitar um servico!");
                } else {
                    System.out.println("Solicitar servico selecionado.");
                }
                break;
            case 2:
                System.out.println("Cadastrar Cliente selecionado.");

                // Adicione a lógica para cadastrar cliente
                break;
            case 3:
                System.out.println("Cadastrar Carro selecionado.");
                // Adicione a lógica para cadastrar carro
                break;
            case 4:
                System.out.println("Cadastrar Funcionario selecionado.");
                // Adicione a lógica para cadastrar funcionário
                break;
            case 5:
                System.out.println("Saindo...");
                System.exit(0);
                return;
            default:
                System.out.println("Opcao invalida. Tente novamente.");
        }
    }
}
