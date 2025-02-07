public class day4_3 {
    public static void main(String[] args) {

        language l1 = new language();
        l1.basicFeatures();

        Clang c1 = new Clang();
        c1.Basicfeatures();

        CPP p1 = new CPP();
        p1.Basicfeature();

        Java j1 = new Java();
        j1.Basicfeature();


    }
}
class language
{
    public void basicFeatures()
    {

    }
}
class Clang extends language
{
    public void Basicfeatures()
    {
        System.out.println("\nThis is C language \n It has loops if else variables functions");
    }
}
class CPP extends Clang
{
    public void Basicfeature()
    {
        System.out.println("\nThis is CPP language \n It has loops if else variables functions \n It adds extrafeatures like class object and oop concepts");
    }
}

class Java extends CPP
{
    public void Basicfeature()
    {
        System.out.println("\nThis is Java language \n It has loops if else variables functions \n It adds extrafeatures like class object and oop concepts \n making pure object oriented language \n robust features and built in libraires");
    }
}

