import java.awt.*;
import java.awt.event.*;

public class allLayout {

    private Frame frame;
    private Button butto1, butto2, butto3, butto4, butto5, butto6;

    allLayout() {
        frame = new Frame("All layout manager");
        // flowlayout manager
        Panel flowPanel = new Panel(new FlowLayout());
        butto1 = new Button("Button 1");
        butto1.setBounds(50, 150, 80, 30);
        butto2 = new Button("Button 2");
        butto2.setBounds(100, 200, 100, 50);
        butto3 = new Button("Button 3");
        butto3.setBounds(150, 250, 120, 70);

        flowPanel.add(butto1);
        flowPanel.add(butto2);
        flowPanel.add(butto3);

        // borderlayour

        Panel borderPanel = new Panel(new BorderLayout());
        butto4 = new Button("Button 4");
        butto4.setBounds(50, 150, 80, 30);
        butto5 = new Button("Button 5");
        butto6 = new Button("Button 6");

        borderPanel.add(butto4);
        borderPanel.add(butto5);
        borderPanel.add(butto6);

        Panel gridPanel = new Panel(new GridLayout(2, 3));

        frame.add(butto1);
        frame.add(butto2);
        frame.add(butto3);
        frame.add(butto4);
        frame.add(butto5);
        frame.add(butto6);

        frame.add(flowPanel);
        frame.add(borderPanel);
        frame.add(gridPanel);
        frame.setSize(400, 300);
        frame.setVisible(true);

    }

    public static void main(String[] args) {

        allLayout al = new allLayout();
    }
}
