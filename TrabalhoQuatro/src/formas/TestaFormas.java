package formas;

public class TestaFormas {

	public static void main(String[] args) {
		Hexagono h = new Hexagono(9);
		Pentagono p = new Pentagono(9);
		Quadrado q = new Quadrado(9, 9);
		Retangulo r = new Retangulo(9, 9);
		Retangulo rr = new Retangulo(9, 1);

		System.out.println(h.getArea());
		System.out.println(p.getArea());
		System.out.println(q.getArea());
		System.out.println(r.getArea());
		System.out.println(rr.getArea());
	}

}
