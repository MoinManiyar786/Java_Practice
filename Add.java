import java.util.Scanner;

public class Add{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in
        int a,b,c;
        a = input.nextInt();
        b = input.nextInt();
        c = a + b;
        System.out.println("The addition is " + c);
        input.close();
    }
}
