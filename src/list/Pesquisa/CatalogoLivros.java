package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> catalogoLivros;

    public CatalogoLivros() {
        this.catalogoLivros = new ArrayList<>();
    }
    public void adicionarLivro(Livro livro){
        catalogoLivros.add(livro);

    }
    public  void exibirCatalogoDeLivros(){
        System.out.println(catalogoLivros);
        for(Livro l:catalogoLivros){
            System.out.println(l.toString());
        }
    }
    public void pesquisarPorAutor(String autor){
        List<Livro> pesquisaLivro = new ArrayList<>();
        for (Livro catalogoLivro : catalogoLivros) {
            if(catalogoLivro.getAutor().equalsIgnoreCase(autor)){
                pesquisaLivro.add(catalogoLivro);
            }

        }
        System.out.println("Pesquisa autor: "+pesquisaLivro.toString());

    }
    public void pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> pesquisaAno = new ArrayList<Livro>();
        for (Livro l : catalogoLivros) {
            if(l.getAnoPublicacao()>= anoInicial && l.getAnoPublicacao() <= anoFinal){
                pesquisaAno.add(l);
            }

        }
        System.out.println("Pesquisa por Ano: "+pesquisaAno);

    }
    public void pesquisarPorTitulo(String titulo){
        List<Livro> pesquisaTitulo = new ArrayList<>();
        for (Livro catalogoLivro : catalogoLivros) {
            if(catalogoLivro.getTitulo().equalsIgnoreCase(titulo)){
                pesquisaTitulo.add(catalogoLivro);
            }

        }
        System.out.println("Pesquisa título: "+pesquisaTitulo);

    }

    public static void main(String[] args) {
        Livro livro1 = new Livro("Menino do Brasil", "Wendel da Silva", 1992);
        Livro livro2 = new Livro("Pelota Bolota", "Marcos Assunção", 1975);
        Livro livro3 = new Livro("Guerra nas Estrelas", "Pedro Assunção", 1978);
        CatalogoLivros catalogo = new CatalogoLivros();
        catalogo.adicionarLivro(livro1);
        catalogo.adicionarLivro(livro2);
        catalogo.adicionarLivro(livro3);

        catalogo.exibirCatalogoDeLivros();

        catalogo.pesquisarPorAutor("Wendel da Silva");
        catalogo.pesquisarPorTitulo("Menino do Brasil");
        catalogo.pesquisarPorIntervaloAnos(1975,1978);

    }
}
