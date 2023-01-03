import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class keybind {

    JFrame frame;
    JLabel label;
    Action upAction;
    Action downAction;
    Action rightAction;
    Action leftAction;

    keybind()
    {
        frame = new JFrame("Keybind");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);

        label = new JLabel();
        label.setBackground(Color.red);
        label.setBounds(100,100,100,100);
        label.setOpaque(true);

        upAction = new UpAction();
        downAction = new DownAction();
        rightAction = new RightAction();
        leftAction = new LeftAction();

        label.getInputMap().put(KeyStroke.getKeyStroke('w'), "upAction");
        label.getActionMap().put("upAction", upAction);
        label.getInputMap().put(KeyStroke.getKeyStroke('s'), "downAction");
        label.getActionMap().put("downAction", downAction);
        label.getInputMap().put(KeyStroke.getKeyStroke('d'), "rightAction");
        label.getActionMap().put("rightAction", rightAction);
        label.getInputMap().put(KeyStroke.getKeyStroke('a'),  "leftAction");
        label.getActionMap().put("leftAction", leftAction);

        frame.add(label);
        frame.setVisible(true);



    }
    public class UpAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            label.setLocation(label.getX(), label.getY()-10);
            
        }
        
    }
    public class DownAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            label.setLocation(label.getX(), label.getY()+10);
            
        }
    }
    public class RightAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            label.setLocation(label.getX()+10, label.getY());
            
        }

    }

    public class LeftAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            label.setLocation(label.getX()-10, label.getY());
        }
        
    }
}
