public abstract class Suit {

    String description= "Inknown Suit";

    public String getDescription(){

        return description;
    }

    public abstract double cost();

    public abstract  double weight();
}
