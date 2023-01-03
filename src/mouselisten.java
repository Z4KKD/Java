import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class mouselisten extends JFrame implements MouseListener{


    JLabel label;

    mouselisten()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);

        label = new JLabel();
        label.setBounds(0,0,100,100);
        label.setBackground(Color.black);
        label.setOpaque(true);
        label.addMouseListener(this);

        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        //System.out.println("You clicked!");
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        //System.out.println("You pressed down on the mouse!");
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        //System.out.println("You released the mouse!");
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        System.out.println("You entered the mouse state!"); // works like on enter-collision 
        label.setBackground(Color.red);
        
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        System.out.println("You exited the mouse state!"); // works like leaving collision
        label.setBackground(Color.green);

        
    }
    
}
