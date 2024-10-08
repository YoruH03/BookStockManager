/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Yuri
 */
public class Gerente extends Usuario{
    //Classe Gerente herda de Usuário
    private String cadastroGerente;

    //Construtor para Gerente, com os atributos de Usuário
    public Gerente(String nome, String CPF, String email, String senha) {
        super(nome, CPF, email, senha);
        this.cadastroGerente = "0";
    }

    //Construtor para Gernete com os atributos de usuário + gerente
    public Gerente(String nome, String CPF, String email, String senha, String cadastroGerente ) {
        super(nome, CPF, email, senha);
        this.cadastroGerente = cadastroGerente;
    }

    public String getCadastroGerente() {
        return cadastroGerente;
    }

    public void setCadastroGerente(String cadastroGerente) {
        this.cadastroGerente = cadastroGerente;
    }
    
    
    
}
