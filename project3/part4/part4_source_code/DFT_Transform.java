import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;
import java.time.Duration;
import java.time.LocalTime;

public class DFT_Transform extends Transform1D{

    private final double PI= 3.14159265;

    private double outputs_real_parts[];
    private  double outputs_imajiner_parts[];

    private LocalTime startOfExecution;

    private  LocalTime endOfExecution;

    @Override
    public void transformFunction(double[] array_input){

        startOfExecution=  LocalTime.now(); // take the start time of transforming process

        outputs_real_parts= new double[array_input.length];

        outputs_imajiner_parts = new double[array_input.length];

        for(int i=0;i<array_input.length;++i){

            double sum_of_real_part=0;

            double sum_of_img_part=0;

            for(int j=0;j<array_input.length;++j){

             sum_of_real_part+= (array_input[j]*Math.cos( (2* PI * i*j)/array_input.length) );
             sum_of_img_part+=  (array_input[j] * (-1* Math.sin ( ( 2* PI * i*j)/array_input.length)) );

            }
            outputs_real_parts[i]=sum_of_real_part;
            outputs_imajiner_parts[i]=sum_of_img_part;
        }
        endOfExecution= LocalTime.now(); // take the end time of execution process
    }

    @Override
    public boolean userWantsTimeOfExecution(){

        String answer=null;
        System.out.print("Would you print execution time(y/n)?");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException ioe) {
            System.err.println("IO error trying to read your answer");
        }
        if (answer == null) {
            answer= "no";
        }
        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void writeOutputToFile(){

        try{
            FileWriter fw=new FileWriter("DFT_output.txt");

            for(int i=0; i< outputs_real_parts.length;++i){

                Double temp= new Double(outputs_real_parts[i]);

                Double temp2= new Double(outputs_imajiner_parts[i]);

                fw.write(temp.toString()+ " + " + temp2.toString() + "i\n");

            }
            fw.close();
        }catch(Exception e){System.out.println(e);}

        return;

    }

    @Override
    public void printTimeOfExecution(){

        Duration duration = Duration.between(startOfExecution,endOfExecution);
        System.out.printf("execution time %d nanoseconds",duration.getNano());
    }
}
