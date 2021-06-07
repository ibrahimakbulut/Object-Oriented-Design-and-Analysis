public class greenState implements State{

    TrafficLight trafficLight;

    public greenState(TrafficLight trafficLight){

        this.trafficLight=trafficLight;
    }

    public void after3Seconds(){

        System.out.println("There must be a failure , Waiting 60 seconds in GREEN does not switch to any new light.");
    }

    public void after15Seconds(){

        System.out.println("There must be a failure , Waiting 60 seconds in GREEN does not switch to any new light.");

    }

    public void after60Seconds(){

        System.out.println("Switching from GREEN to YELLOW after 60 seconds");

        trafficLight.setState(trafficLight.getYellowState());
    }
}
