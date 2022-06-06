package model;
import java.util.ArrayList;
import java.util.List;

public class Departamento{

	private String descricao;
	private int codigo;
	private List<Setor> setor = new ArrayList<>();
	
	public void getDados() {
		
		System.out.println();
		System.out.println("###############################");
		System.out.println("DADOS do Departamento");
		System.out.println("Descri�ao" + descricao);
		System.out.println("Codigo" + codigo);
		System.out.println("Lista de codigos dos Setores");
		for (Setor setor : setor) {
			System.out.println(setor.getCodigo());
			
		}
		
		
	}

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

	public List<Setor> getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor.add(setor);
	}
	
}
