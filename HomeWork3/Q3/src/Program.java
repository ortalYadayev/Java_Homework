import java.util.Scanner;
public class Program {

	public static void main(String[] args) {
		int An,d;
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter number:");
		An = s.nextInt();
		s=new Scanner(System.in);
		d = s.nextInt();
		Progression maxPro = new Progression(An,d);
		for(int i=1;i<7;i++) {
			s=new Scanner(System.in);
			System.out.println("Please enter number:");
			An = s.nextInt();
			s=new Scanner(System.in);
			d = s.nextInt();
			Progression pro = new Progression(An,d);
			if(pro.sumPro()>maxPro.sumPro()) {
				maxPro=new Progression(An,d);
			}
		}
		maxPro.showProg(12);
	}

}
