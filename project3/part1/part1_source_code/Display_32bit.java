public class Display_32bit implements Display {

    double inche_size;


    public String toString(){
        return "Display: " + inche_size + " inches" + ", 32 bit";
    }

    public void functiondump(){
        return;
    }

    public Display_32bit(double inches){
        inche_size=inches;
    }
}
