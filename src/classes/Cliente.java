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
public class Cliente extends Usuario{
    //A classe de cliente herda de funcionário
    
    //Declaração de atributos privados para o cliente
    private String endereco;
    private String dataNascimento;
    private String celular;
    private ArrayList carrinho;
    private String idCliente;
    public static ArrayList<Cliente> listaClientes = new ArrayList();

    public static  int index_cliente;
    
    
    //Construtor de Cliente com TODOS OS ATRIBUTOS(Atributos de usuário + atributos de cliente)
        public Cliente(String nome, String CPF, String email, String senha,String endereco, String dataNascimento, String celular) {
        super(nome, CPF, email, senha);
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
        this.celular = celular;
        this.idCliente = String.valueOf(listaClientes.size());
    }

    public Cliente(String nome, String CPF, String email, String senha) {
        super(nome, CPF, email, senha);
        this.idCliente = "0";
    }
        
    
        
    //Getters e Setters para os atributos de Cliente

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public ArrayList getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(ArrayList carrinho) {
        this.carrinho = carrinho;
    }

    public Cliente() {
    }

    public ArrayList getListaClientes() {
        return listaClientes;
    }
    
    
    
    public void Comprar(String produto,int Quantidade){
        System.out.println("Item adicionado ao carrinho!");
    
}

    public String getIdCliente() {
        return idCliente;
    }

    
    public static int getIndex_cliente() {
        return index_cliente;
    }
    
    public boolean loginCliente(String email, String senha){
        if(this.email.equals(email) && this.senha.equals(senha)){
            return true;
        }else{
            return false;
        }
        
    }
    @Override
    public String toString(){
        String resultado = super.toString();
        resultado += "Endereço: "+this.endereco + "\n"
                +"Data Nascimento: "+this.dataNascimento+"\n"
                +" Celular: "+this.celular;
        return resultado;
    }
    
    
    
    
}
