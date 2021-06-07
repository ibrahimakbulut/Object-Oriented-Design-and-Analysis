public abstract class SmartPhoneMarket {

    public SmartPhone buySmartPhone(String phoneModel){
        SmartPhone smartPhone;

        smartPhone=createPhone(phoneModel);

        smartPhone.collectComponents();;

        smartPhone.attach_CpuAndRam();
        smartPhone.attach_Display();
        smartPhone.attach_Battery();
        smartPhone.attach_Storage();
        smartPhone.attach_Camera();
        smartPhone.enclose_Phone();

        return smartPhone;
    }

    protected abstract SmartPhone createPhone(String phoneModel);

}
