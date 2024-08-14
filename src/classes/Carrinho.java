package classes;

import java.util.List;
import java.util.Date;

public class Carrinho {
    //Declaração de atributos  protegidos do carrinho
    protected int numCarrinho;
    protected Date data;
    protected double total;
    protected List<String> produtos;

    //Construtor de carrinho. Um vazio e outro com os atributos dados
    public Carrinho() {
    }
    
        public Carrinho(int numCarrinho, Date data, double total, List<String> produtos) {
        this.numCarrinho = numCarrinho;
        this.data = data;
        this.total = total;
        this.produtos = produtos;
    }
        
        
    //Métodos getters e setters para cada um dos atributos
    public int getNumCarrinho() {
        return numCarrinho;
    }

    public void setNumCarrinho(int numCarrinho) {
        this.numCarrinho = numCarrinho;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public List<String> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<String> produtos) {
        this.produtos = produtos;
    }
    
    
}
