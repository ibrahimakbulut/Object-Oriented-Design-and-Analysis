import java.util.Observable;
import java.util.Observer;

public class TrafficLight implements Observer {

    Observable observable;

    State RED;
    State YELLOW;
    State GREEN;

    State state = RED;

    int timeout_X = 60;


    public TrafficLight(Observable observable) {

        RED = new redState(this);
        YELLOW = new yellowState(this);
        GREEN = new greenState(this);
        state = RED;
        this.observable = observable;
        observable.addObserver(this);
    }


    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof HiTech) {
            HiTech newTimeout_X = (HiTech) o;
            this.timeout_X = newTimeout_X.getTimeout_X();

            System.out.println("\nTraffic situtaion changed so timeout for GREEN is set to "+this.timeout_X+" \n");
        }
    }


    public void after15Seconds() {
        state.after15Seconds();
    }

    public void after3Seconds() {
        state.after3Seconds();
    }

    public void after60Seconds() {
        state.after60Seconds();
    }

    public void after90Seconds() {
        state.after90Seconds();
    }

    void setState(State state) {
        this.state = state;
    }

    State getRedState() {
        return RED;
    }

    State getYellowState() {
        return YELLOW;
    }

    State getGreenState() {
        return GREEN;
    }

    int getTimeout_X(){
        return timeout_X;
    }

    @Override
    public String toString() {
        String string = null;
        if (state instanceof redState) {

            string = "Traffic light is in RED state now";
        } else if (state instanceof yellowState) {
            string = "Traffic Light is in YELLOW state now";
        } else if (state instanceof greenState) {
            string = "Traffic Light is in GREEN state now";
        }

        return string;
    }

}