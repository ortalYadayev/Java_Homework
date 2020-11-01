import java.util.Scanner;
public class Program {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter some number:");
		int num = s.nextInt();
		System.out.println("The number you entered is " + num);
		Calculator cal1 = new Calculator();
		System.out.println(cal1.isSymmetric(num));
		boolean sim =cal1.isSymmetric(num);
	    if (sim) {
	    	System.out.println("The number "+num+" is symmetric");
	    }
	    else {
	    	System.out.println("The number "+num+" is not symmetric");
	    }
	    sim=false;
	    while(!sim)
	    {
	    System.out.println("please enter some number:");
	    int num1=s.nextInt();
	    sim=cal1.isSymmetric(num1);
	    if (sim) 
	    {
	    	System.out.println("The first symmetric after "+num+" is "+num1);
	    	break;
	   	}
	    }
	}
}
