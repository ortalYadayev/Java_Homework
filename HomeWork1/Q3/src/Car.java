public class Car {
	private int speed;
	private String licensing;
	private int maxSpeed;
	public Car(String y, int x)
	{
		speed=0;
		licensing=y;
		maxSpeed=x;
	}
	
	public void speed_up() {
		if(speed<maxSpeed)
			speed++;
	}
	public void speed_up(int x) {
		if(x>0)
		{
			if((speed+x)<=maxSpeed)
				speed+=x;
		}
	}
	public void slow_down() {
		if(speed>0)
			speed--;
	}
	public void slow_down(int x) {
		if(x>0)
		{
			if((speed-x)>=0)
				speed-=x;
		}
	}

	public void stop() {
		speed = 0;
	}

	public void show_speed() {
		System.out.println(licensing);
		System.out.println(speed);
		System.out.println(maxSpeed);
	}
	public int get_speed()
	{
		return speed;
	}
}
