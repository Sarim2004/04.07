import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class testing {
    public static Scanner prompt = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        System.out.println("Hello. Here is a test for ya!");
        //small scale version that finds 0 & ten from the data to see if it's calibrated
        /**
         for (int i = 0; i <= 1000; i++) {
         System.out.print("Test No. " + i + ": ");
         int random = (int) (Math.random() * 10 + 1);
         System.out.println(random);
         if (random == 0) {
         Process proc = Runtime.getRuntime().exec("notify-send '0 Spotted!'");
         System.out.println("\n\n\n" + "Zero Spotted at Test No. " + i + "\n\n\n");
         }
         if (random == 10) {
         Process proc = Runtime.getRuntime().exec("notify-send '26 Spotted!'");
         System.out.println("\n\n\n" + "Twenty-Six Spotted at Test No. " + i + "\n\n\n");
         }
         }
         */

        //The FileWriter and BufferedWriter testing that helped in ForkedofSecretPasscode.java
        /**
         FileWriter fileWriter = new FileWriter("passfile.txt");
         BufferedWriter out = new BufferedWriter(fileWriter);
         for (int password = 1; password <= 100; password++) {
         int randnum = (int) (Math.random() * 10);
         if (randnum <= 0) {
         out.write("0");
         Process proc = Runtime.getRuntime().exec("notify-send '0 Spotted!'");
         } else if (randnum <= 1) {
         out.write("1");
         Process proc = Runtime.getRuntime().exec("notify-send '1 Spotted!'");
         } else if (randnum <= 2) {
         out.write("2");
         Process proc = Runtime.getRuntime().exec("notify-send '2 Spotted!'");
         } else if (randnum <= 3) {
         out.write("3");
         Process proc = Runtime.getRuntime().exec("notify-send '3 Spotted!'");
         } else if (randnum <= 4) {
         out.write("4");
         Process proc = Runtime.getRuntime().exec("notify-send '4 Spotted!'");
         } else if (randnum <= 5) {
         out.write("5");
         Process proc = Runtime.getRuntime().exec("notify-send '5 Spotted!'");
         } else if (randnum <= 6) {
         out.write("6");
         Process proc = Runtime.getRuntime().exec("notify-send '6 Spotted!'");
         } else if (randnum <= 7) {
         out.write("7");
         Process proc = Runtime.getRuntime().exec("notify-send '7 Spotted!'");
         } else if (randnum <= 8) {
         out.write("8");
         Process proc = Runtime.getRuntime().exec("notify-send '8 Spotted!'");
         } else if (randnum <= 9) {
         out.write("9");
         Process proc = Runtime.getRuntime().exec("notify-send '9 Spotted!'");
         }
         }
         out.flush();
         out.close();
         fileWriter.flush();
         fileWriter.close();
         */
        //Note: remove .close(); when actually using these above lines of code ^

        //Some cool code that lists all the ascii values a-z (lowercase)
        /**
        for (int i = 97; i <= 122; i++) { //Use Typecasting to get ASCII value
            char ch = (char)i;
            System.out.println(ch);
        }
         */


        //See ascii characters printed from A-Z & a-z

        /**
        //Uppercase Characters
        char C;  //Character Variable Declaration
        for(int i=65;i<=90;i++) //Loop for printing A to Z character
        {
            C =(char)i; //Converting ASCII value to Character
            System.out.println(i+"  =  "+C); //Displaying ASCII value and its equivalent Character
        }

        System.out.println("\n\n\n");

        //Lowercase Characters
        char c;  //Character Variable Declaration
        for(int i=97;i<=122;i++) //Loop for printing A to Z character
        {
            c =(char)i; //Converting ASCII value to Character
            System.out.println(i+"  =  "+c); //Displaying ASCII value and its equivalent Character
        }
         */
        char test = 97;
        System.out.println(test);
    }
}