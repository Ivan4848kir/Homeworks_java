import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        String word, stopword = "stop";
        while (true) {
            Scanner reader = new Scanner(System.in);
            try {
                double num1, num2, res;
                char operator;
                //Scanner reader = new Scanner(System.in);
                System.out.print("Enter two numbers: ");
                num1 = reader.nextDouble();
                num2 = reader.nextDouble();
                if (num2 != 0) {
                    System.out.print("\nEnter an operator (+, -, *, /): ");
                    operator = reader.next().charAt(0);
                    switch (operator) {
                        case '+':
                            res = num1 + num2;
                            break;
                        case '-':
                            res = num1 - num2;
                            break;
                        case '*':
                            res = num1 * num2;
                            break;
                        case '/':
                            res = num1 / num2;
                            break;
                        default:
                            System.out.printf("Incorrect operator");
                            return;
                    }
                } else {
                    System.out.print("\nEnter an operator (+, -, *): ");
                    operator = reader.next().charAt(0);
                    switch (operator) {
                        case '+':
                            res = num1 + num2;
                            break;
                        case '-':
                            res = num1 - num2;
                            break;
                        case '*':
                            res = num1 * num2;
                            break;
                        default:
                            System.out.printf("Incorrect operator");
                            return;
                    }

                }
                System.out.println("Result: " + num1 + " " + operator + " " + num2 + " = " + res);
            }
            catch (Exception ex) {
                if (reader.hasNext()) {
                    word = reader.next();
                    if (word.equals(stopword)){
                        System.out.println("Program has been stopped");
                        System.exit(0);
                    }
                }
                System.out.println("Incorrect enter");
            }
        }
    }
}