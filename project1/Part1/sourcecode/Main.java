import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int NumberOfVariables;
        double[] solutionMatrix;
        double[][] coefficientsMatrix;

        LinearSolverDeluxe problem= new LinearSolverDeluxe();

        Scanner scan = new Scanner(System.in);

        System.out.println("\nHow many variable will be in equations? Enter");
         NumberOfVariables = scan.nextInt();

         solutionMatrix = new double[NumberOfVariables];
         coefficientsMatrix = new double[NumberOfVariables][NumberOfVariables];

        System.out.println("\nEnter coefficients for "+ NumberOfVariables +" equations");
        for (int i = 0; i < NumberOfVariables; i++)
            for (int j = 0; j < NumberOfVariables; j++)
                coefficientsMatrix[i][j] = scan.nextDouble();

        System.out.println("\nEnter "+ NumberOfVariables +" solutions");
        for (int i = 0; i < NumberOfVariables; i++)
            solutionMatrix[i] = scan.nextDouble();

        problem.performSolve(coefficientsMatrix,solutionMatrix);

        problem.setSolveBehaviour(new SolveWithGaussian());

        problem.performSolve(coefficientsMatrix,solutionMatrix);
        System.out.println("solved with gaussian");

        problem.setSolveBehaviour(new SolveWithMatrixInversion());
        problem.performSolve(coefficientsMatrix,solutionMatrix);
        System.out.println("solved with matrix inversion");

        System.out.println("--------------new problem-------------------------");


        LinearSolverDeluxe problem2= new LinearSolverDeluxe();

        System.out.println("\nHow many variable will be in equations? Enter");
        NumberOfVariables = scan.nextInt();

        solutionMatrix = new double[NumberOfVariables];
        coefficientsMatrix = new double[NumberOfVariables][NumberOfVariables];

        System.out.println("\nEnter coefficients for "+ NumberOfVariables +" equations");
        for (int i = 0; i < NumberOfVariables; i++)
            for (int j = 0; j < NumberOfVariables; j++)
                coefficientsMatrix[i][j] = scan.nextDouble();

        System.out.println("\nEnter "+ NumberOfVariables +" solutions");
        for (int i = 0; i < NumberOfVariables; i++)
            solutionMatrix[i] = scan.nextDouble();


        problem2.performSolve(coefficientsMatrix,solutionMatrix);

        problem2.setSolveBehaviour(new SolveWithGaussian());
        problem2.performSolve(coefficientsMatrix,solutionMatrix);
        System.out.println("solved with gaussian");

        problem2.setSolveBehaviour(new SolveWithMatrixInversion());
        problem2.performSolve(coefficientsMatrix,solutionMatrix);
        System.out.println("solved with matrix inversion");



    }
}
