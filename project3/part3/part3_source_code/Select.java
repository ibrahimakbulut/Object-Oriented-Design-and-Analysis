public class Select { //I dont implement select. Alter operation just will print that an alter operation was executed

    String [][] table; //database

    private String will_executed_query;

    public Select(String[][] table, String query){
        this.table=table;
        will_executed_query=query;
    }

    // This function is symbolic. It does nothing actually, it dont effect the database table.
    public void runSelectQuery(){

        System.out.printf("\"Select %s query \" was executed\n",will_executed_query);
    }

    public void setWillExecutedQuery(String query){

        will_executed_query= query;
    }
}
