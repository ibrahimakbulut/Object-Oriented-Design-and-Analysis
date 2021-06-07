import java.util.*;

// This class is like a party mode class. It executes more than one command
public class TransactionCommand implements Command {
    Command[] commands; // these commands are taken from constructor.

    //We will keep a stack for executed commands.
    Stack<Command> stack_for_executed_operations;


    public TransactionCommand(Command[] commands) {

        stack_for_executed_operations= new Stack<Command>();
        this.commands = commands;
    }
    public void execute(){

        for(int i=0;i< commands.length;++i){
            stack_for_executed_operations.push(commands[i]);
            commands[i].execute();
        }
        //if every commands work properly, then we clear the stack. Because we dont need anymore to keep executed commands
        stack_for_executed_operations.clear();
    }

    public void undo(){

        // if a problem occurs, then every command from stack will execute their undo methods.
        while(!stack_for_executed_operations.empty()){

            stack_for_executed_operations.pop().undo();
        }

    }
}