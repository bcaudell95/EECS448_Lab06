
public class main {

	public static void main(String[] args) {
		
		double[][] data = new double[3][2];
		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
				data[i][j] = 2*i + j;
			}
		}
		
		Matrix tempMatrix = new Matrix(data);
		tempMatrix.printMatrix();
		
	}
	
}
