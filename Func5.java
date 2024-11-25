import java.util.Scanner;
public class Func5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 10;
        int b = 20;
        int result = sum(a, b);
        System.out.println(result);
    }
    public static int sum(int a, int b){
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        int sum = a + b;
        return sum;
    }
}
