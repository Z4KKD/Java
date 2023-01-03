import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Menu extends JFrame implements ActionListener {

    JFrame frame;
    JButton button;
    JPanel panel;
    JLabel label;
    JMenuBar menuBar;
    JMenu fileMenu;
    JMenu editMenu;
    JMenu helpMenu;
    JMenuItem loaditem;
    JMenuItem saveitem;
    JMenuItem exititem;

    Menu(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setSize(500,500);

        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help");
        
        loaditem = new JMenuItem("Load");
        saveitem = new JMenuItem("Save");
        exititem = new JMenuItem("Exit");

        loaditem.addActionListener(this);
        saveitem.addActionListener(this);
        exititem.addActionListener(this);

        fileMenu.setMnemonic(KeyEvent.VK_F); // alt+F
        editMenu.setMnemonic(KeyEvent.VK_E); // alt+e
        helpMenu.setMnemonic(KeyEvent.VK_H); // alt+H
        loaditem.setMnemonic(KeyEvent.VK_L); // while on menu L
        saveitem.setMnemonic(KeyEvent.VK_S); // while on menu S
        exititem.setMnemonic(KeyEvent.VK_Q); // while on menu Q

        fileMenu.add(loaditem);
        fileMenu.add(saveitem);
        fileMenu.add(exititem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        this.setJMenuBar(menuBar);
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource()==loaditem)
        {
            System.out.println("Loaded!");
        }
        if(e.getSource()==saveitem)
        {
            System.out.println("Saved!");
        }
        if(e.getSource()==exititem)
        {
           System.exit(0);
        }
    }

    
}
