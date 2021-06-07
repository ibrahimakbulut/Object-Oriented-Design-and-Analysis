import java.util.ArrayList;

public class IflasDeluxeSmartPhone extends SmartPhone{

    SmartPhoneComponentFactory componentFactory;

    public IflasDeluxeSmartPhone(SmartPhoneComponentFactory componentFactory){

        this.componentFactory=componentFactory;
    }

    public void collectComponents(){

        phoneDisplay= componentFactory.create_Display(5.3);
        phoneBattery=componentFactory.create_Battery(20,2800);
        phoneCpuAndRam=componentFactory.create_CpuAndRam(2.2,6);
        phoneStorage=componentFactory.create_Storage(true,32);
        phoneCamera=componentFactory.create_Camera(12,5);

        ArrayList<String> caseProperties= new ArrayList<String>();
        caseProperties.add("149x73x7.7 mm");
        caseProperties.add("waterproof");
        caseProperties.add("aluminum");
        phoneCase=componentFactory.create_Case(caseProperties);
    }
}
