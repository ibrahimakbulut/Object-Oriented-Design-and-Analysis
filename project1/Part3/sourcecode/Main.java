public class Main {

    public static void main(String[] args) {

        Suit suit1= new Dec();

        System.out.println(suit1.getDescription()+ "' total cost : " + suit1.cost() + " $");

        System.out.println(suit1.getDescription()+ "' total weight : " + suit1.weight() + " kg");

        System.out.println("------------------------------------------------");

        Suit suit2= new Tor();

        suit2= new RocketLauncher(suit2);
        suit2= new AutoRifle(suit2);
        suit2= new Laser(suit2);
        suit2= new Flamethrower(suit2);


        System.out.println(suit2.getDescription()+ "' total cost : " + suit2.cost() + " $");

        System.out.println(suit2.getDescription()+ "' total weight : " + suit2.weight() + " kg");

        System.out.println("------------------------------------------------");


        Suit suit3= new Ora();

        suit3= new RocketLauncher(suit3);
        suit3= new AutoRifle(suit3);
        suit3= new Laser(suit3);
        suit3= new RocketLauncher(suit3);
        suit3= new Laser(suit3);

        System.out.println(suit3.getDescription()+ "' total cost : " + suit3.cost() + " $");
        System.out.println(suit3.getDescription()+ "' total weight : " + suit3.weight() + " kg");
        System.out.println("------------------------------------------------");

    }



}
