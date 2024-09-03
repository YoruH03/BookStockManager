package classes;

import java.util.Date;
import java.util.List;

public class Pagamento extends Carrinho{
    private String formaPagamento;
    private String senha;
    private Pedido pedido = new Pedido();

    public Pagamento() {
        this.formaPagamento="nada";
    }
    
    

    public Pagamento(String formaPagamento, String senha, int numCarrinho, Date data, double total, List<String> produtos) {
        //super(numCarrinho, data, total, produtos);
        this.formaPagamento = formaPagamento;
        this.senha = senha;
    }


    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    public void MudarFormaDePagamento(String formaPagamento){
        this.formaPagamento = formaPagamento;
    }
    public boolean Pagar(String senha){
        if(senha == this.senha){
            System.out.println("Pagamento aprovado");
            return true;
        }else{
            System.out.println("");
            return false;
        }
    }
    
}
