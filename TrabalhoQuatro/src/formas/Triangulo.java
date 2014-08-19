package formas;


public class Triangulo extends Poligono{
	private double lado;
	public Triangulo(double lado){
		this.lado = lado;
	}
	@Override
	public double getArea() {
		double areaTriangulo;
		areaTriangulo = (lado * Math.sqrt(3) / 2);
		 return areaTriangulo;
	}
}
