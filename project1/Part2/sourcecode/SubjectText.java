import java.util.Observable;

public class SubjectText extends Observable {

    private String text;

    public SubjectText(){};

    public void textChanged(){
        setChanged();
        notifyObservers();
    }

    public void setText(String text){
        this.text=text;
        textChanged();
    }
    public String getText(){
        return text;
    }

}
