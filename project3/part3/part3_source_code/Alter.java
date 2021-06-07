public class Alter { // I dont implement alter. Alter operation just will print that an alter operation was executed

    String [][] table; //database

    private String will_executed_query;

    public Alter(String[][] table, String query){
        this.table=table;
        will_executed_query=query;
    }

    // This function is symbolic. It does nothing actually, it dont effect the database table.
    public void runAlterQuery(){

        System.out.printf("\"Alter %s \" query was executed\n",will_executed_query);
    }
    public void setWillExecutedQuery(String query){

        will_executed_query= query;
    }
}
