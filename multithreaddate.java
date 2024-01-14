import java.util.Date;
class even implements Runnable{
    public void evenPrint(){
        for( int i=2;i<=10;i+=2){
              System.out.println("Even numbers are "+i);
        }
    }
}

class odd implements Runnable{
   public void oddPrint(){
       for(int i=1;i<=10;i+=2){
          System.out.println("Odd numbers are "+ i);
       }
   }
}



public class multithreaddate {
    public static void main(String[] args) {
      Runnable evenTask=new even();
      Runnable oddTask=new odd();  


      Thread evenTh=new Thread(evenTask);
      Thread oddTh=new Thread(oddTask);

      evenTh.start();
      oddTh.start();

      Date d=new Date();
      System.out.println("Current date is "+d);


    }
}
