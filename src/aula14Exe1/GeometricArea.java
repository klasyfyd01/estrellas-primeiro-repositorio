package aula14Exe1;

/*2. Fa�a um programa que calcule a �rea de uma figura geom�trica. Aceite quatro tipos de figura
geom�trica: quadrado, ret�ngulo, tri�ngulo e c�rculo. Use heran�a, classe abstrata e
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
