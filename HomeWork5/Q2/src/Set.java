
public class Set {
	private int[] s1;
	private int realSize;
	
	public Set() {
		s1 = new int[10];
		realSize = 0;
	}
	public Set(int k) {
		s1 = new int[k];
		realSize = 0;
	}
	private boolean isMember(int num) {
		for (int i = 0; i < realSize; i++) {
			if (s1[i] == num) {
				return true;
			}
		}
		return false;
	}

	public boolean isFull() {
		return realSize == s1.length;
	}

	public boolean add(int num) {
		if ((!isFull()) && (!isMember(num))) {
			s1[realSize++] = num;
			return true;
		}
		return false;
	}

	public void show() {

		System.out.print("(");
		for (int i = 0; i < realSize - 1; i++) {
			System.out.print(s1[i] + ", ");
		}
		if (realSize > 0)
			System.out.print(s1[realSize - 1]);
		System.out.println(")");
	}
	public Set(int...number) {
		realSize=0;
		s1= new int[number.length];
		for(int i=0; i<number.length;i++) {
			if(!(isMember(number[i]))) {
				s1[realSize]=number[i];
				realSize++;
			}
		}
	}
	public boolean equals(Set newSet) {
		if(realSize!=newSet.realSize) {
			return false;
		}
		boolean eq=true;
		for(int i=0;i<realSize; i++) {
			
			for(int j=0; j<realSize;j++) {
				if((s1[i]!=newSet.s1[j])) {
					eq=false;
				}	
				else {
					eq=true;
					break;
				}
			}
			if(eq==false) {
				return false;
			}
		}
		return true;
	}
	public Set union(Set newSet) {
		int counter=realSize;
		for(int i=0; i<newSet.realSize;i++) {	
			boolean match=false;
			for(int j=0;j<realSize;j++) {
				if(newSet.s1[i]==s1[j]) {
					match=true;
					break;
				}	
			}
			if(!match) 
				counter++;			
		}
		Set s12=new Set(counter);
		for(int i=0; i<realSize;i++) {
			s12.s1[s12.realSize]=s1[i];
			s12.realSize++;
		}
		for(int i=0; i<newSet.realSize;i++) {
			boolean match=false;
			for(int j=0; j<s12.realSize; j++) {
				if(newSet.s1[i]==s12.s1[j]) {
					match=true;
					break;
				}
			}
			if(!match) {
				s12.s1[s12.realSize]=newSet.s1[i];
				s12.realSize++;
			}
		}
		return s12;
	}
	public Set intersect(Set newSet) {
		int counter=0;
		for(int i=0; i<realSize;i++) {	
			for(int j=0;j<newSet.realSize;j++) {
				if(s1[i]==newSet.s1[j]) {
					counter++;
					break;
				}				
			}
		}
		Set s12=new Set(counter);
		for(int i=0; i<realSize;i++) {	
			for(int j=0;j<newSet.realSize;j++) {
				if(s1[i]==newSet.s1[j]) {
					s12.s1[s12.realSize]=s1[i];
					s12.realSize++;
					break;
				}				
			}
		}
		return s12;
	}
	public boolean subset(Set sub) {
		if(realSize==0 || sub.realSize==0)	return true;
		if(realSize<sub.realSize)
		{
			boolean b=false;
			for(int i=0; i<realSize;i++) {
				for (int j=0; j<sub.realSize;j++) 
					if(sub.s1[j]==s1[i]) 
						b=true;
				if(!b)	return false;
			}
		}
		else {
			boolean b=false;
			for(int i=0; i<sub.realSize;i++) {
				for (int j=0; j<realSize;j++) 
					if(s1[j]==sub.s1[i]) 
						b=true;
				if(!b)	return false;
			}
		}
		return true;
	}
	public int[] toArray() {
		int[] a=new int[realSize];
		for(int i=0;i<realSize;i++) {
			a[i]=s1[i];
		}
		return a;
	}
	
}