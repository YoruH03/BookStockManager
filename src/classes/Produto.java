package classes;


public class Produto {
    public String titulo;
    public double preço;
    public int quantidadeEstoque;
    public String codigoDoProduto;
    public String descrição;
    public String genero;
    public String autor;

    
    public Produto(String titulo, double preço, int quantidadeEstoque, String codigoDoProduto, String descrição){
    this.titulo = titulo;
    this.preço = preço;
    this.quantidadeEstoque = quantidadeEstoque;
    this.codigoDoProduto = codigoDoProduto;
    this.descrição = descrição;
    }
    
    public void MostraDados(){
        System.out.println(titulo);
        System.out.println(preço);
        System.out.println(quantidadeEstoque);
        System.out.println(codigoDoProduto);
        System.out.println(descrição);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getCodigoDoProduto() {
        return codigoDoProduto;
    }

    public void setCodigoDoProduto(String codigoDoProduto) {
        this.codigoDoProduto = codigoDoProduto;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }
    
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
}
