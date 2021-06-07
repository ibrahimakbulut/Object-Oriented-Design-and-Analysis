public class Main {

    public static void main(String[] args) {

        DatabaseTable database= new DatabaseTable(); // create database

        //create queries
        Update update= new Update(database.getTable(),"IBRAHIM Money 200");
        Select select = new Select(database.getTable(),"IBRAHIM Money");
        Alter alter = new Alter(database.getTable(),"Money");

        //create query commands
        UpdateCommand updateCommand = new UpdateCommand(update);
        SelectCommand selectCommand = new SelectCommand(select);
        AlterCommand alterCommand= new AlterCommand(alter);

        //create databaseEngine. It is a like remotecontroller
        DatabaseEngine databaseEngine = new DatabaseEngine();

        //set slots of databaseEngine
        databaseEngine.setCommand(0,updateCommand);
        databaseEngine.setCommand(1,selectCommand);
        databaseEngine.setCommand(2,alterCommand);

        //run slot 0 of databaseEngine. like pushing to button
        databaseEngine.OperationWasExecuted(0);
        database.printTable();

        System.out.println("-------------------------------");

        //run undo slot of databaseEngine.
        databaseEngine.undoOperationWasExecuted();
        database.printTable();

        System.out.println("-------------------------------");

        //change query of button
        update.setWillExecutedQuery("IBRAHIM Money 500");
        //push button 0
        databaseEngine.OperationWasExecuted(0);

        update.setWillExecutedQuery("IBRAHIM Money 200");
        databaseEngine.OperationWasExecuted(0);

        update.setWillExecutedQuery("IBRAHIM Money 300");
        databaseEngine.OperationWasExecuted(0);

        databaseEngine.undoOperationWasExecuted();
        database.printTable();

        System.out.println("-------------------------------");

        //run slot 1(select) of databaseEngine. like pushing to button
        databaseEngine.OperationWasExecuted(1);
        databaseEngine.undoOperationWasExecuted();

        //run slot 2(alter) of databaseEngine. like pushing to button
        databaseEngine.OperationWasExecuted(2);
        databaseEngine.undoOperationWasExecuted();

        database.printTable();

        System.out.println("-------------------------------");

        database.printTable();

        System.out.println("-------------------------------");

        //Prepare transaction command like a party mode. Commands are executed with one button. If you change sequence of
        // commands, it means transaction is another operation from now.
        Command[] transaction= {updateCommand, selectCommand,alterCommand};
        TransactionCommand transactionCommand = new TransactionCommand(transaction);

        databaseEngine.setCommand(3,transactionCommand);
        databaseEngine.OperationWasExecuted(3);
        database.printTable();

        System.out.println("-------------------------------");
        //push undo button. discard all 3 three commands of transaction.
        databaseEngine.undoOperationWasExecuted();

        database.printTable();
        System.out.println("-------------------------------");

        // run another transaction
        update.setWillExecutedQuery("ALICE Money 3000");

        Command[] transaction2= {updateCommand,alterCommand,selectCommand};

        TransactionCommand transactionCommand2= new TransactionCommand(transaction2);

        databaseEngine.setCommand(3,transactionCommand2);
        databaseEngine.OperationWasExecuted(3);
        database.printTable();

        System.out.println("-------------------------------");

        databaseEngine.undoOperationWasExecuted(); // this undo will do nothing. Because every operation of transaction
        //executed fine. So, no operation is canceled

        database.printTable();
        
    }
}
