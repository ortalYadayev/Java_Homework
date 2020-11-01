import java.util.Scanner;
public class Rectangle {
	private int height, width;
	public Rectangle(int h, int w) {
		this.height=h;
		this.width=w;
	}
	public void drawFilled()
	{
		for(int i=0; i<height; i++) 
		{
			for(int j=0; j<width;j++) 
			{
				System.out.print("*");
			}
		System.out.println();
		}
	}
	public void drawFilled(char c)
	{
		for(int i=0; i<height; i++) 
		{
			for(int j=0; j<width;j++) 
			{
				System.out.print(c);
			}
		System.out.println();
		}
	}
	public void drawEmpty()
	{
		for(int i=0; i<height; i++) 
		{
				for(int j=0; j<width;j++) 
				{
					if(i==0 || i==height-1)
					{
						System.out.print("*");
					}
					else if(j==0 || j==width-1)
					{
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
		System.out.println();
		}
	}
	public void drawEmpty(char c)
	{
		for(int i=0; i<height; i++) 
		{
				for(int j=0; j<width;j++) 
				{
					if(i==0 || i==height-1)
					{
						System.out.print(c);
					}
					else if(j==0 || j==width-1)
					{
						System.out.print(c);
					}
					else {
						System.out.print(" ");
					}
				}
		System.out.println();
		}
	}
	public void readRectFromConsol() 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter new width:");
		width = s.nextInt();
		System.out.println("Please enter new height:");
		height = s.nextInt();
	}
}
