public class Laser extends WeaponDecorator{

    private final Suit suit;

    public Laser(Suit suit){
        this.suit=suit;
    }
    public String getDescription(){

        return suit.getDescription() + " + Laser";
    }

    public double cost(){
        return 200 + suit.cost();
    }

    public double weight(){
        return 5.5 + suit.weight();
    }
}
