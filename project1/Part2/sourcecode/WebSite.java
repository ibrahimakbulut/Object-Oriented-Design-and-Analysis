import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class WebSite {

    private ArrayList<Observable> observable_list;

    public WebSite(){

        observable_list= new ArrayList<Observable>();

        observable_list.add(new SubjectText());
        observable_list.add(new SubjectAudio());
        observable_list.add(new SubjectPhotograph());
    }


    public void addSubscriber(Subscriber subscriber, int[] interested_context_list){


        for(int i=0;i<observable_list.size();++i){

            if(interested_context_list[i]==1){
                observable_list.get(i).addObserver(subscriber.getObserverlist().get(i));
            }

        }
    }

    public void deletesubscriber(Subscriber subscriber, int[] interested_context_list){

        for(int i=0;i<observable_list.size();++i){

            if(interested_context_list[i]==1){
                observable_list.get(i).deleteObserver(subscriber.getObserverlist().get(i));
            }

        }
    }

    public ArrayList<Observable> getObservable_list(){
        return observable_list;
    }

    public void setText(String text){

        ((SubjectText)observable_list.get(0)).setText(text);
    }

    public void setAudio(String audio){

        ((SubjectAudio)observable_list.get(1)).setAudio(audio);
    }

    public void setPhotograph(String photograph){

        ((SubjectPhotograph)observable_list.get(2)).setPhotograph(photograph);
    }

    public String getText(){

       return  ((SubjectText)observable_list.get(0)).getText();
    }

    public String getAudio(){

        return ((SubjectAudio)observable_list.get(1)).getAudio();
    }
    public String getPhotograph(){

        return ((SubjectPhotograph)observable_list.get(2)).getPhotograph();
    }



}
