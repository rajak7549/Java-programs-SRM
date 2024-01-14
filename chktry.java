public class chktry {
    public static void main(String[] args) {
        int a=10,b=4,c=3;
        int result;

        try {
            result=(a/c)- b;
        } catch (ArithmeticException e) {
            System.err.println();
            System.err.println(e);
        }finally{
            System.out.println("This is finally block ");
        }
        result=a/(b+c);
        System.out.println("Result is "+result);
    }
}
