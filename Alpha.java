import java.util.Scanner;
public class Alpha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Radius of circle: ");
        float r = input.nextFloat();
         Double cir = (2*3.14) *r;
        System.out.println("The circumference of circle is: " + cir);
    }
}
