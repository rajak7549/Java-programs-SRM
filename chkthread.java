public class chkthread {
    public static void main(String[] args) {
        Thread th = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i <= 5; i++) {
                    System.out.println(i);
                }
            }
        });
        System.out.println("This is second thread");
        Thread th2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 5; i >= 0; i--) {
                    System.out.println(i);
                }
            }
        });

        th.start();
        th2.start();

    }
}
