import java.util.Date;

class evenNumber implements Runnable {
    public void run() {
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("Even number is " + i);
        }
    }
}

class oddNumber implements Runnable {
    public void run() {
        for (int i = 1; i <= 9; i += 2) {
            System.out.println("Odd number is "+i);
        }
    }
}

public class chkeven_odd {
    public static void main(String[] args) {
         Runnable EvenTask = new evenNumber();
         Runnable OddTask = new oddNumber();

         Thread even=new Thread(EvenTask);
         Thread odd=new Thread(OddTask);

         even.start();
         odd.start();

         Date d=new Date();
         System.out.println("Current date id "+d);
    }

}
