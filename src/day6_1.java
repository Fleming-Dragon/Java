import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class day6_1 {
    public static void main(String[] args) {


        LinkedList<String> Students = new LinkedList<>();
        Students.add("Ved");
        Students.add("Pakkya");
        Students.add("Raj");
        Students.addFirst("Ryan");
        Students.addLast("Dev");


        System.out.println(Students);

        Students.removeFirst();

        Students.removeLast();

        System.out.println(Students);

        List<String> sublist = Students.subList(0,2);

        System.out.println(sublist);


        System.out.println(Students.subList(1,2));

        Iterator<String> iterator = Students.iterator();
        while(iterator.hasNext())
            System.out.println(iterator.next());

    }
}
