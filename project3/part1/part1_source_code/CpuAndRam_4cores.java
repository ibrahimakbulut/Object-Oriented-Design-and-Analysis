public class CpuAndRam_4cores implements  CpuAndRam{

    private double core_speed_in_GHz;
    private int RAM_in_GBs;

    public CpuAndRam_4cores(double core_speed_in_GHz,int RAM_in_GBs){

        this.core_speed_in_GHz=core_speed_in_GHz;
        this.RAM_in_GBs=RAM_in_GBs;
    }

    public String toString(){
        return "CPU:" + core_speed_in_GHz + "GHz, 4 Cores "+ "RAM: " + RAM_in_GBs+ "GB";
    }
    public void functiondump(){
        return;
    }
}
