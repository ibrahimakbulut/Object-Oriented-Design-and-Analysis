public class AutoRifle extends WeaponDecorator{

    private final Suit suit;

    public AutoRifle(Suit suit){
        this.suit=suit;
    }
    public String getDescription(){

        return suit.getDescription() + " + AutoRifle";
    }

    public double cost(){
        return 30 + suit.cost();
    }

    public double weight(){
        return 1.5 + suit.weight();
    }

}
