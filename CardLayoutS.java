import java.awt.*;
public class CardLayoutS {
    public static void main(String[] args) {
        Frame frame = new Frame("CardLayout Example");
        CardLayout cardLayout = new CardLayout();
        frame.setLayout(cardLayout);

        frame.add(new Button("Card 1"), "Card1");
        frame.add(new Button("Card 2"), "Card2");
        frame.add(new Button("Card 3"), "Card3");

        cardLayout.show(frame, "Card2");
        cardLayout.show(frame, "Card1");
        cardLayout.show(frame, "Card3");

        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
