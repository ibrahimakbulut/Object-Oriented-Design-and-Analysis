import static java.lang.Double.*;

public class SolveWithGaussian implements SolvingBehaviour{

    @Override
    public void solve(double[][] coefficients_matrix, double[] solution_matrix) {

        int variable_number = solution_matrix.length;
        for (int i = 0; i < variable_number; i++)
        {

            int max_element = i;
            for (int j = i + 1; j < variable_number; j++)
                if (Math.abs(coefficients_matrix[j][i]) > Math.abs(coefficients_matrix[max_element][i]))
                    max_element = j;


            double[] temp_element = coefficients_matrix[i];
            coefficients_matrix[i] = coefficients_matrix[max_element];
            coefficients_matrix[max_element] = temp_element;

            double temp_element2 = solution_matrix[i];
            solution_matrix[i] = solution_matrix[max_element];
            solution_matrix[max_element] = temp_element2;


            for (int j = i + 1; j < variable_number; j++)
            {
                double total = coefficients_matrix[j][i] / coefficients_matrix[i][i];
                solution_matrix[j] -= total * solution_matrix[i];
                for (int k = i; k < variable_number; k++)
                    coefficients_matrix[j][k] -= total * coefficients_matrix[i][k];
            }
        }


        double[] solved_results = new double[variable_number];
        for (int i = variable_number - 1; i >= 0; i--)
        {
            double total = 0.0;
            for (int j = i + 1; j < variable_number; j++)
                total += coefficients_matrix[i][j] * solved_results[j];
            solved_results[i] = (solution_matrix[i] - total) / coefficients_matrix[i][i];
        }
        Double number1= new Double(Double.NaN);
        for(int i=0; i<variable_number;++i){

            if(number1.equals(solved_results[i])){
                System.out.println("Error: There is no solution");
                return;
            }
        }
        for(int i=0; i<variable_number;++i){

            System.out.println(solved_results[i]+",");
        }
    }

}


