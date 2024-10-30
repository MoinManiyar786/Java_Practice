import java.util.Scanner;
public class Swi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the operation ");
        String str = input.next();
        switch(str){
            case "+":
                int a = input.nextInt();
                int b = input.nextInt();
                int c = a+b;
                System.out.println("The addition of two number is : " + c);
                break;
            case "-":
                int d = input.nextInt();
                int e = input.nextInt();
                int f = d-e;
                System.out.println("The addition of two number is : " + f);
                break;
            case "*":
                int g = input.nextInt();
                int h = input.nextInt();
                int i = g*h;
                System.out.println("The addition of two number is : " + i);
                break;
            case "/":
                int j = input.nextInt();
                int k = input.nextInt();
                int l = j/k;
                System.out.println("The addition of two number is : " + l);
                break;
            case "%":
                int m = input.nextInt();
                int n = input.nextInt();
                int o = m%n;
                System.out.println("The addition of two number is : " + o);
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
