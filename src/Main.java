import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Simple Calculator!");
        System.out.println("What do you want to do?\nEnter operand here (-, +, /, *) ->");
        String operand = input.nextLine();

        System.out.println("Enter number 1:");
        int num1 = input.nextInt();
        System.out.println("Enter number 2:");
        int num2 = input.nextInt();

        System.out.println();
        System.out.println(num1 + " " + operand + " " + num2);

        switch (operand) {
            case "-":
                System.out.println("Subtraction Operand.\nYour result is: " + (num1 - num2));
                break;
            case "+":
                System.out.println("Sum Operand.\nYour result is: " + (num1 + num2));
                break;
            case "*":
                System.out.println("Multiplier Operand.\nYour result is: " + (num1 * num2));
                break;
            case "/":
                System.out.println("Division Operand.\nYour result is: " + (num1 - num2));
                break;
            default:
                System.out.println("Unknown operand. Please try again.");
        }
    }
}