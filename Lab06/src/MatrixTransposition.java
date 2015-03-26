public class MatrixTransposition {
    public static Matrix transposeMatrix(Matrix matrix) {
        double[][] finalMatrixArray = new double[matrix.getWidth()][matrix.getHeight()];
        double[][] givenMatrixArray = matrix.getData();

        for(int i = 0; i < matrix.getHeight(); i++) {
            for(int j = 0; j < matrix.getWidth(); j++) {
                finalMatrixArray[j][i] = givenMatrixArray[i][j];
            }
        }

        return new Matrix(finalMatrixArray);
    }
}
