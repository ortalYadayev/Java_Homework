public class Rectangle {

	private int x, y;
	private int height, width;

	public Rectangle(int a, int b, int c, int d) {

		x = a;
		y = b;
		height = c;
		width = d;
	}

	public int getArea() {

		return height * width;
	}

	public Rectangle() {
		height = 1;
		width = 1;
		x = 0;
		y = 0;
	}

	public Rectangle(int a, int b) {

		x = a;
		y = b;
		height = 1;
		width = 1;
	}

	public int getPerimiter() {

		int total = 2 * (height + width);
		return total;

	}

	public void show() {
		System.out.print("x=");
		System.out.print(x);
		System.out.print(", y=");
		System.out.print(y);
		System.out.print(", width=");
		System.out.print(width);
		System.out.print(", height=");
		System.out.print(height);
	}

	public void moveTo(int move, int move2) {

		x = move;
		y = move2;

	}

	public boolean isInside(int xa, int ya) {

		int newx = x + height, newy = y + width;
		if (xa >= this.x && xa <= newx && ya >= y && ya <= newy)
			return true;
		else
			return false;
	}

	public double getDiagonalLength() {
		double total_number;
		total_number = (height * height) + (width * width);
		// total_number = total_number*total_number;
		total_number = Math.sqrt(total_number);
		return total_number;

	}

	public boolean isSquare() {

		if (height == width)
			return true;
		else
			return false;
	}

	public boolean isGolden() {
		if (width == 1.618 * height)
			return true;
		else
			return false;
	}

}
