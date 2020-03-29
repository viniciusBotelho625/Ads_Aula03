import java.util.ArrayList;

public class Geometria {

	public static void main(String[] args) {
		ArrayList<Figura> listaDeFiguras = new ArrayList<Figura>();
		listaDeFiguras.add(new Circulo(10));
		listaDeFiguras.add(new Losango(20, 5));
		listaDeFiguras.add(new Quadrado(10));
		listaDeFiguras.add(new Retangulo(40, 15));
		listaDeFiguras.add(new Triangulo(30,35));
		
		for (Figura figura : listaDeFiguras) {
			System.out.println(figura);
		}
	}
}
