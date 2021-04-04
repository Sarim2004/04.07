import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SecretPasscode {
    public static Scanner prompt = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
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
        if(userSel==5) {
            System.out.println("Quitting...");
            System.exit(1);
        }
        while(userSel<0 || userSel>5) {
            System.out.println("Invalid option. Please try again.\n");
            System.out.print("Enter Selection (1-5): ");
            userSel = prompt.nextInt();
            if(userSel==5) {
                System.out.println("Quitting...");
                System.exit(1);
            }
        }

        //Password Length
        System.out.print("Password Length (6 or more): ");
        int passLength = prompt.nextInt();
        while(passLength < 6) {
            System.out.println("  Password length too short. Please try again.");
            System.out.print("Password Length (6 or more): ");
            passLength = prompt.nextInt();
        }
        System.out.println("\nThank you for using the Pass Code Generator.\n");

        FileWriter fileWriter = new FileWriter("passfile.txt");
        BufferedWriter out = new BufferedWriter(fileWriter);

        if(userSel==1) {

        }

        if(userSel==2) {

        }

        if(userSel==3) {

        }

        if(userSel==4) {
            for (int password = 1; password <= passLength; password++) {
                int randnum = (int) (Math.random() * 10);
                if (randnum <= 0) {
                    out.write("0");
                } else if (randnum <= 1) {
                    out.write("1");
                } else if (randnum <= 2) {
                    out.write("2");
                } else if (randnum <= 3) {
                    out.write("3");
                } else if (randnum <= 4) {
                    out.write("4");
                } else if (randnum <= 5) {
                    out.write("5");
                } else if (randnum <= 6) {
                    out.write("6");
                } else if (randnum <= 7) {
                    out.write("7");
                } else if (randnum <= 8) {
                    out.write("8");
                } else if (randnum <= 9) {
                    out.write("9");
                }
            }
        }
        out.flush();
        fileWriter.flush();



        System.out.println("Here are your randomly generated codes:");
        File myObj = new File("passfile.txt");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            System.out.println(data);
        }
        myReader.close();
    }
}
//Notes:
//1.) Find out if you need to make multiple generated passwords
//2.) Find out how to even make randomly generated passcodes
//3.) Find out what is the syntax bullshit you need to learn to make the program exit code 0
//4.) Print the outputs of userSel and passLength to a file to be read from again.