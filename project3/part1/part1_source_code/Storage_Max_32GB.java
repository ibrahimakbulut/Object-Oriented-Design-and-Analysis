public class Storage_Max_32GB implements Storage{

    boolean microSDsupport;

    int storage_size_in_GBs;

    public Storage_Max_32GB(boolean microSDsupport, int storage_size_in_GBs){
        this.microSDsupport=microSDsupport;
        this.storage_size_in_GBs=storage_size_in_GBs;
    }

    public String toString(){

        return "Storage: microSDsupport- "+ microSDsupport+ ", " + storage_size_in_GBs + "GB , Max SD Card Size-32GB";
    }

    public void functiondump(){
        return;
    }
}
