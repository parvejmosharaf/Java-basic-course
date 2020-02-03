package str;

public class PrimitiveToString {
    public static void main(String[] args) {
        double x = 100.8;
        String s = Double.toString(x);
        System.out.println(s);


        boolean b = true;
        String s1 = Boolean.toString(b);
        System.out.println(s1);


        //String to primitive data

        String str = "32";

        int i = Integer.parseInt(str);
        System.out.println(i);

        String sd = "55.5";
        double d = Double.parseDouble(sd);
        System.out.println(d);


        String myStr = "11";
        int num = Integer.valueOf(myStr);
        System.out.println(num);

    }
}
