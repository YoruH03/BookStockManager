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
public class Cliente {
    private String endereco;
    private String dataNascimento;
    private String celular;
    private ArrayList carrinho;

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

    public Cliente(String endereco, String dataNascimento, String celular, ArrayList carrinho) {
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
        this.celular = celular;
        this.carrinho = carrinho;
    }
    public void Comprar(String produto,int Quantidade){
        System.out.println("Item adicionado ao carrinho!");
    
}
    
    
    
    
}
