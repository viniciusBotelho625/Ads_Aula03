
public class Quadrado extends Poligono implements Diagonal{

	public Quadrado(double lado) {
		super(lado, lado);
	}

	@Override
	public double area() {
		return Math.pow(super.getAltura(), 2);
	}

	@Override
	public double CalculaDiagonal() {
		return super.getAltura() * Math.sqrt(2);
	}
	@Override
	public double perimetro() {
		return super.getAltura() * 4;
	}

	@Override
	public String toString() {
		return "Quadrado [area()=" + area() + ", CalculaDiagonal()=" + CalculaDiagonal() + ", perimetro()="
				+ perimetro() + "]";
	}
	
}
