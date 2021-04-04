import java.util.Scanner;

public class SecretPasscode {
    public static Scanner prompt = new Scanner(System.in);

    public static void main(String[] args) {
        //Password Generator menu
        System.out.println("                Password Generator Menu               ");
        System.out.println("******************************************************");
        System.out.println("*   [1] Lowercase Letters                            *");
        System.out.println("*   [2] Uppercase Letters                            *");
        System.out.println("*   [3] Mix (Both Uppercase & Lowercase)             *");
        System.out.println("*   [4] Numerical                                    *");
        System.out.println("*   [5] Quit                                         *");
        System.out.println("******************************************************");
        //User's selection
        System.out.print("Enter Selection (1-5): ");
        int userSel = prompt.nextInt();
        //Password Length
        System.out.print("Password Length (6 or more): ");
        int passLength = prompt.nextInt();
        System.out.println("\nThank you for using the Pass Code Generator.\n");

        System.out.println("Here are your randomly generated codes:");
        System.out.print("Lol I'm not done, here is userSel: ");
        int userSel = prompt.nextInt();
        System.out.println(userSel);
        System.out.print("and passLength");
        int passLength = prompt.nextInt();
        System.out.println(passLength);
        //System.console();
    }
}
//Notes:
//1.) Find out if you need to make multiple generated passwords
//2.) Find out how to even make randomly generated passcodes
//3.) Find out what is the syntax bullshit you need to learn to make the program exit code 0
//4.) Print the outputs of userSel and passLength to a file to be read from again.