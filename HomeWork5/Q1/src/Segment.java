import java.util.Scanner;
public class Segment {
	private Point first, second;
	
	public Segment() {
		first = new Point();
		second = new Point(1,1);
	}
	public Segment(float num1, float num2,float num3,float num4) {
		first = new Point(num1,num2);
		second = new Point(num3,num4);
	}
	public Segment(float num1, float num2) {
		first = new Point();
		second = new Point(num1,num2);
	}
	public Segment(Point p1, Point p2) {
		first = new Point (p1);
		second = new Point (p2);
	}
	public Segment(float num1,float num2, Point p2) {
		first = new Point(num1, num2);
		second = new Point (p2);
	}
	public Segment(Point p1, float num1,float num2) {
		first = new Point (p1);
		second = new Point(num1, num2);
	}
	public Segment(Segment s) {
		first =s.first;
		second =s.second;
	}
	public void readSegment() {
		float n1, n2, n3, n4;			
		System.out.println("enter number one");
		Scanner scr = new Scanner(System.in);						
		n1=scr.nextInt();
		
		System.out.println("enter number two");
		scr = new Scanner(System.in);
		n2=scr.nextInt();
			
		System.out.println("enter number three");
		scr = new Scanner(System.in);
		n3=scr.nextInt();
			
		System.out.println("enter number four");
		scr = new Scanner(System.in);
		n4=scr.nextInt();
		scr.close();
		first = new Point(n1,n2);
		second = new Point(n3,n4);
	}
	public void show() {
		first.show();
		second.show();
	}
	public Point middle() {
		float midx, midy;
		midx = (first.getX()-second.getX())/2;
		midy = (first.getY()-second.getY())/2;
		Point middle = new Point (midx, midy);
		return middle;
	}
	public float lenght() {
		return (float)Math.sqrt(Math.pow(first.getX()+second.getX(),2)+Math.pow(first.getY()+second.getY(),2));
	}
	public boolean greaterThan(Segment s2) {
		float d1= lenght();
		float d2= s2.lenght();
		if(d1>d2) {
			return true;
		}
		else return false;
	}
	public boolean lessThan(Segment s2) {
		float d1= lenght();
		float d2= s2.lenght();
		if(d1<d2) {
			return true;
		}
		else return false;
	}
	public boolean equals(Segment s2) {
		return (first.getX()==s2.first.getX() && first.getY()==s2.first.getY() && second.getX()==s2.second.getX() && second.getY()==s2.second.getY());
	}
}
