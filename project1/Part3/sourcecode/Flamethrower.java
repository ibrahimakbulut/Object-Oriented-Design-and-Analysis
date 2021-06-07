public class Flamethrower extends WeaponDecorator{

    private final Suit suit;

    public Flamethrower(Suit suit){
        this.suit=suit;
    }
    public String getDescription(){

        return suit.getDescription() + " + Flamethrower";
    }

    public double cost(){
        return 50+ suit.cost();
    }

    public double weight(){
        return 2+ suit.weight();
    }

}
