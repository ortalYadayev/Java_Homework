import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		System.out.println("Enter new set maximal size");
		Scanner sca = new Scanner(System.in);
		int group = sca.nextInt();
		Set s = new Set(group);
		for (int i = 0; i < group;) {
			System.out.print("Current set is:");
			s.show();
			System.out.println("Press 0 to exit program.");
			if (s.isFull() == false) {
				System.out.println("Press 1 to add new number to set.");
			}
			if (s.isEmpty() == false) {
				System.out.println("Press 2 to remove existing number from set.");
			}
			int num1 = sca.nextInt();
			if (num1 == 0) {
				break;
			} else if (num1 == 1) {
				System.out.println("Enter new number to add to set");
				int num2 = sca.nextInt();
				if (s.add(num2) == true) {
					System.out.println("Adding " + num2 + " succeeded");
				} else {
					System.out.println("Adding " + num2 + " failed");
				}
			} else if (num1 == 2) {
				System.out.println("Enter number to remove from set");
				int num3 = sca.nextInt();
				if (s.remove(num3) == true) {
					System.out.println("Removing " + num3 + " succeeded");
				} else {
					System.out.println("Removing " + num3 + " failed");
				}
			}
		}
		sca.close();
	}
}
