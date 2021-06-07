public class yellowState implements State{


    TrafficLight trafficLight;

    public yellowState(TrafficLight trafficLight){

        this.trafficLight=trafficLight;
    }

    public void after3Seconds(){

        System.out.println("Switching from YELLOW to RED after 3 seconds");
        trafficLight.setState(trafficLight.getRedState());
    }

    public void after15Seconds(){

        System.out.println("There must be a failure , Waiting 15 seconds in YELLOW does not switch to any new light");

    }

    public void after60Seconds(){

        System.out.println("There must be a failure , Waiting 60 seconds in YELLOW does not switch to any new light");
    }

    public void after90Seconds(){

        System.out.println("There must be a failure , Waiting 90 seconds in RED does not switch to any new light");
    }
}
