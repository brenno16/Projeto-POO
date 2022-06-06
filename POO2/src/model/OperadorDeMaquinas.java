package model;

public class OperadorDeMaquinas extends Profissional implements Bonificacao {

	private String cargaHoraria;
	private float salario;
	private int HorasEx, extra;

	public int getExtra() {
		return extra;
	}

	private void setExtra(int extra) {
		this.extra = extra;
	}

	public int getHorasEx() {
		return HorasEx;
	}

	public void setHorasEx(int horasEx) {
		this.HorasEx = horasEx;
	}

	public String getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(String cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public void getSalario() {

		if (HorasEx == 0) {

			System.out.print("Seu salario é: R$" + salario);
		} else {
			getBonificacao();
			this.salario += extra;
			System.out.println("************************");
			System.out.println("Você tem um extra pela suas horas extras de : R$" + extra);
			System.out.println("seu novo salario é de : R$" + salario);

		}
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	@Override
	public void getBonificacao() {

		setExtra(getHorasEx() * 10);
		System.out.println("Seu extra é de:" + getExtra());

	}

}
