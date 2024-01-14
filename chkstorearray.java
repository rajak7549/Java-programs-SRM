import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class chkstorearray {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        Integer num[]=new Integer[10];

        for(int i=0;i<10;i++){
            System.out.println("Enter  a number ");
            num[i]=sc.nextInt();

        }
        Arrays.sort(num);

        System.out.println("Printing the array in ascending order");

        for(int number:num){
            System.out.print(","+number);

        }

        System.out.println("Printing the arrays in descending order ");
        Arrays.sort(num ,Collections.reverseOrder());
        System.out.println("Descending arder is " + Arrays.toString(num));
        
    }
}
