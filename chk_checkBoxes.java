import java.awt.*;
import java.awt.event.*;

public class chk_checkBoxes {
    private Frame frame;
    private Checkbox checkbox1;
    private Checkbox checkbox;
    private Label label;

    public chk_checkBoxes() {
        frame = new Frame("This is my frame ");
        checkbox1 = new Checkbox("Option 1");
        checkbox1.setBounds(100, 80, 150, 40);
        checkbox = new Checkbox("Option 2 ");
        checkbox.setBounds(150, 100, 170, 80);
        label = new Label("My label");
        label.setBounds(200, 120, 190, 120);


        ItemListener itemListener=new ItemListener() {
            public void itemSatate(ItemEvent e){
                String seloption="";
            }
        };

        frame.setLayout(new FlowLayout());
        frame.add(checkbox);
        frame.add(checkbox1);
        frame.add(label);
        frame.setVisible(true);
        frame.setSize(400, 400);
    }

    public static void main(String[] args) {
        chk_checkBoxes c = new chk_checkBoxes();

    }
}
