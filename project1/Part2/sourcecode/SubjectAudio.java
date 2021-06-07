import java.util.Observable;

public class SubjectAudio extends Observable {

    private String audio;

    public SubjectAudio(){};

    public void audioChanged(){
        setChanged();
        notifyObservers();
    }

    public void setAudio(String audio){
        this.audio=audio;
        audioChanged();
    }
    public String getAudio(){
        return audio;
    }
}
