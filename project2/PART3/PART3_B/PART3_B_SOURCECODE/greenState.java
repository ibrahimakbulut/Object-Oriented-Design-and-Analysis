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

    public void after60Seconds() {

        if (trafficLight.getTimeout_X() == 60) {

            System.out.println("Switching from GREEN to YELLOW after 60 seconds");

            trafficLight.setState(trafficLight.getYellowState());
        } else {
            System.out.println("timeout for green light is 90 seconds ,so Waiting 60 seconds in GREEN does not switch to any new light.\"");

        }
    }

    public void after90Seconds(){

        if (trafficLight.getTimeout_X() == 90) {

            System.out.println("Switching from GREEN to YELLOW after 90 seconds");

            trafficLight.setState(trafficLight.getYellowState());
        } else {
            System.out.println("timeout for green light is 60 seconds ,so Waiting 90 seconds in GREEN does not switch to any new light.\"");

        }
    }
}