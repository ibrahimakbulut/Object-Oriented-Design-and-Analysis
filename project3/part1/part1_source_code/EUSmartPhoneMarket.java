public class EUSmartPhoneMarket extends SmartPhoneMarket{

    protected SmartPhone createPhone(String phoneModel){

        SmartPhone smartPhone=null;

        SmartPhoneComponentFactory smartPhoneComponentFactory= new EUMarketSmartPhoneComponentFactory();

        if(phoneModel.equals("MaximumEffort")){

            smartPhone= new MaximumEffortSmartPhone(smartPhoneComponentFactory);
            smartPhone.setPhoneName("EU specificated MaximumEEffort smartphone");
        }
        else if(phoneModel.equals("IflasDeluxe")){
            smartPhone= new IflasDeluxeSmartPhone(smartPhoneComponentFactory);
            smartPhone.setPhoneName("EU specificated IflasDeluxe smartphone");
        }

        else if(phoneModel.equals("I-I-Aman-Iflas")){
            smartPhone= new I_I_Aman_IflasSmartPhone(smartPhoneComponentFactory);
            smartPhone.setPhoneName("EU specificated I-I-Aman-Iflas smartphone");
        }

        return smartPhone;
    }
}
