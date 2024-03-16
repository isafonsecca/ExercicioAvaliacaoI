import java.util.ArrayList;
import java.util.List;

public class ProdutosComposite implements Composite<ProdutosComponent> { //classe que representa um nó uma caixa
    private List<ProdutosComponent> filhos = new ArrayList<>(); //lista de produtos

    public void add(ProdutosComponent produto){
        filhos.add(produto);
    }

    //metodo obtem a lista de produtos que estarao contidos em uma caixa
    public List<ProdutosComponent> getFilho(){
        return filhos;
    }

    //metodo que calcula o valor total dos itens da caixa
    public double getPreco(){ // ou seja vai somar os valores de cada filho
        double soma = 0;
        for(ProdutosComponent filho : filhos){ //for each que itera sob cada filho
            soma += filho.getPreco(); //acessa o preço de cada filho e acumula na variavel soma
        }
        return soma;
    }
    
}
