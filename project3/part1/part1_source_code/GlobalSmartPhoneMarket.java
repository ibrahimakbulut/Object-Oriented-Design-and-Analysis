public class GlobalSmartPhoneMarket extends SmartPhoneMarket{

    protected SmartPhone createPhone(String phoneModel){

        SmartPhone smartPhone=null;

        SmartPhoneComponentFactory smartPhoneComponentFactory= new GlobalMarketSmartPhoneComponentFactory();

        if(phoneModel.equals("MaximumEffort")){

            smartPhone= new MaximumEffortSmartPhone(smartPhoneComponentFactory);
            smartPhone.setPhoneName("Global specificated MaximumEEffort smartphone");
        }
        else if(phoneModel.equals("IflasDeluxe")){
            smartPhone= new IflasDeluxeSmartPhone(smartPhoneComponentFactory);
            smartPhone.setPhoneName("Global specificated IflasDeluxe smartphone");
        }

        else if(phoneModel.equals("I-I-Aman-Iflas")){
            smartPhone= new I_I_Aman_IflasSmartPhone(smartPhoneComponentFactory);
            smartPhone.setPhoneName("Global specificated I-I-Aman-Iflas smartphone");
        }

        return smartPhone;
    }
}
