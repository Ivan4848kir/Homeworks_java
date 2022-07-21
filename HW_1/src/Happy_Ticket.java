import java.util.Scanner;

public class Happy_Ticket {
    public static void main(String args[]) {
        System.out.println("Enter the number of your ticket");
        while (true) {
            try {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            String ticket_number = Integer.toString(num);
            if (ticket_number.length() != 6) {
                System.out.println("Incorrect number");
            } else {
                int a_1 = num / 100000,
                        a_2 = num % 100000 / 10000,
                        a_3 = num % 100000 % 10000 / 1000,
                        a_4 = num % 100000 % 10000 % 1000 / 100,
                        a_5 = num % 100000 % 10000 % 1000 % 100 / 10,
                        a_6 = num % 100000 % 10000 % 1000 % 100 % 10;
                if ((a_1 + a_2 + a_3) == (a_4 + a_5 + a_6)) {
                    System.out.println("You ripped off the happy ticket!!!");
                } else {
                    System.out.println("No luck, try again");
                }
                }
            }
            catch (Exception ex) {System.out.println("Incorrect value!");}
        }
    }
}
