import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int operation;
        double num1, num2, result;

        Scanner input = new Scanner(System.in);

        System.out.print("Input first number: ");
        num1 = input.nextDouble();

        System.out.print("Input second number: ");
        num2 = input.nextDouble();

        System.out.println("Select the transaction that you want: \n1-Addition\n2-Subtraction\n3-Multiplication\n4-Division");
        System.out.print("Your choice: ");
        operation = input.nextInt();

        switch(operation) {
            case 1:
                result = num1 + num2;
                System.out.println("RESULT: " + result);
                break;

            case 2:
                result = num1 - num2;
                System.out.println("RESULT: " + result);
                break;

            case 3:
                result = num1 * num2;
                System.out.println("RESULT: " + result);
                break;
            case 4:
                if(num2 != 0) {
                    result = num1 / num2;
                    System.out.println("RESULT: " + Math.round(result * 100d) /100d);
                } else{
                    System.out.println("A number cannot be divided by zero!");
                };
                break;

            default:
                System.out.println("Wrong choice!");
        }
    }
}

