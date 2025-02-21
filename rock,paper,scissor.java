import java.util.*;
class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Player one, enter your choice upto (0-9)digits:");
        String str1 = sc.nextLine();
        System.out.println("Player one, enter secret bit position:");
        int one_play_secret_bit = sc.nextInt();
        
        sc.nextLine();
        
        System.out.println("Player two, enter your choice upto (0-9)digits:");
        String str2 = sc.nextLine();
        System.out.println("Player two, enter secret bit position:");
        int two_play_secret_bit = sc.nextInt();
        
        int p1_choice = getnumber(str1, one_play_secret_bit);
        String p1_step = tonumber(p1_choice);
        int p2_choice = getnumber2(str2, two_play_secret_bit);
        String p2_step = tonumber2(p2_choice);
        
        System.out.println("Player 1 choose: " + p1_step);
        System.out.println("Player 2 choose: " + p2_step);
        
        String result = Result(p1_choice, p2_choice);
        System.out.println(result);
    }
    public static int getnumber(String str1, int one_play_secret_bit) {
        char digit = str1.charAt(one_play_secret_bit);
        return Character.getNumericValue(digit) % 3;
    }
    public static int getnumber2(String str2, int two_play_secret_bit) {
        char digit = str2.charAt(two_play_secret_bit);
        return Character.getNumericValue(digit) % 3;
    }
    public static String tonumber(int p1_choice) {
        switch (p1_choice) {
            case 0:
                return "Rock";
            case 1:
                return "Paper";
            case 2:
                return "Scissors";
            default:
                return "Invalid";
        }
    }
    public static String tonumber2(int p2_choice) {
        switch (p2_choice) {
            case 0:
                return "Rock";
            case 1:
                return "Paper";
            case 2:
                return "Scissors";
            default:
                return "Invalid";
        }
    }
    public static String Result(int p1_choice, int p2_choice) {
        if (p1_choice == p2_choice) {
            return "It's a tie!";
        }
        if ((p1_choice == 0 && p2_choice == 2) ||
            (p1_choice == 1 && p2_choice == 0) ||
            (p1_choice == 2 && p2_choice == 1)) {
            return "Player 1 wins!";
        } else {
            return "Player 2 wins!";
        }
    }
}
