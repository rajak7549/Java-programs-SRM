//Create a class called MyString : 
//Declare two string type variables: 
//str1 (“ Welcome to Java tutorial”) and 
//str2(“Today's topic is String Handling in Java”). 
//Perform following operations in this class:
public class chkStr {
    public static void main(String[] args) {
        String str1 = " Welcome to Java tutorial";
        String str2 = "Today's topic is String Handling in Java";

        // concatinating two string

        String newConcat = str1 + str2;

        System.out.println(newConcat);

        String lower = str1.toLowerCase();
        String upper = str2.toUpperCase();

        System.out.println("Lower case of the string is :----" + lower);
        System.out.println("Upper case of the String is:--- " + upper);

        boolean s;
        s = str1.equals(str2);

        System.out.println("comparision of the two string is :==" + s);

        int indetat = str1.indexOf("j");
        int index2 = str2.indexOf("j");

        System.out.println(indetat);
        System.out.println(index2);

        // replacing the Sring is

        str1 = str1.replace("i", "I");
        str2 = str2.replace("i", "I");

        System.out.println(str1);
        System.out.println(str2);

        char seventhChar = str1.charAt(6);
        char seventhChar1 = str1.charAt(6);

        System.out.println(seventhChar);
        System.out.println(seventhChar1);

        String[] str5 = str1.split(" ");
        for (String word : str5) {
            System.out.println("Spliting the String is " + word);
        }

    }
}
