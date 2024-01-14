
import javax.swing.*;
import java.awt.*;

public class AllLayoutManagersExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Layout Managers Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // FlowLayout
        JPanel flowLayoutPanel = new JPanel(new FlowLayout());
        flowLayoutPanel.add(new JButton("Button 1"));
        flowLayoutPanel.add(new JButton("Button 2"));
        frame.add(flowLayoutPanel);

        // BorderLayout
        JPanel borderLayoutPanel = new JPanel(new BorderLayout());
        borderLayoutPanel.add(new JButton("North"), BorderLayout.NORTH);
        borderLayoutPanel.add(new JButton("South"), BorderLayout.SOUTH);
        borderLayoutPanel.add(new JButton("East"), BorderLayout.EAST);
        borderLayoutPanel.add(new JButton("West"), BorderLayout.WEST);
        borderLayoutPanel.add(new JButton("Center"), BorderLayout.CENTER);
        frame.add(borderLayoutPanel);

        // GridLayout
        JPanel gridLayoutPanel = new JPanel(new GridLayout(2, 3));
        gridLayoutPanel.add(new JButton("1"));
        gridLayoutPanel.add(new JButton("2"));
        gridLayoutPanel.add(new JButton("3"));
        gridLayoutPanel.add(new JButton("4"));
        gridLayoutPanel.add(new JButton("5"));
        gridLayoutPanel.add(new JButton("6"));
        frame.add(gridLayoutPanel);

        // BoxLayout
        JPanel boxLayoutPanel = new JPanel();
        boxLayoutPanel.setLayout(new BoxLayout(boxLayoutPanel, BoxLayout.Y_AXIS));
        boxLayoutPanel.add(new JButton("Vertical 1"));
        boxLayoutPanel.add(new JButton("Vertical 2"));
        boxLayoutPanel.add(new JButton("Vertical 3"));
        frame.add(boxLayoutPanel);

        frame.setLayout(new GridLayout(1, 4));
        frame.setVisible(true);
    }
}


