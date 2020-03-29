public class Triangulo extends Poligono {

	public Triangulo(double base, double altura) {
		super(base, altura);
	}
	@Override
	public double area() {
		return super.getBase() * super.getAltura() / 2;
	}
	@Override
	public double perimetro() {
		double cateto = super.getBase() / 2;
		double hipotenusa = Math.pow(cateto, 2) + Math.pow(super.getAltura(), 2);
		
		return hipotenusa * super.getBase() + super.getBase() * hipotenusa + Math.pow(hipotenusa, 2);
	}
}
