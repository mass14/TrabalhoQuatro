package formas;

public class Retangulo extends Poligono {
	private double lado;
	private double base;
	public Retangulo(double lado, double base){
		this.lado = lado;
		this.base= base;
	}
	public double getArea(){
		return lado * base;
	}
}
	
