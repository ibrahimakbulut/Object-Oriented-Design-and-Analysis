public class Main {

    public static void main(String[] args) {


        System.out.println("SmartPhone solds in Turkey Market");

        SmartPhoneMarket turkeyMarket= new TurkeySmartPhoneMarket();

        SmartPhone smartPhone= turkeyMarket.buySmartPhone("MaximumEffort");
        System.out.println(smartPhone.getPhoneName());
        System.out.println("---------------------------------------------------------------");

        smartPhone=turkeyMarket.buySmartPhone("IflasDeluxe");
        System.out.println(smartPhone.getPhoneName());
        System.out.println("---------------------------------------------------------------");

        smartPhone=turkeyMarket.buySmartPhone("I-I-Aman-Iflas");
        System.out.println(smartPhone.getPhoneName());

        System.out.println("\n\n");


        System.out.println("SmartPhone solds in EU Market");
        SmartPhoneMarket euMarket= new EUSmartPhoneMarket();

        smartPhone= euMarket.buySmartPhone("MaximumEffort");
        System.out.println(smartPhone.getPhoneName());
        System.out.println("---------------------------------------------------------------");

        smartPhone= euMarket.buySmartPhone("IflasDeluxe");
        System.out.println(smartPhone.getPhoneName());
        System.out.println("---------------------------------------------------------------");

        smartPhone= euMarket.buySmartPhone("I-I-Aman-Iflas");
        System.out.println(smartPhone.getPhoneName());

        System.out.println("\n\n");

        System.out.println("SmartPhone solds in Global Market");
        SmartPhoneMarket globalMarket= new GlobalSmartPhoneMarket();

        smartPhone= globalMarket.buySmartPhone("MaximumEffort");
        System.out.println(smartPhone.getPhoneName());
        System.out.println("---------------------------------------------------------------");

        smartPhone= globalMarket.buySmartPhone("IflasDeluxe");
        System.out.println(smartPhone.getPhoneName());
        System.out.println("---------------------------------------------------------------");

        smartPhone= globalMarket.buySmartPhone("I-I-Aman-Iflas");
        System.out.println(smartPhone.getPhoneName());


    }
}
