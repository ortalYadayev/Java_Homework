import java.util.Scanner;
public class Program {

	public static void main(String[] args) {
		Rectangle r1=new Rectangle(6,4);
		char tav = '$';
		r1.drawEmpty(tav);
		r1.readRectFromConsol();
		r1.drawFilled('^');
	}

}
