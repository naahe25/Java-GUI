import javax.swing.JFrame;

public class ListFrameTest {
    public static void main(String[] args) {
        ListFrame listFrame = new ListFrame(); // create ListFrame
        listFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        listFrame.setSize(450, 200);
        listFrame.setVisible(true);

    }
}
