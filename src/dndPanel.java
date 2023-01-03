import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class dndPanel extends JPanel {
    
    ImageIcon image = new ImageIcon("src/label.png");
    final int WIDTH = image.getIconWidth();
    final int HEIGHT = image.getIconHeight();
    Point imageCorner;
    Point prevPoint;

    dndPanel()
    {
        imageCorner = new Point(0,0);
        ClickListener clicklistener = new ClickListener();
        DragListener draglistener = new DragListener();
        this.addMouseListener(clicklistener);
        this.addMouseMotionListener(draglistener);
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        image.paintIcon(this, g, (int)imageCorner.getX(), (int)imageCorner.getY());
    }
    private class ClickListener extends MouseAdapter{
        public void mousePressed(MouseEvent e){
            prevPoint = e.getPoint();
        }
    }
    private class DragListener extends MouseMotionAdapter{
        public void mouseDragged(MouseEvent e){
            Point currentPt = e.getPoint();

            imageCorner.translate(
                (int)(currentPt.getX() - prevPoint.getX()),
                (int)(currentPt.getY() - prevPoint.getY())
                );
                prevPoint = currentPt;
                repaint();

        }
    }
}
