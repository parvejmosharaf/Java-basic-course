package str;

public class Demo3 {
    public static void main(String[] args) {
        String country = "Bangladesh is my country";

        System.out.println(country);
        char ch = country.charAt(0);
        System.out.println(ch);

        int value = country.codePointAt(0);//ascci value
        System.out.println(value);

        int pos = country.indexOf('n');
        System.out.println(pos);

        pos = country.lastIndexOf("n");
        System.out.println(pos);

    }
}
