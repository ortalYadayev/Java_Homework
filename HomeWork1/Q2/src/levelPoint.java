
public class levelPoint 
{
	int x1, x2, y1, y2;
	public levelPoint()
	{
		x1=0;
		y1=1;
		x2=4;
		y2=3;
	}
	public levelPoint(int a,int b,int c, int d)
	{
		x1=a;
		y1=b;
		x2=c;
		y2=d;
	}
	public levelPoint(int a,int b)
	{
		x1=a;
		y1=b;
		x2=0;
		y2=0;
	}
	public void show()
	{
		System.out.println("("+x1+","+y1+")"+"-"+"("+x2+","+y2+")");
	}
	public Double get_slope()
	{
		return ((double)(y2-y1)/(double)(x2-x1));
	}
	public boolean Match (int m,int n)
	{
		double a=(y2-y1)/(x2-x1);
		double b1=m-a*n;
		double b2=y1-a*x1;
		if(b1==b2)
			return true;
		return false;
	}
}
