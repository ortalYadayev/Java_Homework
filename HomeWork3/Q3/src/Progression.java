
public class Progression {
	int a1,d;
	public Progression(int a,int d1) {
		a1=a;
		d=d1;
	}
	public Progression() {
		a1=-3;
		d=2;
	}
	public int getElement(int k) {
		int sidA=a1;
		for(int i=0; i<=k;i++) {
			sidA+=d;
		}
		return sidA;
	}
	public int sumPro() {
		int count=a1,x=a1+d;
		for(int i=0; i<5 ; i++) {
			count+=x;
			x+=d;
		}
		return count;
	}
	public void showProg(int n) {
		int sidA=a1;
		System.out.print(sidA);
		for(int i=1; i<n; i++) {
			sidA+=d;
			System.out.print(","+sidA);
		}
		System.out.println();
	}
	public void showProg() {
		int sidA=a1;
		System.out.print(sidA);
		for(int i=1; i<10; i++) {
			sidA+=d;
			System.out.print(","+sidA);
		}
		System.out.println();
	}
	public void showProgUpTo(int n) {
		int sidA=a1;
		while(sidA<n) {
			System.out.print(","+sidA);
			sidA+=d;
		}
	}
}
