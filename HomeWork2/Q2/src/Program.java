
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Line line = new Line();
		Line parallel = new Line(0,2,2,3);
		System.out.println(parallel.get_slope());
		Line perpendicular  = new Line(0,1,2,-3);
		double x;
		x=perpendicular.get_slope()*line.get_slope();
		System.out.println(x);
	}

}


