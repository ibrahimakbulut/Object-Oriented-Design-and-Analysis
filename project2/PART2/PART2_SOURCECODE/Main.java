public class Main {

    public static void main(String[] args) {


        int [][] data1= {{1,2,3,4,5,6},
                         {7,8,9,10,11,12},
                         {13,14,15,16,17,18},
                         {19,20,21,22,23,24},
                         {25,26,27,28,29,30}
                         };

        Iterator_SpirallyClockWise gokturk_data_iterator = new Iterator_SpirallyClockWise(data1);

        System.out.println("Printing Satellite data Spirally");

        while(gokturk_data_iterator.hasNext()){

            System.out.print(gokturk_data_iterator.next()+", ");
        }

        int [][] data2= { {1,2,3},
                          {4,5,6},
                          {7,8,9},
                          {10,11,12}
                        };

        gokturk_data_iterator= new Iterator_SpirallyClockWise(data2);

        System.out.println("\nPrinting another Satellite data Spirally");

        while(gokturk_data_iterator.hasNext()){

            System.out.print(gokturk_data_iterator.next()+", ");
        }


        int [][] data3= { {1},
                          {4}
                         };

        gokturk_data_iterator= new Iterator_SpirallyClockWise(data3);

        System.out.println("\nPrinting another Satellite data Spirally");

        while(gokturk_data_iterator.hasNext()){

            System.out.print(gokturk_data_iterator.next()+", ");
        }


        int [][] data4= { {1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}
                        };

        gokturk_data_iterator= new Iterator_SpirallyClockWise(data4);

        System.out.println("\nPrinting another Satellite data Spirally");

        while(gokturk_data_iterator.hasNext()){

            System.out.print(gokturk_data_iterator.next()+", ");
        }


    }
}
