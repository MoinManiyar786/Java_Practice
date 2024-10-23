import java.util.Scanner;
public class Chec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any character: ");
        char a = input.next().charAt(0);
        if (a >= 'a' && a <='z') System.out.println(a + "is the lowerCase character ");
        else if(a >= 'A' && a <= 'Z') System.out.println(a + "is the UpperCase character");
        else System.out.println(a + "neither uppercase or noe lowercase ");
        input.close();
    }
}
