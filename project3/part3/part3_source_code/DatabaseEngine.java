public class DatabaseEngine {

    Command[] commands;

    Command undoCommand;

    public DatabaseEngine(){
        commands= new Command[4]; // there will be 4 slot in databaseEngine

        Command noCommand = new NoCommand();

        commands[0]= noCommand;
        commands[1]= noCommand;
        commands[2]= noCommand;
        commands[3]= noCommand;

        undoCommand= noCommand;
    }

    public void setCommand(int slot, Command transaction){

        commands[slot]= transaction;
    }

    public void OperationWasExecuted(int slot){
        commands[slot].execute();
        undoCommand = commands[slot];
    }

    public void undoOperationWasExecuted(){
        undoCommand.undo();
    }
}

