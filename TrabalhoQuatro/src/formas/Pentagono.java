package formas;

public class Pentagono extends Triangulo {
	
	public Pentagono(double lado) {
		super(lado);
	}
	public double getArea(){
		 return (super.getArea() *5);
	}

}
