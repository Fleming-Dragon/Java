import javax.sound.midi.Soundbank;

interface one
{
    default void print()
    {
        System.out.println("Hello this is a default");
    }
}
interface two extends one
{
    void display(String msg);
}


public class day5_4 implements two{
    public void display(String msg)
    {
        System.out.println(msg);
    }

    public static void main(String[] args) {


        day5_4 f1 = new day5_4();
        f1.display("Ved");
        f1.print();
    }
}
