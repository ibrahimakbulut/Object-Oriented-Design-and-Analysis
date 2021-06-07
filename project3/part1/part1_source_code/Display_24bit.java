public class Display_24bit implements Display{

    double inche_size;


    public String toString(){
        return "Display: " + inche_size + " inches" + ", 24 bit";
    }

    public void functiondump(){
        return;
    }

    public Display_24bit(double inches){
        inche_size=inches;
    }
}
