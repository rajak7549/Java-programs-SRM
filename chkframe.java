import java.awt.*;
import java.awt.event.*;
public class chkframe {
    public static void main(String[] args) {
        
        Frame frame=new Frame("This is my frame ");

        Label label=new Label("This is label");
        label.setBounds(100, 150, 40, 80);

        TextField textField=new TextField();
        textField.setBounds(100, 150, 40, 80);




        Button button=new Button("Click me");
        button.setBounds(50, 150, 80, 30);
        button.setFont(null);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e ){
                System.out.println("button clicked");
            }
        });

        frame.add(label);
        frame.setVisible(true);
       // frame.setBounds(200, 100, 200, 150);
        frame.setSize(400,800);
        frame.add(button);
        frame.add(textField);
    }
}
