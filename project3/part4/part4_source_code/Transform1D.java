import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Transform1D {

    public void transformProcessSteps(String fileName){

        double input[]= readFile(fileName);
        transformFunction(input);

        writeOutputToFile();

        if(userWantsTimeOfExecution()){
            printTimeOfExecution();

        }

    }

    public boolean userWantsTimeOfExecution(){
        return false;
    }


    public double[] readFile(String fileName){
        double[] input_array=null;

        ArrayList<Double> inputs= new ArrayList<Double>();

        Scanner scan;
        File file = new File(fileName);
        try {
            scan = new Scanner(file);

            while(scan.hasNextDouble())
            {
               inputs.add(scan.nextDouble()) ;
            }
            input_array= new double[inputs.size()];

            for(int i=0;i<inputs.size();++i){

                input_array[i]=inputs.get(i);
            }


        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }

        return input_array;
    }

    public abstract void transformFunction(double[] array_input);

    public abstract void writeOutputToFile();

    public abstract void printTimeOfExecution();


}
