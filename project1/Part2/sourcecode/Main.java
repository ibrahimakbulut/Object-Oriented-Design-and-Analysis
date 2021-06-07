public class Main {

    public static void main(String[] args) {

        //contents respectively: Text, Audio, Photograph
        // 1 mean subscriber is interested in content.

        WebSite website1= new WebSite();
        WebSite website2= new WebSite();
        WebSite website3= new WebSite();


        int[] subscriber1_interest_list={1,0,1};
        Subscriber s1= new Subscriber(subscriber1_interest_list);

        int[] subscriber2_interest_list={1,1,1};
        Subscriber s2= new Subscriber(subscriber2_interest_list);

        int[] subscriber3_interest_list={0,1,0};
        Subscriber s3= new Subscriber(subscriber3_interest_list);

        website1.addSubscriber(s1,s1.getInterested_contexts_list());
        System.out.println("subscriber1 subscribed to website1");

        website2.addSubscriber(s1,s1.getInterested_contexts_list());
        System.out.println("subscriber1 subscribed to website2");

        website1.addSubscriber(s2,s2.getInterested_contexts_list());
        System.out.println("subscriber2 subscribed to website1");

        website3.addSubscriber(s2,s2.getInterested_contexts_list());
        System.out.println("subscriber2 subscribed to website3");

        website2.addSubscriber(s3,s3.getInterested_contexts_list());
        System.out.println("subscriber3 subscribed to website2");

        website3.addSubscriber(s3,s3.getInterested_contexts_list());
        System.out.println("subscriber3 subscribed to website3");

        System.out.println("-------------------------------------------------------");

        System.out.println("website1 changed its text content");
        website1.setText("coronavirus");

        System.out.println("-------------------------------------------------------");

        System.out.println("website1 changed its audio content");
        website1.setAudio("bird voice");

        System.out.println("-------------------------------------------------------");

        System.out.println("website 1 changed its photograph content");
        website1.setPhotograph("image of cat");

        System.out.println("-------------------------------------------------------");

        System.out.println("website2 changed its text content");
        website2.setText("people are starving in africa");

        System.out.println("-------------------------------------------------------");

        System.out.println("website2 changed its audio content");
        website2.setAudio("neşet ertaş's new song");

        System.out.println("-------------------------------------------------------");

        System.out.println("website 2 changed its photograph content");
        website2.setPhotograph("image of dog");


        System.out.println("-------------------------------------------------------");

        System.out.println("website3 changed its text content");
        website3.setText("new vaccine found for coronavirus");

        System.out.println("-------------------------------------------------------");

        System.out.println("website3 changed its audio content");
        website3.setAudio("chopin's new album");

        System.out.println("-------------------------------------------------------");

        System.out.println("website3 changed its photograph content");
        website3.setPhotograph("image of car");

        System.out.println("\n\n\n\n-------------------------------------------------------\n\n\n\n");

        website1.deletesubscriber(s1,s1.getInterested_contexts_list());

        System.out.println("subscriber1 unsubscribed from website1");

        website2.deletesubscriber(s3,s3.getInterested_contexts_list());

        System.out.println("subscriber3 unsubscribed from website2");

        website3.deletesubscriber(s2,s2.getInterested_contexts_list());

        System.out.println("subscriber2 unsubscribed from website3");

        System.out.println("\n\n\n\n-------------------------------------------------------\n\n\n\n");

        System.out.println("website1 changed its text content");
        website1.setText("dolar rate dropped");

        System.out.println("-------------------------------------------------------");

        System.out.println("website1 changed its audio content");
        website1.setAudio("erkan ogur's new song is released");

        System.out.println("-------------------------------------------------------");

        System.out.println("website 1 changed its photograph content");
        website1.setPhotograph("image of sunrise");

        System.out.println("-------------------------------------------------------");

        System.out.println("website2 changed its text content");
        website2.setText("The thieves who robbed the jewelers in Istanbul were caught");

        System.out.println("-------------------------------------------------------");

        System.out.println("website2 changed its audio content");
        website2.setAudio("adele released a new song");

        System.out.println("-------------------------------------------------------");

        System.out.println("website 2 changed its photograph content");
        website2.setPhotograph("image of rainbow");


        System.out.println("-------------------------------------------------------");

        System.out.println("website3 changed its text content");
        website3.setText("earthquake occurred in izmir");

        System.out.println("-------------------------------------------------------");

        System.out.println("website3 changed its audio content");
        website3.setAudio("zeki muren released a new album");

        System.out.println("-------------------------------------------------------");

        System.out.println("website3 changed its photograph content");
        website3.setPhotograph("image of mountain");

    }

}
