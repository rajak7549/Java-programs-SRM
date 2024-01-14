public class exampleStat {
   static String name="BBM";
   String na;
   String roll;

   exampleStat(String na,String roll){
       this.na=na;
       this.roll=roll;
   }

   public void Show(){
    
    System.out.println("Name is "+ na +"And roll nuber is "+roll+"School name is "+name);
   }
   public static void main(String[] args) {

    exampleStat ex=new exampleStat("Raja", "1001");
    exampleStat ex1=new exampleStat("ujjwal", "1001");
    exampleStat ex2=new exampleStat("somaya", "1001");
    exampleStat ex3=new exampleStat("Rajesh", "1001");
    ex.Show();
    ex1.Show();
    ex2.Show();
    ex3.Show();



    
   }
   
   
}
