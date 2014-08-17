package empregados;

public class TestaEmpregado {

	public static void main(String[] args) {
		Chefe c = new Chefe ("Maria", "Simas", 3560.90);
		TrabalhadorComissionado tc = new TrabalhadorComissionado("Maria", "Simass", 5000, 630, 10);
		TrabalhadorPecaProduzida tp = new TrabalhadorPecaProduzida("Maria", "Ssimas", 600, 100);
		TrabalhadorHora th = new TrabalhadorHora("Maria", "Ssimass", 60, 100);
		System.out.println(tc.calcularGanho());
		System.out.println(tp.calcularGanho());
		System.out.println(th.calcularGanho() + "\n" + c.calcularGanho());
		

	}

}
