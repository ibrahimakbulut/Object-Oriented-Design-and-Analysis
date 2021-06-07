import java.util.ArrayList;

public class I_I_Aman_IflasSmartPhone extends SmartPhone{

    SmartPhoneComponentFactory componentFactory;

    public I_I_Aman_IflasSmartPhone(SmartPhoneComponentFactory componentFactory){

        this.componentFactory=componentFactory;
    }

    public void collectComponents(){

        phoneDisplay= componentFactory.create_Display(4.5);
        phoneBattery=componentFactory.create_Battery(16,2000);
        phoneCpuAndRam=componentFactory.create_CpuAndRam(2.2,4);
        phoneStorage=componentFactory.create_Storage(true,16);
        phoneCamera=componentFactory.create_Camera(8,5);

        ArrayList<String> caseProperties= new ArrayList<String>();
        caseProperties.add("143x69x7.3 mm");
        caseProperties.add("waterproof");
        caseProperties.add("plastic");
        phoneCase=componentFactory.create_Case(caseProperties);
    }
}
