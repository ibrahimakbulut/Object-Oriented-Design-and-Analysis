import java.io.FileWriter;
import java.lang.Math;
import java.time.Duration;

public class DCT_Transform extends  Transform1D{

    private final double PI= 3.14159265;

    private double[] outputs;

    public void transformFunction(double[] array_input){

        outputs= new double[array_input.length];

        for(int i=0;i<array_input.length;++i){

            double sum=0;
            for(int j=0; j<array_input.length;++j){

                sum+= (array_input[j] * Math.cos(  (PI/ array_input.length) * (j + 0.5) * i ) );
            }

            double scale_factor;

            if(i==0)
                scale_factor =Math.sqrt(0.5);
            else
                scale_factor = 1;

            sum= sum* scale_factor * Math.sqrt(2.0/array_input.length);
            outputs[i]=sum;

        }

    }

    @Override
    public void writeOutputToFile(){

        try{
            FileWriter fw=new FileWriter("DCT_output.txt");

            for(int i=0; i<outputs.length;++i){

                Double temp= new Double(outputs[i]);

                fw.write(temp.toString()+ "          ");

            }
            fw.close();
        }catch(Exception e){System.out.println(e);}

        return;
    }

    @Override
    public void printTimeOfExecution(){

    }

}



