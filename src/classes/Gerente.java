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
    private String cadastroGerente;

    public Gerente(String nome, String CPF, String email, String senha) {
        super(nome, CPF, email, senha);
    }

    public Gerente(String cadastroGerente, String nome, String CPF, String email, String senha) {
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
