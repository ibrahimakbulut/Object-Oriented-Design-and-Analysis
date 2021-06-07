import java.util.Observable;

public class SubjectPhotograph extends Observable {

    private String photograph;

    public SubjectPhotograph(){};

    public void photographChanged(){
        setChanged();
        notifyObservers();
    }

    public void setPhotograph(String photograph){
        this.photograph=photograph;
        photographChanged();
    }
    public String getPhotograph(){
        return photograph;
    }
}
