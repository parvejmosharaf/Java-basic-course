package str;

public class StringDemo1 {
    public static void main(String[] args) {
        String s1 = "Parvej Mosharaf";
        String s2 = new String("");

        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);

        System.out.println("Length is: " + s1.length());

        if(s1.equals(s2))
            System.out.println("Equals.");
        else
            System.out.println("not Equals.");

        if(s1.equalsIgnoreCase(s2))
            System.out.println("Equals case");
        else
            System.out.println("not equals case");

        if(s1.contains(s2))
            System.out.println("it's contain a name.");
        else
            System.out.println("not contain.");

        boolean empty = s2.isEmpty();
        System.out.println(empty);
        System.out.println(s1.isEmpty());


    }
}
