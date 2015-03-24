import java.io.File;


public class main {

	public static void main(String[] args) {
		
		Matrix tempMatrix;
		try {
			tempMatrix = new Matrix(new File("sample2x3.txt"));
			tempMatrix.printMatrix();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
