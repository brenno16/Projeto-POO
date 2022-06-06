package model;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {
	private String nome;
	private String cpf;
	private String dataNacimento;
 	private List<Profissional> proficional = new ArrayList<>();
 	
 	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getDataNacimento() {
		return dataNacimento;
	}
	public void setDataNacimento(String dataNacimento) {
		this.dataNacimento = dataNacimento;
	}
	public List<Profissional> getProficional() {
		return proficional;
	}
	public void setProficional(Profissional proficional) {
		this.proficional.add(proficional);
	}
 	
    //	public void getDados() {
 	//	System.out.println();
	//	System.out.println("###############################");
	//	System.out.println();
 	//}
 	
 	

}
