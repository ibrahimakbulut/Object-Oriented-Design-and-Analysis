public class TrafficLightTestDrive {

    public static void main(String[] args) {

        //actions are in the order they should be. That is the way the actions are performed in the correct order.

        TrafficLight trafficLight = new TrafficLight();

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

        // Now let's see what happens when we give the actions in the wrong order.

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

        System.out.println("60 seconds passed and it reported to traffic light");
        trafficLight.after60Seconds();
        System.out.println(trafficLight.toString()+"\n-----------------------------------");

        System.out.println("15 seconds passed and it reported to traffic light");
        trafficLight.after15Seconds();
        System.out.println(trafficLight.toString()+"\n-----------------------------------");


    }
}
