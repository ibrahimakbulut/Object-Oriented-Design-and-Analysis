import java.util.ArrayList;
import java.util.Observer;

public class Subscriber {
    
    private int[] interested_contexts_list;

    private ArrayList<Observer> observerlist;

    public Subscriber(int[] interested_contexts_list){

        observerlist= new ArrayList<Observer>();

        observerlist.add(new ObserverOfText());
        observerlist.add(new ObserverOfAudio());
        observerlist.add(new ObserverOfPhotograph());

        this.interested_contexts_list= interested_contexts_list;


    }

    public int[] getInterested_contexts_list(){
        return interested_contexts_list;
    }

    public ArrayList<Observer> getObserverlist(){

        return observerlist;
    }
}
