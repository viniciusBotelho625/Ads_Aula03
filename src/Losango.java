
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
		// TODO Auto-generated method stub
		return Math.pow(super.getBase(), 4);
	}
}
