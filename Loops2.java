import java.util.Scanner;
public class Loops2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        for(int i =1;i<=100;i++){
            if(i%2==0){
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println("all the numbers " + sum);
    }
}
