public class day4_13 {
    public static void main(String[] args) {

        StudentAr arr[] = new StudentAr[5];

        arr[0] = new StudentAr(12 , "Ved" , "Comp");
        arr[1] = new StudentAr(13 , "Dev" , "IT");
        arr[2] = new StudentAr(14 , "Raj" , "AIDS");
        arr[3] = new StudentAr(15 , "Pakkya" , "Comp");
        arr[4] = new StudentAr(16 , "Ryan" , "ENTC");

        for (StudentAr i : arr) {
            i.display();
        }

    }
}

class StudentAr {
    int roll;
    String name;
    String dept;


    StudentAr(int roll , String name , String dept)
    {
        this.roll = roll;
        this.name = name;
        this.dept = dept;
    }

    public void display()
    {
        System.out.println("Roll : "+ roll);
        System.out.println("Name : "+ name);
        System.out.println("Department : "+ dept);
    }
}
