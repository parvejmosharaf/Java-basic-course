package str;

public class SBuilder {
    public static void main(String[] args) {

        StringBuilder str1 = new StringBuilder("dam");

        System.out.println("str =" + str1);
        str1.append("max");
        str1.append(20);
        str1.append(20.25);
        System.out.println(str1);

        str1.reverse();
        System.out.println(str1);
        str1.delete(3,9);
        System.out.println(str1);
    }
}
