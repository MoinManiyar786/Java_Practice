import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("------------------------ Game Starting Screen ---------------------------------------------");
        System.out.println("Start the game");
        System.out.println("Load the game");
        System.out.println("Exit the game");
        String str = input.next();
        switch(str){
            case "enter" :
                System.out.println("Game is Starting");
                break;
            case "load" :
                System.out.println("Loading the game");
                break;
            case "exit" :
                System.out.println("Quit the game");
                break;
            default:
                System.out.println("Please select the valid options");
        }
    }
}
