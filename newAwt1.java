import java.awt.*;
import java.awt.event.*;
public class newAwt1 {
    public static void main(String[] args) {
        Frame f=new Frame("This is my fame");
        Label label =new Label("Label");
        label.setBounds(100, 20, 100, 100);
        TextField textField=new TextField(20);
        textField.setBounds(100, 20, 100, 100);

        Button button=new Button("CLick me");
        button.setBounds(100, 20, 100, 100);


        f.add(button);
        f.add(label);
        f.add(textField);
        f.setSize(400,400);
        f.setVisible(true);
        



        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
              textField.setText("Button action is performed");
            }
        });



        


    
    }
    
}
