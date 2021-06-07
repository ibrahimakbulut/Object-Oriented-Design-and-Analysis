import java.util.Observable;

public class HiTech  extends Observable {

    private int timeout_X=60;

    public HiTech(){};


    public void TrafficChanged(){
        setChanged();
        notifyObservers();
    }

    public void changeDetected(boolean flag){

        if(flag==true && timeout_X!=90){
            timeout_X=90;
            TrafficChanged();
        }
        else if(flag==false && timeout_X==90){
            timeout_X=60;
            TrafficChanged();
        }

    }

    public int getTimeout_X(){
        return this.timeout_X;
    }



}
