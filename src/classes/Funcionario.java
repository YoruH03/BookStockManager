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
    
    
    //Construtor de Funcionário
    public Funcionario(String nome, String CPF, String email, String senha) {
        super(nome, CPF, email, senha);
    }

    //Construtor de Funcionários com os atributos de Funcionário
    public Funcionario(String nome, String CPF, String email, String senha,String cadastroFuncionario) {
        super(nome, CPF, email, senha);
        this.cadastroFuncionario = cadastroFuncionario;
    }

    public String getCadastroFuncionario() {
        return cadastroFuncionario;
    }

    public void setCadastroFuncionario(String cadastroFuncionario) {
        this.cadastroFuncionario = cadastroFuncionario;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "cadastroFuncionario=" + cadastroFuncionario + '}';
    }
    
    
    
}
