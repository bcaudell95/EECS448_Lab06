import java.io.File;


public class main {

	public static void main(String[] args) {
		Matrix temp2x3Matrix;
        Matrix temp3x4Matrix;
        Matrix temp3x3Matrix;

		try {
            String filePath = new File("").getAbsolutePath();

			temp2x3Matrix = new Matrix(new File(filePath + File.separator  + "lab06" + File.separator + "sampleMatrices" + File.separator + "sample2x3.txt"));
            temp3x4Matrix = new Matrix(new File(filePath + File.separator  + "lab06" + File.separator + "sampleMatrices" + File.separator + "sample3x4.txt"));
            temp3x3Matrix = new Matrix(new File(filePath + File.separator  + "lab06" + File.separator + "sampleMatrices" + File.separator + "sample3x3.txt"));

            System.out.println("3x3 Matrix: ");
            temp3x3Matrix.printMatrix();

            System.out.println("\n2x3 Matrix:");
            temp2x3Matrix.printMatrix();

            System.out.println("\n3x4 Matrix: ");
            temp3x4Matrix.printMatrix();

            System.out.println("\nMatrix Addition");
            MatrixAddition.addMatrices(temp3x3Matrix, temp3x3Matrix).printMatrix();

            System.out.println("\nMatrix Multiplication");
            MatrixMultiplication.multiplyMatrices(temp2x3Matrix, temp3x4Matrix).printMatrix();

            System.out.println("\nMatrix Transposition");
            MatrixTransposition.transposeMatrix(temp2x3Matrix).printMatrix();
        } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
