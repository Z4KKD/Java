import javax.swing.*;


public class graphic extends JFrame{

    graphicPanel panel;
    graphic()
    {
        panel = new graphicPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }

}
