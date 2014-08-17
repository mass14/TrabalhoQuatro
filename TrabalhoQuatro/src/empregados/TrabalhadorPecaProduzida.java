package empregados;
// remuneracão * quantidade
public class TrabalhadorPecaProduzida extends Empregado{
	private double remuneracao;
	private int quantidade;
	
	public TrabalhadorPecaProduzida(String primeiroNome, String ultimoNome, double remuneracao, int quantidade){
		super(primeiroNome, ultimoNome);
		this.quantidade = quantidade;
		this.remuneracao = remuneracao;
	}
	
	public double calcularGanho(){
		return remuneracao + quantidade;
	}
	
}
