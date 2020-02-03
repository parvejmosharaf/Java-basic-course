package str;

public class SBuffer1 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Parvej");

        System.out.println(sb);

        sb.append(" Mosharaf");
        sb.append(24);
        System.out.println(sb);

        sb.delete(3,6);
        System.out.println(sb);

        sb.setLength(5);
        System.out.println(sb);
    }
}
