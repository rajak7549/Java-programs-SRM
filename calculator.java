import java.util.Scanner;;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();

        System.out.print("Enter choice in integer : ");
        String ch = sc.next();

        switch (ch) {
            case "+":
                System.out.println("Addition : " + (num1 + num2));
                break;
            case "-":
                System.out.println("Subtraction : " + (num1 - num2));
                break;

            case "*":
                System.out.println("Multipliacation : " + (num1 * num2));
                break;

            case "%":
                System.out.println("Modulation : " + (num1 % num2));
                break;

            case "/":
                System.out.println("Division :  " + (num1 / num2));
                break;

            default:
                System.out.println("Please enter valid command");
                break;
        }

    }
}
