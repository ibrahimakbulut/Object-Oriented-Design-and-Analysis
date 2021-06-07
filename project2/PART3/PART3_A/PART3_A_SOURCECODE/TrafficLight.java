public class TrafficLight {

    State RED;
    State YELLOW;
    State GREEN;

    State state=RED;

    int timeout= 60;

    public TrafficLight(){

        RED= new redState(this);
        YELLOW= new yellowState(this);
        GREEN= new greenState(this);

        state= RED;
    }

    public void after15Seconds(){
        state.after15Seconds();
    }

    public void after3Seconds(){
        state.after3Seconds();
    }
    public void after60Seconds(){
        state.after60Seconds();
    }
    void setState(State state){
        this.state= state;
    }

    State getRedState(){
        return RED;
    }
    State getYellowState(){
        return YELLOW;
    }
    State getGreenState(){
        return GREEN;
    }

    @Override
    public String toString() {
        String string=null;
        if(state instanceof redState){

            string= "Traffic light is in RED state now";
        }
        else if(state instanceof yellowState){
            string= "Traffic Light is in YELLOW state now";
        }
        else if(state instanceof greenState){
            string= "Traffic Light is in GREEN state now";
        }

        return string;
    }
}
