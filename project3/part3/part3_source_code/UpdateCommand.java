public class UpdateCommand implements Command{

    Update update; // we keep an update object. Processes will be work over this object.

    public UpdateCommand(Update update) {

        this.update=update;
    }

    public void execute(){
        update.runUpdateQuery();
    }

    public void undo(){

        String [] elements= update.getExecuted_query().split(" ",3);//get the last executed query and split it strings

        String new_query= elements[0]+" " + elements[1] + " " + String.valueOf(-1*Double.parseDouble(update.getUpdated_value()));
        // The inverse of addition is subtraction. So the reverse of the last added amount is added again.

        String temp= update.getExecuted_query(); //store the last executed query in update object
        update.setWillExecutedQuery(new_query); //set new query that will be executed
        update.runUpdateQuery(); //run query
        update.setWillExecutedQuery(temp); // set old query to new query that will be executed.

    }
}
