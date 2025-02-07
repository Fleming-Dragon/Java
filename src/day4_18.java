public class day4_18 {
    public static void main(String[] args) {
        String name = "Fleming DDragon";


        boolean val = name.contains("D");

        System.out.println(val);

        val = name.contains("Dragon");

        System.out.println("" + val);

        String str1 = "Ved ";
        String str2 = "Mahajan" ;
        String str3 = str1.concat(str2);

        System.out.println(str3);


        String str4 =  "Ved Mahajan";
        boolean  val2 = str4.equals(str3);

        System.out.println(val2);
    }
}
