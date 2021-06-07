public class LinearSolverDeluxe {

    private  SolvingBehaviour solvingBehaviour;

     public LinearSolverDeluxe(){

         solvingBehaviour= new SolveUnknown();
     }

     public void performSolve(double[][] coefficients_matrix, double[] solution_matrix){

         solvingBehaviour.solve(coefficients_matrix,solution_matrix);
     }

     public void setSolveBehaviour(SolvingBehaviour solveBehaviour){

         this.solvingBehaviour=solveBehaviour;
     }
}
