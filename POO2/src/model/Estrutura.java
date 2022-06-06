package model;
import java.util.ArrayList;
import java.util.List;

public class Estrutura {
	private String nome;
	private int codigo;
	private List<Departamento> departamento = new ArrayList<>();

	public void getDados() {

		System.out.println();
		System.out.println("###############################");
		System.out.println("DADOS da Estrutura");
		System.out.println("Nome: " + nome);
		System.out.println("Codigo: " + codigo);
		System.out.println("Lista de codigos dos Departamentos");
		for (Departamento departamento : departamento) {
			System.out.println(departamento.getCodigo());
		}

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public List<Departamento> getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento.add(departamento);
	}

}
