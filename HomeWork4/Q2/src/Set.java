
public class Set {
	private int[] s1;
	private int realSize;

	public Set(int k) {
		s1 = new int[k];
		realSize = 0;
	}

	public boolean isMember(int num) {
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
			System.out.print(s1[i] + ",");
		}
		if (realSize > 0)
			System.out.print(s1[realSize - 1]);
		System.out.println(")");
	}

	public boolean isEmpty() {
		if (realSize == 0)
			return true;

		return false;
	}

	public boolean remove(int number) {
		if (!(isMember(number))) {
			return false;
		}

		int[] temp = new int[s1.length];
		int value = 0;
		for (int i = 0; i < realSize; i++) {
			if (s1[i] != number) {
				temp[value++] = s1[i];
			}
		}
		s1 = temp;
		realSize--;
		return true;
	}

}
