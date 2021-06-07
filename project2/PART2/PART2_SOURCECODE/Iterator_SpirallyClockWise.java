import java.util.Iterator;

public class Iterator_SpirallyClockWise implements Iterator {

    int[][] satellite_data;
    int layer=0;
    int position_x=0;
    int position_y=0;

    int travelled=0;

    boolean layer_finished=false;

    public Iterator_SpirallyClockWise(int[][] satellite_data){

        this.satellite_data= satellite_data;
    }

    public Object next(){

        int temp= satellite_data[position_x][position_y];

        travelled+=1;

        if( position_x==layer && (satellite_data[0].length-layer)!= (position_y+1) && layer_finished==false){

            position_y= position_y+1;

        }

        else if((satellite_data[0].length -layer) == (position_y+1) && (position_x+1)!= (satellite_data.length-layer)){

            position_x+=1;
        }

        else if(position_y==layer && ((position_x-1)!=layer) ){

            position_x-=1;

            layer_finished=true;
        }

        else if(((position_x+1)== (satellite_data.length-layer) ) && position_y!=layer ){

            position_y-=1;

        }

        else if((position_x-1)==layer && position_y==layer){
            layer+=1;

            position_x=layer;
            position_y=layer;

            layer_finished=false;

        }
        return temp;

    }

    public boolean hasNext(){

        if(travelled< (satellite_data.length* satellite_data[0].length)  ){
            return true;
        }
        else{
            return false;
        }
    }
}
