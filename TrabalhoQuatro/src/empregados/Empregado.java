package empregados;

public abstract class Empregado {
	private String primeiroNome;
	private String ultimoNome;
	public Empregado(String primeiroNome, String ultimoNome){
		setPrimeiroNome(primeiroNome);
		setUltimoNome(ultimoNome);
	}	
		
	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getUltimoNome() {
		return ultimoNome;
	}

	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}

	public abstract double calcularGanho();
	
}
