import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class Slide implements ChangeListener {


    JFrame frame;
    JSlider slider;
    JPanel panel;
    JLabel label;

    Slide()
    {
        frame = new JFrame("Slider demo");
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0,100,50);

        slider.setPreferredSize(new Dimension(200, 300));
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);
        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25);
        slider.setPaintLabels(true);
        slider.setFont(new Font(null,Font.PLAIN,20));
        slider.setOrientation(SwingConstants.VERTICAL);
        slider.addChangeListener(this);

        label.setText(""+slider.getValue());
        
        panel.add(slider);
        panel.add(label);
        frame.add(panel);
        frame.setSize(500,500);
        frame.setVisible(true);


    }

    @Override
    public void stateChanged(ChangeEvent e) {
        // TODO Auto-generated method stub
        label.setText(""+slider.getValue());
        
    }
    
}
