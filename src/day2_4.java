public class day2_4 {
    public static void main(String[] args) {
        day2_4 a1 = new day2_4();
        day2_4 a2 = new day2_4(45);
    }

    day2_4()
    {
        System.out.println("This is default constructor ");
    }

    day2_4(int n )
    {
        System.out.println("This is Parameterized constructor");
    }
}
