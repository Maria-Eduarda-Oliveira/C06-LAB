package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner pedido = new Scanner(System.in);
        Scanner pedidot = new Scanner(System.in);
        System.out.println("Digite a sua escolha: ");
        int escolha = pedido.nextInt();
        float ftotal;

        Empresa empresa = new Empresa();
        empresa.nome = "Cafeteria doce café";
        empresa.cnpj = "111111111-0001";
        empresa.endereco = "Rua dos sonhos, nº 3";

        while (escolha != 0) {
            //adicionar funcionario
            if (escolha == 1) {
                System.out.println("Você escolheu a primeira opção!");
                Funcionario funcionario = new Funcionario();
                System.out.println("Digite a matricula do funcionário: ");
                funcionario.matricula = pedido.nextInt();
                System.out.println("Digite a idade do funcionário: ");
                funcionario.pessoa.idade = pedido.nextInt();
                System.out.println("Digite o nome do funcionário: ");
                funcionario.pessoa.nome = pedidot.nextLine();
                System.out.println("Digite o CPF do funcionário: ");
                funcionario.pessoa.cpf = pedidot.nextLine();
                empresa.adicionarFuncionario(funcionario);
            }
            //alocar funcionario
            if (escolha == 2) {
                System.out.println("Você escolheu a segunda opção!");
                empresa.alocarFuncionario(1);
            }
            //contar funcionarios
            if (escolha == 3) {
                System.out.println("Você escolheu a terceira opção!");
                ftotal = empresa.contarFuncionariosDisponiveis();
                System.out.println("Funcionarios totais da empresa: " + ftotal);
                System.out.println("Porcentagem de funcionários livre: " +ftotal/100 * empresa.funcionariosDisponiveis);
            }
            //mostrar informações da empresa
            if (escolha == 4) {
                System.out.println("Você escolheu a quarta opção!");
                empresa.mostraInfo();
            }
            System.out.println("Digite uma nova escolha: ");
            escolha = pedido.nextInt();
        }
    }
}