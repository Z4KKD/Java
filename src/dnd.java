import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class dnd extends JFrame{

    dndPanel dragPanel = new dndPanel();
    JFrame frame;
    JPanel panel;
    JLabel label;

    dnd()
    {
        this.add(dragPanel);
        this.setTitle("Drag & Drog");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setVisible(true);

    }
    
}
