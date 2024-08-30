package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Carrinho {
    //Declaração de atributos  protegidos do carrinho
    protected int numCarrinho;
    protected String data;
    protected double total;
    public static ArrayList<Produto> listaProdutos = new ArrayList();
    public static ArrayList<Carrinho> listaCarrinho = new ArrayList();

    //Construtor de carrinho. Um vazio e outro com os atributos dados
    public Carrinho() {
    }

    public Carrinho(int numCarrinho, String data) {
        this.numCarrinho = numCarrinho;
        this.data = data;
    }
    
    
    
        public Carrinho(int numCarrinho, String data,ArrayList<Produto> listaProdutos) {
        this.numCarrinho = numCarrinho;
        this.data = data;
        double aux = 0;
        this.listaProdutos = listaProdutos;
        for(Produto item : listaProdutos){
            double saldo = item.getPreço()*item.getQuantidadeComprada();
            aux = aux + saldo;
            
        }
        this.total = aux;
    }
        
        
    //Métodos getters e setters para cada um dos atributos
    public int getNumCarrinho() {
        return numCarrinho;
    }

    public void setNumCarrinho(int numCarrinho) {
        this.numCarrinho = numCarrinho;
    }


    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    



    
    
}
