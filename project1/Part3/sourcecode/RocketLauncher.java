public class RocketLauncher extends WeaponDecorator{

    private final Suit suit;

    public RocketLauncher(Suit suit){
        this.suit=suit;
    }
    public String getDescription(){

        return suit.getDescription() + " + RocketLauncher";
    }

    public double cost(){
        return 150 + suit.cost();
    }

    public double weight(){
        return 7.5 + suit.weight();
    }

}
