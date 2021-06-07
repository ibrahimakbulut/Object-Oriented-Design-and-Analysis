public class SelectCommand implements Command{

    Select select;

    public SelectCommand(Select select) {

        this.select=select;
    }

    public void execute(){
        select.runSelectQuery();
    }

    public void undo(){
       // this undo function do nothings , because there is no inverse of just select commmand over an account

        System.out.println("Select command undo did nothing");
    }

}
