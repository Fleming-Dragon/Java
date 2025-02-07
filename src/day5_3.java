interface Calculation
{
    int Fact(int a);

}
public class day5_3 {

    public static void main(String[] args) {
        Calculation c1 = (a) -> {
            int result = 1 ;
//            for(int i = 1; i <= a ; i++)
//            {
//                result = i*result;
//            }
//            return result;
            int num = a;
            while(num > 0)
            {
                result = result*num;
                num--;
            }
            return result;
        };

        Calculation c2 = (a) -> {
            return (a);
        };

        System.out.println(c1.Fact(5));
    }
}
