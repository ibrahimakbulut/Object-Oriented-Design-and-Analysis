import java.util.Observable;
import java.util.Observer;

public class ObserverOfPhotograph implements Observer {

    private String photograph="initialized photograph";

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof SubjectPhotograph) {
            SubjectPhotograph photographData = (SubjectPhotograph) o;
            this.photograph = photographData.getPhotograph();
            System.out.println("photograph is changed. new photograph: "+ photograph);

        }
    }



}
