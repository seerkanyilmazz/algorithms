package hashMapTest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest extends DifferentTypesDTO {
    public HashMapTest(int key, String message, Date time, int count, int version) {
        super(key, message, time, count, version);
    }

    public static void main(String [] args){
        Map<Integer,DifferentTypesDTO> map = new HashMap<Integer, DifferentTypesDTO>();

        DifferentTypesDTO d1= new DifferentTypesDTO(1,"hi"    , new Date(),1,1);
        DifferentTypesDTO d2= new DifferentTypesDTO(2,"this"  , new Date(),2,1);
        DifferentTypesDTO d3= new DifferentTypesDTO(3,"is"    , new Date(),3,1);
        DifferentTypesDTO d4= new DifferentTypesDTO(4,"mytest", new Date(),4,1);

        map.put(d1.getKey(), d1);
        map.put(d2.getKey(), d2);
        map.put(d3.getKey(), d3);
        map.put(d4.getKey(), d4);

        Set<Integer> keySet= map.keySet();
        for(int i:keySet){
            System.out.println(map.get(i));
        }
    }
}
