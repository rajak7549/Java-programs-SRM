import java.util.Scanner;;

public class ascending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter ten numbers");

        for (int i = 0; i < 10; i++) {

            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Ascending order");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        System.out.println("Descending order");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + ",");
        }

    }
}
