import java.awt.*;
import java.awt.event.*;

import javax.swing.BoxLayout;

public class layoutSimple extends Frame {
    layoutSimple(){

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setSize(300,300);


        Label l=new Label("Name");
        Button btn=new Button("Click me ");
        Checkbox checkbox=new Checkbox("MMZ");
        TextArea textArea=new TextArea(100,10);
        textArea.setText("This is textarea");
        Choice ch=new Choice();
        ch.add("New List 1");
        ch.add("New List 2");

        add(l,"North");
        add(btn,"South");
        add(checkbox,"West");
        add(textArea,"Center");

        setVisible(true);
    }



    public static void main(String[] args) {
        new layoutSimple();
    }
}
