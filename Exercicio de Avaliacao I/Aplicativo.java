public class Aplicativo {
    public static void main(String[] args) {
        ProdutosFolha tenis = new ProdutosFolha("Tênis", 200.0);
        ProdutosFolha mala = new ProdutosFolha("Mala", 500.0);

        Composite<ProdutosComponent> caixa1 = new ProdutosComposite();
        caixa1.add(tenis);
        caixa1.add(mala);

        System.out.println(tenis.getNome() + ": R$" + tenis.getPreco());
        System.out.println(mala.getNome() +  ": R$" + mala.getPreco());
        System.out.println("Preço total: R$" + caixa1.getPreco());
    }
    
}
