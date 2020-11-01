
public class Program {

	public static void main(String[] args)
	{
		Car car1 = new Car("12345", 120);
		Car car2 = new Car("123456", 100);
		car1.speed_up(5);
		car2.speed_up();
		car1.show_speed();
		car2.show_speed();
		int rnd = (int)(Math.random()* 150 + 50);
		car2.speed_up(rnd);
		if(car2.get_speed()!=1) {
		int x=car2.get_speed()-30;
		car2.slow_down(x);
		}
		else {
			car2.speed_up(29);
		}
		car2.show_speed();
	}

}
