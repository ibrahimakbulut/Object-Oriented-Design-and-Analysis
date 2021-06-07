import java.util.Observable;
import java.util.Observer;

public class ObserverOfAudio implements Observer {

    private String audio="initialized audio";

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof SubjectAudio) {
            SubjectAudio audioData = (SubjectAudio) o;
            this.audio = audioData.getAudio();
            System.out.println("audio is changed. new audio: "+ audio);

        }
    }
}
