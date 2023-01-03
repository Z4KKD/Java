import javax.swing.*;
import java.awt.*;

public class graphicPanel extends JPanel{

    graphicPanel()
    {
        this.setPreferredSize(new Dimension(500,500));
    }

    public void paint(Graphics g)
    {
     Graphics2D g2D = (Graphics2D) g;
    
     g2D.setPaint(Color.green);
     //g2D.setStroke(new BasicStroke(5));
     //g2D.drawLine(0,0,500,500);
     int[] xPoints = {150,250,350};
     int[] yPoints = {300,150,300};
     g2D.fillPolygon(xPoints,yPoints,3);

    } 
}
