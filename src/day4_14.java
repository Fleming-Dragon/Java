public class day4_14 {
    public static void main(String[] args) {
        Student12 s1 = new Student12("Ved" , 12);
        System.out.println(s1.toString());

        Student12[] s2 = new Student12[2];
        s2[0] = new Student12("Ved" , 100);
        s2[1] = new Student12("Dev" , 300);
//        s2[2] = new Student12("Ryan" , 200);


        for (Student12 i: s2
             ) {
            System.out.println(i.toString());
        }
    }
}

class Student12
{
    String name;
    int marks;

    Student12( String name , int marks)
    {
        this.name = name;
        this.marks = marks;
    }

    public String toString()
    {
        return name+" "+marks;
    }

}

