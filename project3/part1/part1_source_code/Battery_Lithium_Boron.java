public class Battery_Lithium_Boron implements Battery{

    int TimeOfBatteryLife;
    int AmperOfBattery;

    public Battery_Lithium_Boron(int TimeOfBatteryLife,int AmperOfBattery){
        this.TimeOfBatteryLife= TimeOfBatteryLife;
        this.AmperOfBattery=AmperOfBattery;
    }

    public String toString(){
        return "Battery: Lithium-Boron, " + TimeOfBatteryLife + "h, " + AmperOfBattery + "mAh ";

    }
    public void functiondump(){
        return;
    }
}
