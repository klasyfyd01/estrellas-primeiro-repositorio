package aula14Exe1;

/*2. Faça um programa que calcule a área de uma figura geométrica. Aceite quatro tipos de figura
geométrica: quadrado, retângulo, triângulo e círculo. Use herança, classe abstrata e
polimorfismo.*/
public  class GeometricArea {
	private double side;
	private double height;
	private double pi = 3.142;
	private double rad;
	private double base;

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getPi() {
		return pi;
	}

	public void setPi(double pi) {
		this.pi = pi;
	}

	public double getRad() {
		return rad;
	}

	public void setRad(double rad) {
		this.rad = rad;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double calculateArea() {
		return 0;
	}
}
