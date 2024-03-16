import java.util.List;

//Essa interface declara os metodos para gerenciar todos os produtos de uma caixa
public interface Composite<T> {
    public void add(T product);
    public List<T> getFilho();
    public double getPreco(); //retorna a soma de todos os preços dos produtos
}
