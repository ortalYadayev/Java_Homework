import javax.swing.plaf.synth.SynthSeparatorUI;

public class Calculator {
	public int countDigits(int num) {
		int countNum =0;
		while(num!=00) {
			num/=10;
			countNum++;
		}
		return countNum;
	}
	public int sumEven(int num) {
		int sumNumZugi=0;
		while (num!=0) {
			if(num%10/2==0) {
				sumNumZugi+=num%10;
			}
			num/=10;
		}
		return sumNumZugi;
	}
	public int sumNoEven(int num) {
		int sumNoZugi=0;
		while (num!=0) {
			if(num%10%2!=0) {
				sumNoZugi+=num%10;
			}
			num/=10;
		}
		return sumNoZugi;
	}
	//- 2.4 לבדוק מה קורה פה בשיטה הזו
/*	public boolean evenOdd(int num) {
		int sumNoZugi = sumNoEven(num);
		System.out.println(sumNoZugi);
		int sumZugi= sumEven(num);
		System.out.println(sumZugi);
		if(sumZugi<sumNoZugi) {
			return true;
		}
		return false;
	}*/
	
	public int getDigit(int num, int k) {
		for(int i=0;i<k;i++) {
			num/=10;
		}
		return num%10;
	}
	public int setDigit(int num, int k,int d) {
		int temp10=1,temp1;
		for (int i=0; i<k; i++) {
			temp10*=10;
		}
		int tempNum=num;
		for(int i=0;i<=k;i++) {
			num/=10;
		}
		num=num*10+d;
		temp1=tempNum%temp10;
		num=num*temp10+ temp1;
		return num;
	}
	public int minDigit(int num) {
		int minNum=num%10, temp;
		num/=10;
		while(num!=0) {
			temp=num%10;
			if(minNum>temp) {
				minNum=temp;
			}
			num/=10;
		}
		return minNum;
	}
	public boolean isSymmetric(int num) {
		int sum=num%10, tempNum, temp=10 ,x;
		tempNum=num;
		num/=10;
		while(num!=0) {
			x=num%10;
			num/=10;
			sum=sum*temp+x;        
		}
		if(sum==tempNum) {
			return true;
		}
		return false;
	}
	public int search (int num, int d) { 
		int x,count=0;
		while(num!=0) {
			x=num%10;
			num/=10;
			if(x==d)
			{
				count++;
			}
		}
		return count;
	}
}
