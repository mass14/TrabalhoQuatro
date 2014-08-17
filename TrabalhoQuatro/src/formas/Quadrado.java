package formas;

public class Quadrado extends Retangulo {
	private double lado;
	public Quadrado(double lado, double base) {
		super(lado, base);
		this.lado = lado;
	}

	public double getArea(){
		return Math.pow(lado, 2);
	}
}


