public class DatabaseTableSyncronozationProxy implements ITable {

    private DatabaseTable databaseTable;

    private String rowsLock[];

    private String rowsLock2[];

    public DatabaseTableSyncronozationProxy(DatabaseTable databaseTable){
        this.databaseTable=databaseTable;

        int number_of_rows=databaseTable.getNumberOfRows();

        rowsLock= new String[number_of_rows];

        rowsLock2= new String[number_of_rows];

        for(int i=0;i<number_of_rows;++i){

            rowsLock[i]= new String();
            rowsLock2[i]= new String();
        }
    }

    public void setElementAt(int row, int column, Object o) {
        synchronized (rowsLock[row]){  //lock the related row for other threads

            rowsLock2[row]="1";
            System.out.printf("A client setting an element in row: %s , in column: %s \n",row,column);

            databaseTable.setElementAt(row,column,o);

            System.out.printf("Client finished its setting operation in row: %s, in column: %s, setted it to %s\n",row,column,(String)o);

            rowsLock2[row]="0";
        }
    }

    public Object getElementAt(int row, int column){

        synchronized (rowsLock2[row]=="1" ? rowsLock[row] : new String()){  //lock the related row for other threads

            System.out.printf("A client getting an element in row: %s , in column: %s\n",row,column);

            Object temp=  databaseTable.getElementAt(row,column);

            System.out.printf("Client finished its getting operation in row: %s , in column: %s ,getting result: %s\n",row,column,(String)temp);

            return temp;
        }
    }

    public int getNumberOfRows(){
        return databaseTable.getNumberOfRows();
    }

    public int getNumberOfColumns(){
        return databaseTable.getNumberOfColumns();
    }
}
