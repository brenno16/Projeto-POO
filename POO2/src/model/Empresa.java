package model;
import java.util.ArrayList;
import java.util.List;

public class Empresa {

	private String nome;
	private String cnpj;
	private String endereco;
	private Estrutura estrutura;
	private List<Pessoa> pessoas = new ArrayList<>();

	public void getDados() {
		
		System.out.println();
		System.out.println("###############################");
		System.out.println("DADOS da Empresa");
		System.out.println("Nome: " + nome);
		System.out.println("CNPJ: " + cnpj);
		System.out.println("Endere�o: " + endereco);
		System.out.println("Estrutura: " + estrutura.getNome());
		System.out.println("Lista de Pessoas");
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa.getNome());

		}
		

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Estrutura getEstrutura() {
		return estrutura;
	}

	public void setEstrutura(Estrutura estrutura) {
		this.estrutura = estrutura;
	}

	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(Pessoa pessoas) {
		this.pessoas.add(pessoas);
	}
}
