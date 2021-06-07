public class redState implements State{

    TrafficLight trafficLight;

    public redState(TrafficLight trafficLight){

        this.trafficLight=trafficLight;
    }

    public void after3Seconds(){

        System.out.println("15 seconds should pass to switch from RED to GREEN.");
    }

    public void after15Seconds(){

        System.out.println("Switching from RED to GREEN after 15 seconds");

        trafficLight.setState(trafficLight.getGreenState());
    }

    public void after60Seconds(){

        System.out.println("There must be a failure , Waiting 60 seconds in RED does not switch to any new light");
    }

    public void after90Seconds(){

        System.out.println("There must be a failure , Waiting 90 seconds in RED does not switch to any new light");
    }


}