interface ploygon{
  void getarea(int lenth, int breath);
}
class Rectangele implements ploygon{
    public void getarea(int length,int breath){
        System.out.println("Area of rectangle is "+(length*breath));

    }

}
public class interfacetest {
    public static void main(String[] args) {
        Rectangele r=new Rectangele();
        r.getarea(9, 10);
    }
}      
