package org.example;
public class Pessoa {
    String nome;
    String cpf;
    int idade;

    void mostraInfo(){
        System.out.println("Nome do funcionário: "+nome);
        System.out.println("CPF do funcionário: "+cpf);
        System.out.println("Idade do funcionário: "+idade);
        System.out.println();
    }
}
