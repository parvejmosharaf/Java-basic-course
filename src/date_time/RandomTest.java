package date_time;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        Random r = new Random();
        int randomNumber = r.nextInt(10) +1; //0 - 9

        int rNumber =10 + (int) (Math.random() * 100);
        System.out.println(randomNumber);
        System.out.println(rNumber);
        for (int i = 0; i < 91; i++) {
            System.out.println(rNumber);
        }

    }
}
