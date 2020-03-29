
public class Retangulo extends Poligono implements Diagonal{
	
	public Retangulo(double base, double altura) {
		super(base, altura);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return super.area();
	}

	@Override
	public double CalculaDiagonal() {
		// TODO Auto-generated method stub
		return Diagonal.super.CalculaDiagonal();
	}
	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 0;
	}
}
