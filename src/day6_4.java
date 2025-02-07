import java.util.HashSet;

public class day6_4 {
    public static void main(String[] args) {


        HashSet<String> set = new HashSet<>();

        set.add("Java");
        set.add("Python");
        set.add("Javascript");
        set.add("null");
        set.add(null);

        System.out.println(set);

        for (String lang: set
             ) {
            System.out.print(lang + " ");
        }
    }
}
