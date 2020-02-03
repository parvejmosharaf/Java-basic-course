package str;

public class WrapperClassUse {
    public static void main(String[] args) {
        //auto boxing
        //primitive -> object

        int x = 30;
        Integer y = Integer.valueOf(x);
        System.out.println("y = " + y);

        Integer z = x; //Integer.valueOf(x)... compiler automatically do the auto boxing
        System.out.println("z = " + z);


        //object -> primitive data type

        Double d = new Double(10.5);
        System.out.println("d = " + d);

        double e = d.doubleValue();
        System.out.println(e);
    }
}
