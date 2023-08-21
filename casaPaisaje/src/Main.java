import javax.swing.*;
import java.awt.*;


public class Main {
    public static void main(String[] args) {

        new casaPaisaje().setVisible(true);

    }
}

class casaPaisaje extends JFrame {

    public casaPaisaje() {
        setTitle("paisaje");
        setSize(500, 500);
        setLayout(null);

    }
    public void paint(Graphics g){
        super.paint(g);

        g.setColor(Color.black);
        g.fillRect(0, 0, getWidth(), getHeight());

        g.setColor(Color.white);
        g.fillOval(50, 50, 100, 100);

        g.setColor(Color.green);
        g.fillRect(0, getHeight() - 100, getWidth(), 100);

        g.setColor(Color.white);
        for (int i = 0; i < 100; i++) {
            int x = (int) (Math.random() * getWidth());
            int y = (int) (Math.random() * getHeight());
            g.fillRect(x, y, 2, 2);
        }

        g.setColor(Color.darkGray);
        g.fillRect(300, getHeight() - 200, 200, 150);

        int[] roofX = {300, 400, 500};
        int[] roofY = {getHeight() - 200, getHeight() - 250, getHeight() - 200};
        g.setColor(Color.gray);
        g.fillPolygon(roofX, roofY, 3);

        g.setColor(Color.white);
        g.fillRect(350, getHeight() - 100, 50, 50);

        g.setColor(Color.white);
        g.fillRect(450, getHeight() - 150, 100, 50);

        g.setColor(Color.blue);
        g.fillRect(100, getHeight() - 100, 100, 50);
        g.setColor(Color.blue);
        g.fillOval(100, getHeight() - 50, 50, 50);
        g.fillOval(150, getHeight() - 50, 50, 50);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Dibujo Nocturno");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.add(new casaPaisaje());
        frame.setVisible(true);
    }
}



