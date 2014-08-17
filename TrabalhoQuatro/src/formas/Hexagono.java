package formas;

public class Hexagono extends Triangulo {

	public Hexagono(double lado) {
		super(lado);
	}
	@Override
	public double getArea(){
		 return (super.getArea() *6);
	}
	

}
