public class DatabaseTable {

    private String[][] table; // I assume that database is a table.

    public DatabaseTable(){ //create database table as an 3x3 String array
        table = new String[3][3];

        table[0][0]= "Name";
        table[0][1]= "Surname";
        table[0][2]= "Money";

        table[1][0]= "IBRAHIM";
        table[1][1]= "AKBULUT";
        table[1][2]= "0";

        table[2][0]= "ALICE";
        table[2][1]= "WILLIAMS";
        table[2][2]= "0";
    }

    public String[][] getTable(){

        return table;
    }

    public void printTable(){ //print database table

        for(int i=0; i<3;++i){

            for(int j=0;j<3;++j){

                System.out.printf(table[i][j] + "                    ");
            }

            System.out.printf("\n");
        }
    }
}

