import java.util.Scanner;
public class Data {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the data accordingly: ");
        int i = input.nextInt();
        float f = input.nextFloat();
        double d = input.nextDouble();
        long l = input.nextLong();
        byte b = input.nextByte();
        boolean bl = input.nextBoolean();
        String st = input.nextLine();
        char ch = input.next().charAt(0);

        System.out.println("The Integer value is: " + i);
        System.out.println("The Float value is: " + f);
        System.out.println("The Double value is: " + d);
        System.out.println("The Long value is: " + l);
        System.out.println("The Byte value is: " + b);
        System.out.println("The Boolean value is: " + bl);
        System.out.println("The String value is: " + st);
        System.out.println("The Character value is: " + ch);




    }
}
