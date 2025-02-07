import java.util.LinkedList;

class Student2
{
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    Student2(String name ,int age)
    {
        this.name = name;
        this.age = age;
    }

    public String toString()
    {
        return "Student1{name = " + name + ",age = "+age +"}";
    }
}


public class day6_2 {
    public static void main(String[] args) {


        LinkedList<Student2> student2s = new LinkedList<>();

        student2s.add(new Student2("Ved", 21));
        student2s.add(new Student2("Dev", 20));
        student2s.add(new Student2("Raj", 19));
        student2s.add(new Student2("Pakkya", 14));
        student2s.add(new Student2("Raju", 18));

        for (Student2 s1: student2s
             ) {
            System.out.println(s1);
        }
        student2s.set(2,new Student2("Prakash" , 48));

        for (Student2 s1: student2s
        ) {
            System.out.println(s1);
        }


    }
}
