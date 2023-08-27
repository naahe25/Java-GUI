import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JFrame;
 
public class DrawSad extends JPanel
{
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        g.setColor(Color.YELLOW);
        g.fillOval(130, 100, 500, 500);

        g.setColor(Color.BLACK);
        g.fillOval(240, 420, 275, 170);

        g.setColor(Color.YELLOW);
        g.fillOval(240, 430, 275, 170);
        g.setColor(Color.BLACK);
        g.fillOval(240, 225, 75, 75);
        g.fillOval(440, 225, 75, 75);
    }

    public static void main(String[] args)
    {
        DrawSad panel = new DrawSad();
        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(800, 800);
        app.setVisible(true);
    }
}