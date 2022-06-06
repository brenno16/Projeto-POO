package model;
import java.util.ArrayList;
import java.util.List;


public class Setor {
	private String descricao;
	private int codigo;
	private List<Pessoa> pessoas = new ArrayList<>();
	
	
	
	public String getDescricao() {
		return descricao;
	}



	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}



	public int getCodigo() {
		return codigo;
	}



	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}



	public List<Pessoa> getPessoas() {
		return pessoas;
	}



	public void setPessoas(Pessoa pessoa) {
		this.pessoas.add(pessoa);
	}



	public void getDados() {
		System.out.println();
		System.out.println("###############################");
		System.out.println("DADOS do Setor " + this.codigo);
		System.out.println("Descri�ao: " + descricao);
		System.out.println("Codigo: " + codigo);
		System.out.println("Lista de pessoas do Setor");
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa.getNome());
			
		}
	}

}
