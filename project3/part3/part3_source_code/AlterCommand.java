public class AlterCommand implements Command{

    Alter alter;

    public AlterCommand(Alter alter){

        this.alter= alter;
    }

    public void execute(){

        alter.runAlterQuery();
    }

    public void undo(){
        // this undo function do nothings , because the execution function is just symbolic.

        System.out.println("Alter command's undo did nothing");
    }
}
