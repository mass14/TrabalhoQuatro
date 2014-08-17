package empregados;
//salario + (comissao * quantidade); 
public class TrabalhadorComissionado extends Empregado{
	private double salarioFixo;
	private  double comissao;
	private int quantidade;
	
	public TrabalhadorComissionado(String primeiroNome, String ultimoNome, double salarioFixo, double comissao, int quantidade){
		super(primeiroNome, ultimoNome);
		this.comissao = comissao;
		this.quantidade = quantidade;
		this.salarioFixo = salarioFixo;
	}
	
	public double calcularGanho(){
		return salarioFixo + comissao * quantidade;
	}
}
