public class TrafficLightTestDrive {

    public static void main(String[] args) {

        //connect the camera to traffic lights so the traffic lights can be aware of the traffic situation and change their behavior
        // observer - observable relation
        HiTech detectTraffic= new HiTech();
        TrafficLight trafficLight = new TrafficLight(detectTraffic);

        //actions are in the order they should be. That is the way the actions are performed in the correct order.
        // Timeout for GREEN is 60 seconds as default. So lets see how our traffic ligts are working with correct actions
        System.out.println(trafficLight.toString());
        System.out.println("15 seconds passed and it reported to traffic light");
        trafficLight.after15Seconds();
        System.out.println(trafficLight.toString()+"\n-----------------------------------");


        System.out.println("60 seconds passed and it reported to traffic light");
        trafficLight.after60Seconds();
        System.out.println(trafficLight.toString()+"\n-----------------------------------");

        System.out.println("3 seconds passed and it reported to traffic light");
        trafficLight.after3Seconds();
        System.out.println(trafficLight.toString()+"\n--------------------------------------------------\n");

        System.out.println("Now let's see what happens when we give the actions in the wrong order.\n\n");

        // Now let's see what happens when we give the actions in the wrong order, sometimes correct order.



        System.out.println(trafficLight.toString());

        System.out.println("60 seconds passed and it reported to traffic light");
        trafficLight.after60Seconds();
        System.out.println(trafficLight.toString()+"\n-----------------------------------");

        System.out.println("15 seconds passed and it reported to traffic light");
        trafficLight.after15Seconds();
        System.out.println(trafficLight.toString()+"\n-----------------------------------");

        System.out.println("3 seconds passed and it reported to traffic light");
        trafficLight.after3Seconds();
        System.out.println(trafficLight.toString()+"\n-----------------------------------");

        //Change GREEN timeout to 90 seconds because of traffic
        detectTraffic.changeDetected(true);

       // passing 60 seconds to GREEN state will not trigger for next state because timeout is 90 seconds now.
        System.out.println("60 seconds passed and it reported to traffic light");
        trafficLight.after60Seconds();
        System.out.println(trafficLight.toString()+"\n-----------------------------------");

        System.out.println("90 seconds passed and it reported to traffic light");
        trafficLight.after90Seconds();
        System.out.println(trafficLight.toString()+"\n-----------------------------------");

        System.out.println("15 seconds passed and it reported to traffic light");
        trafficLight.after15Seconds();
        System.out.println(trafficLight.toString()+"\n-----------------------------------");

        System.out.println("3 seconds passed and it reported to traffic light");
        trafficLight.after3Seconds();
        System.out.println(trafficLight.toString()+"\n-----------------------------------");

        System.out.println("15 seconds passed and it reported to traffic light");
        trafficLight.after15Seconds();
        System.out.println(trafficLight.toString()+"\n-----------------------------------");


        //change GREEN timeout to 60 seconds again, because of traffic. Now, passing 60 seconds to GREEN state will trigger for next state
        detectTraffic.changeDetected(false);

        System.out.println("60 seconds passed and it reported to traffic light");
        trafficLight.after60Seconds();
        System.out.println(trafficLight.toString()+"\n-----------------------------------");


    }
}
