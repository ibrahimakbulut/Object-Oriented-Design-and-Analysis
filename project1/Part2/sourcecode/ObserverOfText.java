import java.util.Observable;
import java.util.Observer;

public class ObserverOfText implements Observer {

    private String text="initialized text";

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof SubjectText) {
            SubjectText textData = (SubjectText) o;
            this.text = textData.getText();
            System.out.println("text is changed. new text: "+ text);

        }
    }
}
