import java.util.Scanner;
public class Salary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the salary: ");
        int salary = input.nextInt();
        if(salary >= 10000) salary = salary + 2000;
        else if(salary >= 20000){
            salary = salary + 3000;
        }
        else{
            salary = salary + 1000;
        }
        System.out.println("The current salary is "+ salary);
        input.close();
    }
}
