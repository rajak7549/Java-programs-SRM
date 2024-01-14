public class MyString {
    public static void main(String[] args) {
        String str1="Welcome to Java tutorial";
        String str2="Today's topic is String Handling in Java";

        String concatanate=str1+str2;
        System.out.println("Concating two string is "+str1+","+str2);

        String lower=str1.toLowerCase();
        System.out.println("Lowe case string is :-  "+lower);

        String upper=str2.toUpperCase();
        System.out.println("upper case  :-  "+upper);

        boolean b=str1.equals(str2);
        System.out.println("Both are equal : - "+b);

        int indextstr1=str1.indexOf("j");
        int indextstr2=str2.indexOf("h");
        System.out.println(indextstr1);
        System.out.println(indextstr2);
    }
}
