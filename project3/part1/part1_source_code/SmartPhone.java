public abstract class SmartPhone {

    String phoneName;

    Display phoneDisplay;
    Battery phoneBattery;
    CpuAndRam phoneCpuAndRam;
    Storage phoneStorage;
    Camera phoneCamera;
    Case phoneCase;

    abstract void collectComponents();

    void attach_CpuAndRam(){

        System.out.printf("attaching %s to the board\n",phoneCpuAndRam.toString());
    }
    void attach_Display(){
        System.out.printf("attaching %s to the phone\n",phoneDisplay.toString());
    }
    void attach_Battery(){
        System.out.printf("attaching %s to the phone\n",phoneBattery.toString());
    }
    void attach_Storage(){
        System.out.printf("attaching %s to the phone\n",phoneStorage.toString());
    }
    void attach_Camera(){
        System.out.printf("attaching %s to the phone\n",phoneCamera.toString());
    }
    void enclose_Phone(){
        System.out.printf("enclosing the phone with %s\n",phoneCase.toString());
    }

    public String getPhoneName(){
        return phoneName;
    }
    public void setPhoneName(String phoneName){
        this.phoneName=phoneName;
    }

    public String toString(){
        return "smartphone model: " + getPhoneName()+ "\nProperties: "+ phoneCpuAndRam.toString() +", "+ phoneDisplay.toString()+
                ", "+ phoneBattery.toString()+ ", " + phoneStorage.toString()+ ", "+ phoneCamera.toString()+ "," + phoneCase.toString();
    }


}
