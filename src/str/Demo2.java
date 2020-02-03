package str;

public class Demo2 {
    public static void main(String[] args) {
        String firstName = "Parvej";
        String lastName = " Mosharaf";

        String fullName = firstName + lastName;
        System.out.println(fullName);

        System.out.println("full name is (upper case): " + fullName.toUpperCase());
        System.out.println("full name is (lower case): " + fullName.toLowerCase());
        System.out.println("Start with: " + firstName.startsWith("P"));
        System.out.println("End with: " + firstName.endsWith("j"));

        String[] names = {"pax", "max", "alex", "bob"};

        for(String count : names){
            System.out.println(count);
        }

        for (int i = 0; i <names.length ; i++) {
            System.out.println(names[i]);

        }

    }
}
