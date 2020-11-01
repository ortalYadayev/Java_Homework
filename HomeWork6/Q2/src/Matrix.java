import java.util.Random;

public class Matrix {
	int[][]  data;
	private int rows;
	private int cols;

	public Matrix(int rows, int cols, int min, int max) {
		this.rows=rows;
		this.cols=cols;
		data=new int[rows][cols];
		Random rand = new Random();
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				data[i][j]=min+rand.nextInt(max-min);

			}
		}

	}
	public Matrix(int rows,int cols) {
		this.rows=rows;
		this.cols=cols;
		data=new int[rows][cols];
	}
	public Matrix(Matrix other) {
		this.rows=other.rows;
		this.cols=other.cols;
		data=new int[rows][cols];
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) { 
				data[i][j]=other.data[i][j];
			}
		}



	}
	public void show() {
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				System.out.print(data[i][j]);
				if(data[i].length-1!=j)
					System.out.print(" ");
			}
			System.out.println();
		}

	}
	public boolean isSquare() {
		if(rows==cols) {
			return true;
		}
		else 
			return false;

	}
	public boolean isOne() {
		if(!isSquare())
			return false;
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				int value;
				if(i==j) {
					value = 1;
				} else {
					value = 0;
				}
				if(data[i][j]!=value)
					return false;
			}
		}
		return true;

	}
	public boolean isSymetric() {
		if(!isSquare())
			return false;
		for(int i=0; i<rows; i++) {
			for(int j=i+1; j<cols; j++) {
				if(data[i][j]!=data[j][i]) {
					return false;
				}
			}
		}
		return true;

	}
	public Matrix Transpose() {
		Matrix other= new Matrix(this.cols, this.rows);
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				other.data[j][i]=data[i][j];


			}
		}
		return other;



	}
	public boolean Equals(Matrix other) {
		if(this.rows!=other.rows&&this.cols!=other.cols){
			return false;

		}
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				if(data[i][j]!=other.data[i][j]) {
					return false;
				}

			}
		}
		return true;
	}
	public Matrix Add(Matrix other) {
		if(this.rows!=other.rows||this.cols!=other.cols) {
			return null;
		}
		Matrix result=new Matrix(rows,cols);
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				result.data[i][j]=this.data[i][j]+other.data[i][j];

			}
		}
		return result;




	}
	public Matrix subMatrix(int x,int y,int a,int b) {
		Matrix result =new Matrix(a,b);
		int k = y;
		for(int i=0; i<a; i++) {
			for(int j=0; j<b; j++) {
				result.data[i][j] = this.data[x][y];
				y++;
			}
			y=k;
			x++;
		}
		return result;

	}
}
