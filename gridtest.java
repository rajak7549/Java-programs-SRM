import java.awt.Frame;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.event.*;

public class gridtest {
    public static void main(String[] args) {
        Frame frame = new Frame("Grid layout frame ");
        frame.setLayout(new GridLayout(2, 4));

        Button btn = new Button("First button");
        Button btn1 = new Button("First button");
        Button btn2 = new Button("First button");
        Button btn3 = new Button("First button");

        frame.add(btn);
        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);

        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
}
