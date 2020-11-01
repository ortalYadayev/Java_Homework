
public class Car {

	private int speed;
	private String plate_id;
	private int max_speed;

	public Car(String plate_id, int max_speed) {
		this.plate_id = plate_id;
		this.max_speed = max_speed;
		speed = 0;
	}

	public void speed_up() {

		if (speed < max_speed)
			speed++;

	}

	public void slow_down() {

		if (speed > 0)
			speed--;

	}

	public void stop() {
		speed = 0;
	}

	public void show() {
		System.out.println(plate_id + "," + max_speed + "," + speed);

	}
	

	public void changeSpeed(int number) {
		this.speed = number;
	}

	public int get_speed() {
		return speed;
	}

	public void speed_up(int a) {
		if (a >= 0 && speed + a <= max_speed)
			speed += a;

	}

	public void slow_down(int a) {
		if (a > 0 && speed - a >= 0) {
			speed -= a;
		}

	}

}
