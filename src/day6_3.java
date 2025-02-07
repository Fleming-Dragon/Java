import java.util.HashMap;
import java.util.Iterator;

public class day6_3 {
    public static void main(String[] args) {
        HashMap<Integer , String> map = new HashMap<>();

        map.put(1, "Ved");
        map.put(2, "Raju");
        map.put(3, "Pakya");
        map.put(4, "Raj");
        map.put(5, "DEv");

//        Iterator <String > iterator = map.iterator();
//        while (iterator.hasNext())
//        System.out.println(iterator.next());

        String Value = map.get(3);
        System.out.println("Value of 3 ="+ Value);


        System.out.println("Value of 2 ="+ map.get(2));

        map.remove(2 );

        System.out.println(map);


        System.out.println("The size of the map is " +map.size());

        HashMap<String ,String> Fruit = new HashMap<>();

        Fruit.put("Apple ", "Red");
        Fruit.put(null ,"Pink" );
        Fruit.put("Mango" , "Yellow");
        Fruit.put("Orange" , "Orange");
        Fruit.put("Watermelon" , null);

        System.out.println(Fruit);

    }
}
