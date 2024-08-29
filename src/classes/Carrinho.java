package classes;

import java.util.List;
import java.util.Date;

public class Carrinho {
    //Declaração de atributos  protegidos do carrinho
    protected int numCarrinho;
    protected Date data;
    protected double total;
<<<<<<< Updated upstream
    protected List<String> produtos;
=======
    public static ArrayList<Produto> listaProdutos = new ArrayList();
    public static ArrayList<Carrinho> listaCarrinho = new ArrayList();
>>>>>>> Stashed changes

    //Construtor de carrinho. Um vazio e outro com os atributos dados
    public Carrinho() {
    }
    
        public Carrinho(int numCarrinho, Date data, double total, List<String> produtos) {
        this.numCarrinho = numCarrinho;
        this.data = data;
        this.total = total;
        this.produtos = produtos;
    }

    public String mostarProdutos(){
        String resultado="";
        for(Produto item: listaProdutos){
            resultado = resultado +item.getTitulo()+" X "+item.getQuantidadeComprada()+" , ";
        }
        return resultado;
    }
    public Carrinho(int numCarrinho, String data, double total,ArrayList<Produto> listaProdutos) {
        this.numCarrinho = numCarrinho;
        this.data = data;
        this.total = total;
        this.listaProdutos = listaProdutos;
    }

    public static void setListaProdutos(ArrayList<Produto> listaProdutos) {
        Carrinho.listaProdutos = listaProdutos;
    }

    public static void setListaCarrinho(ArrayList<Carrinho> listaCarrinho) {
        Carrinho.listaCarrinho = listaCarrinho;
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

<<<<<<< Updated upstream
    public List<String> getProdutos() {
        return produtos;
    }
=======
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

>>>>>>> Stashed changes

    public void setProdutos(List<String> produtos) {
        this.produtos = produtos;
    }
    
    
}
