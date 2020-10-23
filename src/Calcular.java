
public class Calcular {

	public float calcularbask(float a, float b, float c) {

		return (b * b) + (-4 * (a * c));
	}

	public double calc1(double a, double b, double c) {

		return (-b + Math.sqrt(c)) / (2 * a);
	}

	public double calc2(double a, double b, double delta) {

		return (-b -Math.sqrt(delta))/(2 * a);
	}
}
