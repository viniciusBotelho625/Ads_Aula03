
public class Losango extends Poligono {
	
	public Losango(double base, double altura) {
		super(base, altura);
	}

	@Override
	public double area() {
		return super.getAltura() * super.getBase();
	}
	
	@Override
	public double perimetro() {
		return Math.pow(super.getBase(), 4);
	}

	@Override
	public String toString() {
		return "Losango [area()=" + area() + ", perimetro()=" + perimetro() + "]";
	}
	
}
