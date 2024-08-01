package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalagoLivros {

    private List<Livro> listaLivros;

    public CatalagoLivros() {
        this.listaLivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){

        listaLivros.add(new Livro(titulo, autor, anoPublicacao));

    }

    public List<Livro> paesquisaPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!listaLivros.isEmpty()){
            for (Livro l : listaLivros){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if(!listaLivros.isEmpty()){
            for(Livro l : listaLivros){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!listaLivros.isEmpty()){
            for(Livro l : listaLivros){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalagoLivros catalagoLivros = new CatalagoLivros();
        catalagoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalagoLivros.adicionarLivro("Livro 2", "Autor 2", 2021);
        catalagoLivros.adicionarLivro("Livro 3", "Autor 2", 2022);
        catalagoLivros.adicionarLivro("Livro 4", "Autor 3", 2023);
        catalagoLivros.adicionarLivro("Livro 5", "Autor 4", 1999);
        catalagoLivros.adicionarLivro("Livro 6", "Autor 5", 1994);

        System.out.println(catalagoLivros.paesquisaPorAutor("Autor 2"));
        System.out.println(catalagoLivros.pesquisaPorIntervaloAnos(1994, 1999));
        System.out.println(catalagoLivros.pesquisarPorTitulo("Livro 2"));

    }
}
