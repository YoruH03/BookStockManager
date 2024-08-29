/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.ArrayList;

/**
 *
 * @author Yuri
 */
public class Funcionario extends Usuario{
    private String cadastroFuncionario;
    public static  int index_func;
    public static ArrayList<Funcionario> listaFuncionarios = new ArrayList();

    
    
    //Construtor de Funcionário
    public Funcionario(String nome, String CPF, String email, String senha) {
        super(nome, CPF, email, senha);
        this.cadastroFuncionario= "0";
        //this.cadastroFuncionario=String.valueOf(listaFuncionarios.size());
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
        String resultado = super.toString();
        resultado += resultado + "cadastro de Funcionário: "+this.getCadastroFuncionario();
        return resultado;
    }
    
    public boolean loginFuncionario(String email, String senha){
        if(this.email.equals(email)&&this.senha.equals(senha)){
            return true;
        }else{
            return false;
        }
    }
    
    
    
}
