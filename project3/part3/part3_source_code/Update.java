public class Update {

    private String [][] table; //database

    private String updated_value;
    private  String executed_query;
    private String will_executed_query;

    public Update(String[][] table, String query){
        this.table=table;
        will_executed_query=query; // take the query from constructor

    }

    public void runUpdateQuery(){

        String [] elements= will_executed_query.split(" ",3);

        executed_query=will_executed_query; //store executed query

        int column_number=-1;
        int row_number=-1;

        // find right element in table
        for(int i=0;i<table.length;++i){

            if(table[i][0].compareTo(elements[0])==0){

                row_number=i;
            }

        }

        for(int i=0;i<table[0].length;++i){
            if(table[0][i].compareTo(elements[1])==0){
                column_number=i;
            }
        }

        table[row_number][column_number]=   String.valueOf(Double.parseDouble(table[row_number][column_number])  +   Double.parseDouble(elements[2]));
        updated_value= new String(elements[2]);
    }

    public String getUpdated_value(){
        return updated_value;
    }

    public String getExecuted_query(){
        return executed_query;
    }

    public void setWillExecutedQuery(String query){
        will_executed_query= query;
    }

}
