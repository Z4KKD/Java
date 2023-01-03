import javax.swing.JFrame;

import java.awt.*;
import javax.swing.*;


public class animation extends JFrame {

    animationPanel panel;

    animation()
    {
        panel = new animationPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
}
