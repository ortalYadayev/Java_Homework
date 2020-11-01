
public class Die {
	private int numOfSides;
	private int[] statistics;
	
	public Die() {
		this(6);
	}
	public Die(int n) {
		numOfSides=n;
		statistics=new int[numOfSides];
	}
	public int rollDie() {
		int result;
		result=1+(int)(Math.random()*numOfSides);
		statistics[result-1]++;
		return result;
	}
	public void showStatistics() {
		int k;
		for (k=0; k<numOfSides; k++) {
			System.out.println(k+1+":"+statistics[k]);
		}
		System.out.println("Most frequent digit is "+(getMostFrequent()));
	}
	private int getMostFrequent() {
		int common=0;
		int count=0;
		for (int i=0; i<statistics.length ;i++) {
			if(common <statistics[i]) {
				common=statistics[i];
				count=i+1;
			}
		}
		if(count ==0) {
			return 1;
		}
		return count;
	}
	public int[] getAllMostFrequents() {
		int most=0, counter =0;
		for (int i=0; i<numOfSides;i++) {
			if(statistics[i] > most) {
				most=statistics[i];
			}
		}
		for (int i = 0; i < statistics.length; i++) {
		   if (statistics[i] == most) {
				   counter++;
			   }
		}
		int [] freq=new int[counter];
		int k=0;
		for(int j=0;j<numOfSides;j++) {
			if(statistics[j]==most) {
				freq[k]=j+1;
				++k;
			}
		}	
		return freq;
	}	
}
