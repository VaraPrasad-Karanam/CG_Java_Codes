import java.util.Scanner;
public class Traffic {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char symbol = sc.next().charAt(0);
        String action;
        switch(symbol){
            case 'R':
                action = "Stop";
                break;
            case 'Y':
                action = "Get Ready";
                break;
            case 'G':
                action = "Go";
                break;
            default:
                action = "Invalid Symbol";
        }
        System.out.println("Action for symbol " + symbol + " is: " + action);
    }
}
