public class MatrixMultiplication {
    public static Matrix multiplyMatrices(Matrix firstMatrix, Matrix secondMatrix) throws Exception {
        checkForSuitableDimensions(firstMatrix, secondMatrix);

        double[][] finalMatrixArray = new double[firstMatrix.getHeight()][secondMatrix.getWidth()];
        double[][] firstMatrixArray = firstMatrix.getData();
        double[][] secondMatrixArray = secondMatrix.getData();

        for(int i = 0; i < firstMatrix.getHeight(); i++) {
            for (int j = 0; j < secondMatrix.getWidth(); j++) {
                double tempValue = 0;

                for(int k = 0; k < firstMatrix.getWidth(); k++) {
                    tempValue += firstMatrixArray[i][k] * secondMatrixArray[k][j];
                }

                finalMatrixArray[i][j] = tempValue;
            }
        }

        return new Matrix(finalMatrixArray);
    }

    private static void checkForSuitableDimensions(Matrix firstMatrix, Matrix secondMatrix) throws Exception {
        if(firstMatrix.getWidth() != secondMatrix.getHeight()) {
            throw new Exception("Invalid matrix dimensions. Please try again.");
        }
    }
}
