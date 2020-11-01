
public class Line {

	private double x1, y1;
	private double x2, y2;

	public Line() {
		x1 = 0;
		y1 = 1;
		x2 = 4;
		y2 = 3;
	}

	public Line(double a, double b, double c, double d) {
		x1 = a;
		y1 = b;
		x2 = c;
		y2 = d;
	}

	public Line(double number1, double number2) {
		x1 = 0;
		y1 = 0;
		x2 = number1;
		y2 = number2;
	}

	public void show() {
		System.out.println("("+x2+","+y2+")-("+x1+","+y1+")");
	}

	public double get_slope() {
		double total_y;
		double total_x;
		double total;

		total_y = y2 - y1;
		total_x = x2 - x1;
		total = total_y / total_x;

		return total;
	}

	public boolean is_on_line(double x, double y) {
		double n1 = this.y1 - this.get_slope() * this.x1;
		double n2 = y - this.get_slope() * x;

		if (Math.abs(n1 - n2) < 0.0001) {
			return true;
		}

		else
			return false;
	}

}
