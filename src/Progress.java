import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class Progress {

    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar();

    Progress(){
        
        bar.setValue(0);
        bar.setBounds(0,0,420,50);
        bar.setStringPainted(true);
        bar.setForeground(Color.DARK_GRAY);
        bar.setBackground(Color.black);
        bar.setFont(new Font("MV Boli", Font.BOLD,25));
    

        frame.add(bar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);

        fill();
    }

    public void fill()
    {  
        int counter = 0;
        while(counter<=100)
        {
            bar.setValue(counter);
            try{
                Thread.sleep(73);}
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
                counter+=1;
            }
            bar.setString("Completed");
        }

    }
