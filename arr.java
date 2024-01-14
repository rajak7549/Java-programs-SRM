import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class arr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Integer [] num=new Integer[10];
        for(int i=0;i<10;i++){
           System.out.println("Enter number ");
           num[i]=sc.nextInt();
        }

        for(int n:num){
            System.out.print(" "+n);
        }
        System.out.println();
        Arrays.sort(num);
        System.out.print("Ascending order: "+Arrays.toString(num));

        Arrays.sort(num,Collections.reverseOrder());
        System.out.println("Descending oder is :"+Arrays.toString(num));
    }
}
