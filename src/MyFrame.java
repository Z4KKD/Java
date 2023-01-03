import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.Border;
import javafx.event.ActionEvent;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame implements ActionListener{
    
    JButton button;
    
    MyFrame(){
        
        ImageIcon iLabel = new ImageIcon("src/label.png");
        Border border = BorderFactory.createLineBorder(Color.white);

        JLabel label = new JLabel();
        label.setText("Get Ready!");
        label.setIcon(iLabel);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("MV Boli", Font.PLAIN,30));
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setIconTextGap(-50);
        label.setBackground(Color.green);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(250,250,250,250);
        label.setForeground(Color.black);

        JLabel redLabel = new JLabel();
        ImageIcon redImage = new ImageIcon("src/red.png");
        redLabel.setPreferredSize(new Dimension(200,200));
        redLabel.setIcon(redImage); 

        JLabel blueLabel = new JLabel();
        ImageIcon blueImage = new ImageIcon("src/blue.png");
        blueLabel.setPreferredSize(new Dimension(200,200));
        blueLabel.setIcon(blueImage);
        

        button = new JButton();
        button.setBounds(325,500,100,50);
        button.addActionListener(this); // or e -> System.out.println("test") for short 
        button.setText("Fight!");
        button.setFont(new Font("MV Boli", Font.PLAIN,20));
        button.setFocusable(false);
        button.setForeground(Color.black);
        button.setEnabled(true);
        
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,250,250,250);;
        redPanel.add(redLabel);
        
        JPanel bluePanel = new JPanel();
        ImageIcon blueimage = new ImageIcon("src/blue.png");
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(500,250,250,250);
        bluePanel.add(blueLabel);


        ImageIcon image = new ImageIcon("src/logo.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.setTitle("Arena");
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(730,730);
        this.setVisible(true);
        this.add(label);
        this.add(redPanel);
        this.add(bluePanel);
        this.add(button);
    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource()==button)
            System.out.println("test");
            button.setEnabled(false);
            
    }
}
         
