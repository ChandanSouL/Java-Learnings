import java.util.*;

public class Main {
    public static void main(String args[]){
        //coutry(key),population(value)int
        HashMap<String, Integer> map = new HashMap<>();
        //Insertion
        map.put("India", 120);
        map.put("US", 30);
        map.put("China",150);

       // System.out.println(map);

        //update
        map.put("China",180);
        System.out.println(map);

        //search
        if(map.containsKey("China")){
            System.out.println("key is present in map");
        }
        else{
            System.out.println("key is not in map");
        }

        System.out.println(map.get("China"));

        //iterations
        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.print(e.getKey()+" ");
            System.out.print(e.getValue());
            System.out.println();
        }
        //remove
        //map.remove("China");
        //System.out.println(map);


    }
}
