import java.awt.*;

public class FlowLayout1 {
    public static void main(String[] args) {
        Frame frame = new Frame("FlowLayout Example");
        frame.setLayout(new FlowLayout());

        frame.add(new Button("Button 1"));
        frame.add(new Button("Button 2"));
        frame.add(new Button("Button 3"));
        frame.add(new Button("Button 4"));

        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
