package str;

public class BinaryOctal {
    public static void main(String[] args) {
        String binary = "1010";
        Integer decimal = Integer.parseInt(binary, 2);
        System.out.println(decimal);

        String octal = "20";
        Integer d = Integer.parseInt(octal, 8);
        System.out.println(d);

        String hexa = "F";
        Integer hToD = Integer.parseInt(hexa, 16);
        System.out.println(hToD);
    }
}
