import java.util.Scanner;

public class chktabel {
    public static void main(String[] args) {
        int num;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number from statting with " + 0 + " to n number ");
        num=sc.nextInt();

        for(int i=0;i<=num;i++){
            System.out.println("Multiplication of "+i+":");
            for(int j=1;j<=10;j++){
                System.out.println(i+" x "+ j +" = "+(i*j));

            }
            System.out.println();

        }

    }
}
