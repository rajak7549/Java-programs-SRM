import java.util.Scanner;

public class chkPalindrome {
    public static void main(String[] args) {
        int rem, sum = 0, temp;

        Scanner sc = new Scanner(System.in);
        System.out.println("Check the number is palindrome is not");
        int num = sc.nextInt();

        temp = num;
        while (num > 0) {
            rem = num % 10;
            sum = (sum * 10) + rem;
            num = num / 10;
        }
        if (temp == sum) {
            System.out.println("Number is palindrome");
        } else {
            System.out.println("Number is not palindrome");
        }

    }

}
