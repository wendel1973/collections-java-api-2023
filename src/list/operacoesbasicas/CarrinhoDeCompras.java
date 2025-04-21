package list.operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itenscarrinho = new ArrayList<>();

    public CarrinhoDeCompras() {
        this.itenscarrinho = new ArrayList<>();
    }
    public void adicionarItem(String nome, double preco, int quantidade){
        itenscarrinho.add(new Item(nome, preco, quantidade));
    }
    public void removerItem(String nome){
        List<Item> itensARemover = new ArrayList<>();
        for(Item t:itenscarrinho){
            if (t.getNome().equalsIgnoreCase(nome)){
                itensARemover.add(t);
            }

        }
        itenscarrinho.removeAll(itensARemover);
    }
    public double calcularValorTotal(){
        double soma = 0;
        for(Item t:itenscarrinho){
            soma = soma + (t.getPreco() * t.getQuantidade());

        }
        return soma;
    }
    public void exibirItens(){
        System.out.println(itenscarrinho);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem("Arroz", 10, 2);
        carrinhoDeCompras.adicionarItem("Feijao", 20, 2);
        carrinhoDeCompras.adicionarItem("Acucar", 5, 2);

        carrinhoDeCompras.exibirItens();

        System.out.println("Valor total: "+carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.removerItem("Acucar");

        System.out.println("Valor total: "+carrinhoDeCompras.calcularValorTotal());
    }
}
