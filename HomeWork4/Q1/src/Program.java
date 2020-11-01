import java.util.Scanner;
public class Program {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.println("Please enter number of sides:");
		int s = sca.nextInt();
		System.out.println("Please enter number of rolls in the expriment:");
		int r = sca.nextInt();		
		int iteration=1;	
		for(;iteration<=1000; iteration++) {
			System.out.println("Starting iteration # "+iteration);
			Die my=new Die(s);
			for(int i=0; i<r; i++) {
				my.rollDie();
			}
			my.showStatistics();
			int[]arr=my.getAllMostFrequents();	
			if(arr.length>1) {
				break;
			}						
		}		
		System.out.println("Found multiple max frequency. Experiment ended after " +iteration+ " iterations");
			
			
		/*	System.out.println("Starting iteration # "+iteration);
			my=new Die(s);
			for(int j=0;j<r;j++) {
				my.rollDie();
			}
			my.showStatistics();
			arr=my.getAllMostFrequents();
			
		}
		System.out.println("Found multiple max frequency. Experiment ended after " +iteration+ " iterations");
	*/	sca.close();
	}

}
