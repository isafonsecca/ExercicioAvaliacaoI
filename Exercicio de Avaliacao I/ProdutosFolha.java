public class ProdutosFolha implements ProdutosComponent { // classe representa um componente do produto
    private String nome;
    
    private double preco;
    
    public ProdutosFolha(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    

    public double getPreco(){
        return preco;
    }
}
