public class nested {
    void display() {
        System.out.println("THis is outer calss");
    }

    class inner {
        void display() {
            System.out.println("THis is inner calss");
        }
    }
    public static void main(String[] args) {
        nested ns=new nested();
        ns.display();

        nested.inner in=ns.new inner();
        in.display();
    }
}
