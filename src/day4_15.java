public class day4_15 {
    public static void main(String[] args) {
        Student13 s1 = new Student13("Ved" , 12);

        Student13[] s2 = new Student13[2];
        s2[0] = new Student13("Ved" , 100);
        s2[1] = new Student13("Dev" , 300);
//        s2[2] = new Student12("Ryan" , 200);

    }
}

class Student13
{
    String name;
    int marks;

    Student13( String name , int marks)
    {
        this.name = name;
        this.marks = marks;
        System.out.println(name + "" + marks);
    }



}

