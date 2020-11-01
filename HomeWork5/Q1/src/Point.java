
public class Point {
	private float x, y;
	public Point(){
		x=0;
		y=0;
	}
	public Point(float x1, float y1){
		x=x1;
		y=y1;
	}
	public Point (Point p) {
		x=p.x;
		y=p.y;
	}
	public float getX() {
		return x;
	}
	public float getY() {
		return y;
	}
	public void show() {
		System.out.println("("+x+","+y+")");
		
	}
}
