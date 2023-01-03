import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class keylisten extends JFrame implements KeyListener{

    JLabel label;

    keylisten()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.addKeyListener(this);

        label = new JLabel();
        label.setBounds(0,0,100,100);
        label.setBackground(Color.black);
        label.setOpaque(true);

        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        //System.out.println("You typed this key: "+ e.getKeyChar());
        //System.out.println("You typed this keycode: "+ e.getKeyCode());
        switch(e.getKeyChar()){
            case 'a': label.setLocation(label.getX()-3, label.getY());
            break;
            case 'w': label.setLocation(label.getX(), label.getY()-3);
            break;
            case 's': label.setLocation(label.getX(), label.getY()+3);
            break;
            case 'd': label.setLocation(label.getX()+3, label.getY());
            break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        //System.out.println("You pressed this key: "+ e.getKeyChar());
        //System.out.println("You pressed this keycode: "+ e.getKeyCode());
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        //System.out.println("You released this key: "+ e.getKeyChar());
        //System.out.println("You released this keycode: "+ e.getKeyCode());

    }
}
