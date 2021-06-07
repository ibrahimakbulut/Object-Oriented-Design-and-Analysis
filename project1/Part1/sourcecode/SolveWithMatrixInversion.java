import java.text.MessageFormat;

public class SolveWithMatrixInversion implements SolvingBehaviour{

    @Override
    public void solve(double[][] coefficients_matrix, double[] solution_matrix) {

        double[] solved_results=multiplyInverseAndSolution(invertMatrix(coefficients_matrix),solution_matrix);


        Double number1= new Double(Double.NaN);
        for(int i=0; i<solution_matrix.length;++i){

            if(number1.equals(solved_results[i])){
                System.out.println("Error: There is no solution");
                return;
            }
        }

        for(int i=0; i<solution_matrix.length;++i){
            System.out.println(solved_results[i]+",");
        }
    }


    public double[][] invertMatrix (double[][] originalMatrix) {
        double[][] helper_Matrix, result_of_inverted_matrix;
        int[] number_of_pivots;

        helper_Matrix = new double[originalMatrix.length][originalMatrix.length];
        result_of_inverted_matrix = new double[originalMatrix.length][originalMatrix.length];
        number_of_pivots = new int[originalMatrix.length];

        for (int i = 0; i < originalMatrix.length; ++i) {
            helper_Matrix[i][i] = 1;
        }

        makeItTriangle (originalMatrix, number_of_pivots);

        for (int i = 0; i < (originalMatrix.length - 1); ++i) {
            for (int j = (i + 1); j < originalMatrix.length; ++j) {
                for (int k = 0; k < originalMatrix.length; ++k) {
                    helper_Matrix[number_of_pivots[j]][k] -= originalMatrix[number_of_pivots[j]][i] * helper_Matrix[number_of_pivots[i]][k];
                }
            }
        }

        for (int i = 0; i < originalMatrix.length; ++i) {
            result_of_inverted_matrix[originalMatrix.length - 1][i] = (helper_Matrix[number_of_pivots[originalMatrix.length - 1]][i] / originalMatrix[number_of_pivots[originalMatrix.length - 1]][originalMatrix.length - 1]);

            for (int j = (originalMatrix.length - 2); j >= 0; --j) {
                result_of_inverted_matrix[j][i] = helper_Matrix[number_of_pivots[j]][i];

                for (int k = (j + 1); k < originalMatrix.length; ++k) {
                    result_of_inverted_matrix[j][i] -= (originalMatrix[number_of_pivots[j]][k] * result_of_inverted_matrix[k][i]);
                }

                result_of_inverted_matrix[j][i] /= originalMatrix[number_of_pivots[j]][j];
            }
        }

        return (result_of_inverted_matrix);
    }

    public void makeItTriangle (double[][] originalMatrix, int[] number_of_pivots) {

        double[] cell;
        double cell1, cell2, pivot1, pivot2, pivot3;
        int itempivot, keep;

        cell = new double[originalMatrix.length];

        for (int i = 0; i < originalMatrix.length; ++i) {
            number_of_pivots[i] = i;
        }

        for (int i = 0; i < originalMatrix.length; ++i) {
            cell2 = 0;

            for (int j = 0; j < originalMatrix.length; ++j) {
                cell1 = Math.abs (originalMatrix[i][j]);

                if (cell1 > cell2) {
                    cell2 = cell1;
                }
            }

            cell[i] = cell2;
        }

        keep = 0;

        for (int j = 0; j < (originalMatrix.length - 1); ++j) {
            pivot2 = 0;

            for (int i = j; i < originalMatrix.length; ++i) {
                pivot1 = Math.abs (originalMatrix[number_of_pivots[i]][j]);
                pivot1 /= cell[number_of_pivots[i]];

                if (pivot1 > pivot2) {
                    pivot2 = pivot1;
                    keep = i;
                }
            }

            itempivot = number_of_pivots[j];
            number_of_pivots[j] = number_of_pivots[keep];
            number_of_pivots[keep] = itempivot;

            for (int i = (j + 1); i < originalMatrix.length; ++i) {
                pivot3 = originalMatrix[number_of_pivots[i]][j] / originalMatrix[number_of_pivots[j]][j];
                originalMatrix[number_of_pivots[i]][j] = pivot3;

                for (int l = (j + 1); l < originalMatrix.length; ++l) {
                    originalMatrix[number_of_pivots[i]][l] -= pivot3 * originalMatrix[number_of_pivots[j]][l];
                }
            }
        }
    }


    public double[] multiplyInverseAndSolution (double[][] inverted_matrix, double[] solutionMatrix) {
        double[] multiplying_result;
        int  rowNumberOfInvertedMatrix, rowNumberOfSolutionMatrix;

       // columnNumberOfInvertedMatrix = inverted_matrix[0].length;
        rowNumberOfInvertedMatrix = inverted_matrix.length;

        rowNumberOfSolutionMatrix = solutionMatrix.length;
       // columnNumberOfSolutionMatrix = 1;
        multiplying_result = new double[rowNumberOfInvertedMatrix];

        for(int i=0;i<rowNumberOfInvertedMatrix;++i){
            multiplying_result[i]=0;
        }

        for(int i=0;i<rowNumberOfInvertedMatrix;++i){

            for(int j=0;j<rowNumberOfSolutionMatrix;++j){
                multiplying_result[i]+=inverted_matrix[i][j]*solutionMatrix[j];
            }
        }

        return (multiplying_result);
    }



}
