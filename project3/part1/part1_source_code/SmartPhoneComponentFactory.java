import java.util.ArrayList;

public interface SmartPhoneComponentFactory {

    public CpuAndRam create_CpuAndRam(double core_speed_in_GHz,int RAM_in_GBs);
    public Display create_Display(double inches);
    public Battery create_Battery(int hours, int Amper);
    public Case create_Case(ArrayList<String> case_poperties);
    public Storage create_Storage(boolean microSDsupport, int storageSize_in_GBs);
    public Camera create_Camera(int pixelOffrontcamera, int pixelOfrearcamera);
}
