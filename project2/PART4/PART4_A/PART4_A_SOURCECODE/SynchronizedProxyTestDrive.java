public class SynchronizedProxyTestDrive {


    public static void main(String[] args) {

        //Create a simple string table

        String[][] table= {

                {"IBRAHIM","AKBULUT","500200","TURKEY","ISTANBUL"},
                {"FERHAT","KARAMAN", "700568", "TURKEY", "GIRESUN"},
                {"ULKU", "KODAZ", "900846","ENGLAND","LONDON"}
        };

        //Give this table to DatabaseTable constructor

        DatabaseTable databaseTable= new DatabaseTable(table);

        // Give DatabaseTable object to Proxy

        DatabaseTableSyncronozationProxy ClientProxy= new DatabaseTableSyncronozationProxy(databaseTable);


        //Two clients make many call to Database via Proxy

        //I used same rows in function call , So it can be shown that two threads(it can be more) work in get and set elements
        //methods synchronously

        Thread client1= new Thread(new Runnable() {
            @Override
            public void run() {

                //setting and getting calls
                for(int i=0; i<10;++i) {
                    if(i%2==0)
                        ClientProxy.getElementAt(2, 3);
                    else
                        ClientProxy.setElementAt(1, 1,"RUSSIA");
                }

                ClientProxy.getNumberOfColumns();
                ClientProxy.getNumberOfRows();
            }
        });

        Thread client2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<10;++i) {
                    if(i%2==0)
                        ClientProxy.getElementAt(2, 3);
                    else
                        ClientProxy.setElementAt(1, 1,"GERMAN");
                }

                ClientProxy.getNumberOfColumns();
                ClientProxy.getNumberOfRows();
            }
        });


        client1.start();
        client2.start();

        try {
            client1.join();
            client2.join();
        }

        catch (Exception e){
            e.printStackTrace();
        }
    }
}
