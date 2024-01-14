import java.util.Vector;

public class checklegacy {
    public static void main(String[] args) {
        Vector vec = new Vector<>();
        vec.add("Book");
        vec.add("Pencil");
        vec.add("paper");
        vec.add("Copy");

        System.out.println("Vercor elemnts is ");
        for (Object stationary : vec) {
            System.out.println(stationary);
        }

        vec.remove("Copy");
        System.out.println("Removed Element  ");
        if(vec.contains("copy")){
           System.out.println("copy is in the vector");
        }else{
            System.out.println("Copy is not in the vector");
        }

        System.out.println("Vecrot size is "+vec.size());
    }
}
