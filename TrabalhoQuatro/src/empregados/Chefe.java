package empregados;

public class Chefe extends Empregado{
	private double salarioMensal;
	public Chefe(String primeiroNome, String ultimoNome, double salarioMensal) {
		super(primeiroNome, ultimoNome);
		this.salarioMensal  = salarioMensal;
		
	}
	public double calcularGanho(){
		return this.salarioMensal;
	}

}
