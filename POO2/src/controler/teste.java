package controler;

import model.Departamento;
import model.Empresa;
import model.Estrutura;
import model.OperadorDeMaquinas;
import model.Progamador;
import model.Setor;

public class teste {

	public static void main(String[] args) {

		Progamador progamador = new Progamador();
		progamador.setCpf("888-999-888-98");
		progamador.setDataNacimento("27/01/2002");
		progamador.setCargaHoraria("8h/d");
		progamador.setCargo("Estagiario");
		progamador.setMatricula(444);
		progamador.setNome("Brenno");
		progamador.setSalario(1500);
		progamador.setHorasEx(10);

		OperadorDeMaquinas operador = new OperadorDeMaquinas();
		operador.setCargaHoraria("10h/d");
		operador.setCargo("Gerente");
		operador.setCpf("777-000-888-09");
		operador.setDataNacimento("03/05/2000");
		operador.setMatricula(1234);
		operador.setNome("Naldo");
		operador.setSalario(1000);
		operador.setHorasEx(10);

		Setor setor1 = new Setor();
		setor1.setCodigo(21);
		setor1.setDescricao("");
		setor1.setPessoas(progamador);

		Setor setor2 = new Setor();
		setor2.setCodigo(23);
		setor2.setDescricao("Demoli��o");
		setor2.setPessoas(operador);

		Departamento departamento1 = new Departamento();
		departamento1.setCodigo(11);
		departamento1.setDescricao("Departamento de desenvolvimento");
		departamento1.setSetor(setor1);

		Departamento departamento2 = new Departamento();
		departamento2.setCodigo(222);
		departamento2.setDescricao("Departamento de Opera��es");
		departamento2.setSetor(setor2);

		Estrutura estrutura = new Estrutura();
		estrutura.setCodigo(1);
		estrutura.setNome("Bloco 1");
		estrutura.setDepartamento(departamento2);
		estrutura.setDepartamento(departamento1);

		Empresa empresa = new Empresa();
		empresa.setCnpj("000-000/0001-01");
		empresa.setEndereco("Ruas das Fabricas");
		empresa.setNome("Tech");
		empresa.setEstrutura(estrutura);
		empresa.setPessoas(operador);
		empresa.setPessoas(progamador);

		empresa.getDados();
		estrutura.getDados();
		departamento1.getDados();
		departamento2.getDados();
		setor1.getDados();
		setor2.getDados();
		
		
		progamador.getSalario();
		operador.getSalario();
		
		
	}

}
