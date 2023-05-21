import java.util.ArrayList;
import java.awt.*;
import javax.swing.JPanel;

public class Lamina extends JPanel{
    private ArrayList<Ball> balls = new ArrayList<>();
    private ArrayList<Ball> rect = new ArrayList<>();
 

    

    public void add(Ball ball){
        balls.add(ball);
    }
    public void addRect(Ball ball){
        rect.add(ball);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;
        
        for (Ball ball : balls) {

            g2.fill(ball.crearBall());
            
        }
        for (Ball ball : rect) {

            g2.fill(ball.crearRectangle());
            
        }

    }

}
