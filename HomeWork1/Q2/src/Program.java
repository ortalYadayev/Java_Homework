
public class Program {

	public static void main(String[] args)
	{
		levelPoint line= new levelPoint();
		levelPoint parallel = new levelPoint(0, 3, 4, 5);
		System.out.println(parallel.get_slope());
		levelPoint pependicular= new levelPoint(0, 11, 4, 3);
		double x;
		x=line.get_slope()*pependicular.get_slope();
		System.out.println(x);
	}

}
