import java.awt.*;
import java.awt.event.*;
public class AWTControlsDemo {
    public static void main(String[] args) {
        Frame frame = new Frame("AWT Controls Demo");

        // Label
        Label label = new Label("This is a Label");
        label.setBounds(50, 50, 100, 30);

        // Text Field
        TextField textField = new TextField("Text Field");
        textField.setBounds(50, 100, 150, 30);

        // Button 
        Button button = new Button("Click Me");
        button.setBounds(50, 150, 80, 30);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText("Button Clicked");
            }
        });
               // Checkbox
        Checkbox checkbox = new Checkbox("Checkbox");
        checkbox.setBounds(50, 200, 100, 30);

        // Radio Buttons
        CheckboxGroup checkboxGroup = new CheckboxGroup();
        Checkbox radio1 = new Checkbox("Radio 1", checkboxGroup, false);
        radio1.setBounds(50, 250, 100, 30);
        Checkbox radio2 = new Checkbox("Radio 2", checkboxGroup, false);
        radio2.setBounds(50, 300, 100, 30);

        // List
        List list = new List();
        list.setBounds(200, 50, 100, 100);
        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");

        // Choice (Dropdown)
        Choice choice = new Choice();
        choice.setBounds(200, 200, 100, 30);
        choice.add("Option 1");
        choice.add("Option 2");
        choice.add("Option 3");

        // Text Area
        TextArea textArea = new TextArea("This is a Text Area");
        textArea.setBounds(200, 250, 150, 100);

        frame.add(label);
        frame.add(textField);
        frame.add(button);
        frame.add(checkbox);
        frame.add(radio1);
        frame.add(radio2);
        frame.add(list);
        frame.add(choice);
        frame.add(textArea);

        frame.setLayout(null);
        frame.setSize(400, 400);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}

