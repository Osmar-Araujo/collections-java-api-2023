package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {

    private List<Pessoa> pessoas;

    public OrdenacaoPessoa() {
        this.pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoas.add(new Pessoa(nome,idade,altura));
    }

    public List<Pessoa> ordenadoPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoas);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> oredenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoas);
        Collections.sort(pessoasPorAltura, new Pessoa.ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Pessoa 1",20, 1.56);
        ordenacaoPessoa.adicionarPessoa("Pessoa 2",30, 1.80);
        ordenacaoPessoa.adicionarPessoa("Pessoa 3",25, 1.70);
        ordenacaoPessoa.adicionarPessoa("Pessoa 4",17, 1.56);
        ordenacaoPessoa.adicionarPessoa("Pessoa 5",15, 1.45);
        ordenacaoPessoa.adicionarPessoa("Pessoa 6",10, 1.50);
        ordenacaoPessoa.adicionarPessoa("Pessoa 7",40, 1.60);

        System.out.println(ordenacaoPessoa.ordenadoPorIdade());
        System.out.println(ordenacaoPessoa.oredenarPorAltura());
    }
}
