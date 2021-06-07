public class Battery_Lithium_Cobalt implements Battery{

    int TimeOfBatteryLife;
    int AmperOfBattery;

    public Battery_Lithium_Cobalt(int TimeOfBatteryLife,int AmperOfBattery){
        this.TimeOfBatteryLife= TimeOfBatteryLife;
        this.AmperOfBattery=AmperOfBattery;
    }

    public String toString(){
        return "Battery: Lithium-Cobalt, " + TimeOfBatteryLife + "h, " + AmperOfBattery + "mAh ";

    }
    public void functiondump(){
        return;
    }
}
