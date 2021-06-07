import java.util.ArrayList;

public class MaximumEffortSmartPhone extends SmartPhone{

    SmartPhoneComponentFactory componentFactory;

    public MaximumEffortSmartPhone(SmartPhoneComponentFactory componentFactory){

        this.componentFactory=componentFactory;
    }

    public void collectComponents(){

        phoneDisplay= componentFactory.create_Display(5.5);
        phoneBattery=componentFactory.create_Battery(27,3600);
        phoneCpuAndRam=componentFactory.create_CpuAndRam(2.8,8);
        phoneStorage=componentFactory.create_Storage(true,64);
        phoneCamera=componentFactory.create_Camera(12,8);

        ArrayList<String> caseProperties= new ArrayList<String>();
        caseProperties.add("151x73x7.7 mm");
        caseProperties.add("dustproof");
        caseProperties.add("waterproof");
        caseProperties.add("aluminum");
        phoneCase=componentFactory.create_Case(caseProperties);
    }
}
