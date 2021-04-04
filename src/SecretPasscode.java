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
        while(userSel<=0 || userSel>5) {
            System.out.println("  Invalid option. Please try again.\n");
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

        //Creates Filewriter and BufferedWriter to work with
        FileWriter fileWriter = new FileWriter("passfile.txt");
        BufferedWriter out = new BufferedWriter(fileWriter);

        //User Selection #1 (Lowercase Only)
        if(userSel==1) {
            for (int pass = 1; pass <= passLength; pass++) {
                int random = (int)(Math.random() * 26 + 97);
                out.write((char)random);
                //Debugging
                if(random == 97) {
                    Process proc = Runtime.getRuntime().exec("notify-send '97 Spotted!'");
                    System.out.println("\n\n\n" + "97 Spotted at Test No. " + pass + "\n\n\n");
                }
                if(random == 122) {
                    Process proc = Runtime.getRuntime().exec("notify-send '122 Spotted!'");
                    System.out.println("\n\n\n" + "122 Spotted at Test No. " + pass + "\n\n\n");
                }
            }
        }

        //User Selection #2 (Uppercase Only)
        if(userSel==2) {
            for (int pass = 1; pass <= passLength; pass++) {
                int random = (int)(Math.random() * 26 + 65);
                out.write((char)random);
                //Debugging
                if(random == 65) {
                    Process proc = Runtime.getRuntime().exec("notify-send '65 Spotted!'");
                    System.out.println("\n\n\n" + "65 Spotted at Test No. " + pass + "\n\n\n");
                }
                if(random == 90) {
                    Process proc = Runtime.getRuntime().exec("notify-send '90 Spotted!'");
                    System.out.println("\n\n\n" + "90 Spotted at Test No. " + pass + "\n\n\n");
                }
            }
        }

        //User Selection #3 (Both Uppercase & Lowercase)
        if(userSel==3) {
            for (int pass = 1; pass <= passLength; pass++) {
                //int random = (int)(Math.random() * 57 + 65);
                int random = (int)(Math.random() * 59 + 65);
                if(random >= 65 && random <= 90) {
                    out.write((char)random);
                    pass++;
                }
                if(random >= 97 && random <= 122) {
                    out.write((char)random);
                    pass++;
                }
                pass--;
                //Debugging
                if(random == 65) {
                    Process proc = Runtime.getRuntime().exec("notify-send '65 Spotted!'");
                    System.out.println("\n\n\n" + "65 Spotted at Test No. " + pass + "\n\n\n");
                }
                if(random == 122) {
                    Process proc = Runtime.getRuntime().exec("notify-send '122 Spotted!'");
                    System.out.println("\n\n\n" + "122 Spotted at Test No. " + pass + "\n\n\n");
                }
            }
        }

        //Numerical Only
        if(userSel==4) {
            for (int pass = 1; pass <= passLength; pass++) {
                int random = (int)(Math.random() * 10 + 48);
                out.write((char)random);
                //Debugging
                if(random == 48) {
                    Process proc = Runtime.getRuntime().exec("notify-send '48 Spotted!'");
                    System.out.println("\n\n\n" + "48 Spotted at Test No. " + pass + "\n\n\n");
                }
                if(random == 57) {
                    Process proc = Runtime.getRuntime().exec("notify-send '57 Spotted!'");
                    System.out.println("\n\n\n" + "57 Spotted at Test No. " + pass + "\n\n\n");
                }
            }
        }

        //Flushes both BufferedWriter and FileWriter so that changes can be implemented and read
        out.flush();
        fileWriter.flush();

        //End User Prompt of Passcode Generated
        System.out.println("Here is your randomly generated code:");
        File myObj = new File("passfile.txt");
        //Lines of code that interpret the file passfile.txt
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            System.out.println(data);
        }
        myReader.close();
    }
}
//Todo: find if 1-4 is working
//1 Works for sure
//2 Works for sure
//3 Works for sure
//4 Works for sure