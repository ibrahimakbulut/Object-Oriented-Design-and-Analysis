import java.util.ArrayList;

public class Case_waterproofUpto1m implements Case{

    ArrayList<String> properties;

    public Case_waterproofUpto1m(ArrayList<String> case_poperties){

        properties=new ArrayList<String>();

        for(int i=0;i<case_poperties.size();++i){

            properties.add(case_poperties.get(i));
        }
    }

    public String toString(){

        String temp= "Case: ";

        for(int i=0; i<properties.size();++i){

            temp=temp + properties.get(i) + ", ";
        }
        temp+= "Waterproof up to 1m";

        return temp;

    }
    public void functiondump(){
        return;
    }
}
