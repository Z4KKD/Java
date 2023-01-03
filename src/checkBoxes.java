import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class checkBoxes extends JFrame implements ActionListener{


    JCheckBox Checkbox;
    JButton button;
    JRadioButton first;
    JRadioButton second;
    JRadioButton third;

    checkBoxes(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton();
        button.setText("Submit");
        button.addActionListener(this);
        button.setFocusable(false);

        first = new JRadioButton("Select");
        second = new JRadioButton("All");
        third = new JRadioButton("Of Us");

        first.addActionListener(this);
        second.addActionListener(this);
        third.addActionListener(this);

        //ButtonGroup group = new ButtonGroup(); This makes it so only one is allowed to be selected.
        //group.add(first);
        //group.add(second);
        //group.add(third);
        

        Checkbox = new JCheckBox();
        Checkbox.setText("Are you ready?");
        Checkbox.setFocusable(false);
        Checkbox.setFont(new Font(null,Font.PLAIN,20));
        
        this.add(first);
        this.add(second);
        this.add(third);
        this.add(button);
        this.add(Checkbox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource()==button){
            System.out.println("Your ready!");
        }
        if(e.getSource()==first){
            System.out.println("First has been selected!");
        }else if(e.getSource()==second){
            System.out.println("Second has been selected!");
        }else if(e.getSource()==third){
            System.out.println("Third has been selected!");
        }


    }
    
}
