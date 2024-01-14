import java.util.Scanner;

public class fabonacci {
    public static void main(String[] args) {
        int secondterm=1;
        int firstterm=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number which term you want ");
        int x=s.nextInt();

        for(int i=1;i<=x;i++){
            System.out.print(firstterm+",");
            int nextterm=firstterm+secondterm;
            firstterm=secondterm;
            secondterm=nextterm;
        }

    }
}
