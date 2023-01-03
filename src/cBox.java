import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class cBox extends JFrame implements ActionListener{

    
JComboBox comboBox;

    cBox(){


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String[] colors = {"red", "blue", "orange", "green", "black", "white", "purple","pink"};
        // Interger[] test = {1,2,3}

        comboBox = new JComboBox<>(colors);
        comboBox.addActionListener(this);
        //comboBox.setEditable(true);
        comboBox.insertItemAt("yellow", 0);
        comboBox.setSelectedIndex(0);
        
        this.add(comboBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource()==comboBox)
        {
            System.out.println(comboBox.getSelectedIndex());
            //System.out.println(comboBox.getSelectedItem());
        }
        
    }
}
