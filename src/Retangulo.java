public class Retangulo extends Poligono implements Diagonal{
	
	public Retangulo(double base, double altura) {
		super(base, altura);
	}

	@Override
	public double area() {
		return super.getAltura() * super.getBase();
	}

	@Override
	public double CalculaDiagonal() {
		return Math.sqrt(
					Math.pow(  super.getAltura(), 2  )   +   Math.pow(   super.getBase(), 2 )
				);
	}
	@Override
	public double perimetro() {
		return super.getAltura() * 2 + super.getBase() * 2;
	}
}
