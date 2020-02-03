package str;

import java.util.Scanner;

public class DecimalToOthers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int decimal = input.nextInt();
        String binary = Integer.toBinaryString(decimal);
        String hexaDecimal = Integer.toHexString(decimal);
        String octal = Integer.toOctalString(decimal);

        System.out.println(binary);
        System.out.println(hexaDecimal);
        System.out.println(octal);

    }
}
