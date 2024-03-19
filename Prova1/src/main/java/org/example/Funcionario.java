package org.example;
public class Funcionario {
    int matricula;
    Pessoa pessoa;

    public Funcionario() {
        this.pessoa = new Pessoa();
    }
    void mostraInfo(){
        System.out.println("Matricula do funcionário: "+matricula);
    }
}
