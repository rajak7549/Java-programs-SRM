import java.awt.event.*;
import java.awt.*;

public class Alltest {

    public static void main(String[] args) {
        Frame frame = new Frame("AWT Layout Example");
        frame.setLayout(new BorderLayout());
        Frame frame1 = new Frame("Grid layout frame ");
        frame1.setLayout(new GridLayout(2, 4));

        Button btn = new Button("First button");
        Button btn1 = new Button("First button");
        Button btn2 = new Button("First button");
        Button btn3 = new Button("First button");

        frame1.add(btn);
        frame1.add(btn1);
        frame1.add(btn2);
        frame1.add(btn3);

        frame1.setSize(300, 200);
        frame1.setVisible(true);
        frame1.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        Panel northPanel = new Panel();
        northPanel.add(new Label("North Panel"));
        frame.add(northPanel, BorderLayout.NORTH);

        Panel centerPanel = new Panel();
        centerPanel.add(new Button("Button 1"));
        centerPanel.add(new Button("Button 2"));
        centerPanel.add(new Button("Button 3"));
        frame.add(centerPanel, BorderLayout.CENTER);

        Panel southPanel = new Panel();
        southPanel.add(new Label("South Panel"));
        frame.add(southPanel, BorderLayout.SOUTH);

        frame.setSize(300, 200);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }
}
