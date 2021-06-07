public class DatabaseTable implements ITable{

    String[][] table;


    public DatabaseTable(String[][] table){
        this.table=table;
    }

    public Object getElementAt(int row, int column){
        return table[row][column];
    }
    public void setElementAt(int row, int column, Object o){

        table[row][column]= (String)o;
    }
    public int getNumberOfRows(){

        if(table==null)
            return 0;
        return table.length;
    }
    public int getNumberOfColumns(){

        if(table==null)
            return 0;
        return table[0].length;
    }

}
