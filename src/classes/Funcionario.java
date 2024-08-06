/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Yuri
 */
public class Funcionario extends Usuario{
    private String cadastroFuncionario;

    public String getCadastroFuncionario() {
        return cadastroFuncionario;
    }

    public void setCadastroFuncionario(String cadastroFuncionario) {
        this.cadastroFuncionario = cadastroFuncionario;
    }

    public Funcionario(String nome, String CPF, String email, String senha) {
        super(nome, CPF, email, senha);
    }

    public Funcionario(String cadastroFuncionario, String nome, String CPF, String email, String senha) {
        super(nome, CPF, email, senha);
        this.cadastroFuncionario = cadastroFuncionario;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "cadastroFuncionario=" + cadastroFuncionario + '}';
    }
    
    
    
}
