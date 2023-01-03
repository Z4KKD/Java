import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class NewFrame implements ActionListener {


    JFrame frame = new JFrame();
    JLabel label = new JLabel("Test");
    JButton myButton = new JButton("Click again?");

    NewFrame(){

        myButton.setBounds(150,100,200,200);
        myButton.setFocusable(false);
        myButton.addActionListener(this);
        frame.add(myButton);

        label.setBounds(0,0,100,50);
        label.setFont(new Font(null, Font.PLAIN,25));
        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource()==myButton){
            frame.dispose();
            new NewFrame();}}
}
