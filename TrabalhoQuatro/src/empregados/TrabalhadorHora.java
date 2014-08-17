package empregados;
//salarioHora * horas
public class TrabalhadorHora extends Empregado {

	private double salarioHoras;
	private int horas;
	
	public TrabalhadorHora(String primeiroNome, String ultimoNome, double salarioHoras, int horas){
		super(primeiroNome, ultimoNome);
		this.salarioHoras = salarioHoras;
		this.horas  = horas;
	}
	public double calcularGanho(){
		return salarioHoras * horas;
	}
}
