public class Circulo extends Figura{
	private double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI * (this.raio * this.raio);
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * this.raio;
	}

}