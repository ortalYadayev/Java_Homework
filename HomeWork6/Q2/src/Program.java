
public class Program {
	public static int floodOnes(int [] A,int left, int right, int k){
		if(left>=right || A[k] == 0) {
			return 0;
		}
		int a,b;		
		a = floodOnes(A, left, k-1, k-1);
		b = floodOnes(A, k+1, right, k+1);
		return A[k] + a + b;
		}

	
	public static void main(String[] args) {
	Matrix m =new Matrix(3,3,1,9);
	m.show();
	m.isSquare();
	m.isOne();
	m.Transpose();
	m.Equals(m);
	Matrix m2= m.subMatrix(0, 1, 2, 1);
	m2.show();
	

	int[] A = {1,1,1,0,1,1,0,1,1,1,1,1,0,1,1};
	System.out.println(floodOnes(A,0,A.length-1, 9)); // 5 פלט
	System.out.println(floodOnes(A,0, A.length-1, 3)); // 0 פלט  
	System.out.println(floodOnes(A,0, A.length-1, 0)); //  פלט    3
	System.out.println(floodOnes(A,0, A.length-1, 14)); // 2 פלט  	


	int[] a = {1,3,4,5};
	System.out.println(radixTern (a, a.length));

	}

}
