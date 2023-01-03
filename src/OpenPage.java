import javax.swing.JFrame;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OpenPage implements ActionListener {

    JFrame frame = new JFrame();
    JButton myButton = new JButton("Click here");


    OpenPage(){

        myButton.setBounds(150,100,200,200);
        myButton.setFocusable(false);
        myButton.addActionListener(this);
        frame.add(myButton);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500,500));
        frame.setLayout(null);
        frame.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource()==myButton){
            frame.dispose();
             new NewFrame();
        
        }
    }
    
}
