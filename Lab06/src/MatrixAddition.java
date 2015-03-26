
public class MatrixAddition {
	public static Matrix addMatrices(Matrix firstMatrix, Matrix secondMatrix) throws Exception {
		checkForSuitableDimensions(firstMatrix, secondMatrix);
		
		double[][] finalMatrixArray = new double[firstMatrix.getHeight()][firstMatrix.getWidth()];
		double[][] firstMatrixArray = firstMatrix.getData();
		double[][] secondMatrixArray = secondMatrix.getData();
		
		for(int i = 0; i < firstMatrix.getHeight(); i++) {
			for(int j = 0; j < firstMatrix.getWidth(); j++) {
				finalMatrixArray[i][j] = firstMatrixArray[i][j] + secondMatrixArray[i][j];
			}
		}
		
		return new Matrix(finalMatrixArray);
	}

	private static void checkForSuitableDimensions(Matrix firstMatrix, Matrix secondMatrix) throws Exception {
		if(firstMatrix.getHeight() != secondMatrix.getHeight() || firstMatrix.getWidth() != secondMatrix.getWidth()) {
			throw new Exception("Invalid matrix dimensions. Please try again.");
		}
	}
}