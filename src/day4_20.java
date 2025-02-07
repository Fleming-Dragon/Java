public class day4_20 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello ");

        sb.append("Ved Mahajan");

        System.out.println(sb);

        sb.insert(0,"Good Mornig ");

        System.out.println(sb);

        sb.replace(1,3,"VEdrrrr");

        System.out.println(sb);

        sb.reverse();

        System.out.println(sb);

        sb.reverse();

        sb.delete(1,7);

        System.out.println(sb);
    }
}
