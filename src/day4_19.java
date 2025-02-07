public class day4_19 {
    public static void main(String[] args) {
        String name = "    Ved     Mahajan";
        System.out.println(name);
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        System.out.println(name.trim());

        System.out.println(name.endsWith(" Mahajan"));

        System.out.println(name.charAt(13));
        System.out.println(name.indexOf('a'));

        System.out.println(name.replace("Ved" , "Dev"));

        System.out.println(name.charAt(name.length() -1));
    }
}
