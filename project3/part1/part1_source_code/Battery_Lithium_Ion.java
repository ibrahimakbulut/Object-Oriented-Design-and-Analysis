public class Battery_Lithium_Ion implements Battery{

    int TimeOfBatteryLife;
    int AmperOfBattery;

    public Battery_Lithium_Ion(int TimeOfBatteryLife,int AmperOfBattery){
        this.TimeOfBatteryLife= TimeOfBatteryLife;
        this.AmperOfBattery=AmperOfBattery;
    }

    public String toString(){
        return "Battery: Lithium-Ion, " + TimeOfBatteryLife + "h, " + AmperOfBattery + "mAh ";

    }
    public void functiondump(){
        return;
    }
}
