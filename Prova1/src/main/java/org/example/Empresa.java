package org.example;
public class Empresa {
    String nome;
    String cnpj;
    String endereco;
    int funcionariosDisponiveis;
    Funcionario [] funcionarios = new Funcionario[3];
    int aux; //auxiliar para contar todos os funcionarios

    void mostraInfo(){
        System.out.println("Nome da empresa: "+nome);
        System.out.println("CNPJ da empresa: "+cnpj);
        System.out.println("Endereço da empresa: "+endereco);
        System.out.println("Funcionários livres na empresa: "+funcionariosDisponiveis);
        System.out.println();
        for (Funcionario f : funcionarios){
            f.mostraInfo();
            f.pessoa.mostraInfo();
        }
    }
    void adicionarFuncionario(Funcionario funcionario){
        for (int i = 0; i < funcionarios.length; i++) {
            if (funcionarios[i] == null) {
                funcionarios[i] = funcionario;
                break;
            }
        }
        funcionariosDisponiveis++;
    }
    //index é quantos funcionários eu dedsejo alocar
    void alocarFuncionario(int index){
        funcionariosDisponiveis -= index;
        System.out.println("O funcionário foi alocado!");
        aux += index;
    }
    float contarFuncionariosDisponiveis(){
        return funcionariosDisponiveis + aux;
    }
}
