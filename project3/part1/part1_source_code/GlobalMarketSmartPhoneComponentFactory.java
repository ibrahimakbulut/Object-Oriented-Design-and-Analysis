import java.util.ArrayList;

public class GlobalMarketSmartPhoneComponentFactory implements SmartPhoneComponentFactory{

    public Display create_Display(double inches){


        return new Display_24bit(inches);
    }

    public Battery create_Battery(int hours, int Amper){

        return new Battery_Lithium_Cobalt(hours,Amper);
    }

    public Camera create_Camera(int pixelOffrontcamera, int pixelOfrearcamera){
        return new Camera_2xzoom(pixelOffrontcamera,pixelOfrearcamera);
    }

    public Case create_Case(ArrayList<String> case_poperties){

        return new Case_waterproofUpto50cm(case_poperties);
    }
    public Storage create_Storage(boolean microSDsupport, int storageSize_in_GBs){
        return new Storage_Max_32GB(microSDsupport,storageSize_in_GBs);
    }
    public CpuAndRam create_CpuAndRam(double core_speed_in_GHz,int RAM_in_GBs){

        return new CpuAndRam_2cores(core_speed_in_GHz,RAM_in_GBs);
    }
}
