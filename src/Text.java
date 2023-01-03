import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Text extends JFrame implements ActionListener{
    
    JButton myButton;
    JTextField textField;
    

    Text(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        JButton myButton = new JButton("Submit");
        myButton.addActionListener(this);
        myButton.setFont(new Font("MV Boli", Font.PLAIN,20));
        myButton.setFocusable(false);
        myButton.setBackground(Color.black);
        myButton.setForeground(Color.green);
        //myButton.setEditable(false); disables it

        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(250,40));
        textField.setFont(new Font("MV Boli", Font.PLAIN,30));
        textField.setBackground(Color.black);
        textField.setForeground(Color.green);
        textField.setCaretColor(Color.green);
        textField.setText("Test");
        //textField.setEditable(false); disables it



        this.add(myButton);
        this.add(textField);
        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource()==myButton){
            System.out.println(textField.getText());
        }
        
        
    }
}
