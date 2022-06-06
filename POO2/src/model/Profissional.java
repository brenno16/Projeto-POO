package model;
import java.util.ArrayList;
import java.util.List;

public class Profissional extends Pessoa {

	private int matricula;
	private String cargo;
	private List<OperadorDeMaquinas> operador = new ArrayList<>();
	private List<Progamador> progamador = new ArrayList<>();
	
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public List<OperadorDeMaquinas> getOperador() {
		return operador;
	}
	public void setOperador(List<OperadorDeMaquinas> operador) {
		this.operador = operador;
	}
	public List<Progamador> getProgamador() {
		return progamador;
	}
	public void setProgamador(List<Progamador> progamador) {
		this.progamador = progamador;
	}
	
	
	
	
}
