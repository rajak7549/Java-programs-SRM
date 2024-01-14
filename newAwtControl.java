import java.awt.*;
import java.awt.event.*;

public class newAwtControl {
    public static void main(String[] args) {
        Frame f = new Frame("This is new Awt controls");

        // label
        Label label = new Label("This is my label");
        label.setBounds(50, 50, 100, 30);
        label.setVisible(true);

        // textfielf

        TextField textField = new TextField("This ismy textField");
        textField.setBounds(50, 100, 150, 30);

        // buttom
        Button button = new Button("Click me ");
        button.setBounds(50, 150, 80, 30);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                textField.setText("Button is clicked");
            }
        });

        // checkBox
        Checkbox checkbox = new Checkbox("THis is checkbox");
        checkbox.setBounds(50, 200, 100, 30);

        // list
        List list = new List();
        list.setBounds(220, 280, 100, 50);
        list.add("List first");
        list.add("List Second");
        list.add("List third");

        // choice dropdown

        Choice choice = new Choice();
        choice.setBounds(200, 190, 80, 50);
        choice.add("first Choice");
        choice.add("Second Choice");
        choice.add("Third choice");

        // textarea

        TextArea textArea = new TextArea("Please write here ");
        textArea.setBounds(200, 250, 150, 100);
        f.add(label);
        f.add(button);
        f.add(textArea);
        f.add(textField);
        f.add(choice);
        f.add(checkbox);

        f.setLayout(null);
        f.setSize(400, 400);
        f.setVisible(true);

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);

            }
        });

    }
}
