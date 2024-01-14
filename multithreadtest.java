public class multithreadtest {
    public static void main(String[] args) {
        Thread th = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i <= 5; i++) {
                    System.out.print(i+",");
                    //System.out.println();

                }
                System.out.println();
            }

        });
        Thread th2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 5; i >= 0; i--) {
                    System.out.print(i+",");
                    //System.out.println();

                }
            }

        });
        th.start();
        th2.start();

    }
}
