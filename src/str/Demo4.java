package str;

public class Demo4 {
    public static void main(String[] args) {
        String str1 = "+880-017-44473405";
        System.out.println(str1);

        String[] s3 = str1.split("-");
        for(String x: s3)
            System.out.println(x);



    }
}
