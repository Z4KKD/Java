import javax.swing.ImageIcon;
import javax.swing.JOptionPane;;

public class Dialogue {
    Dialogue(){
        //JOptionPane.showMessageDialog(null, "Chillin", "Nothing", JOptionPane.PLAIN_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Information!", "Information", JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Question?", "Question", JOptionPane.QUESTION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "WARNING!", "WARNING", JOptionPane.WARNING_MESSAGE);
        //JOptionPane.showMessageDialog(null, "..ERROR..", "ERROR", JOptionPane.ERROR_MESSAGE);


        //System.out.println(JOptionPane.showConfirmDialog(null, "Is this working?", "ERROR", JOptionPane.YES_NO_CANCEL_OPTION)); int answer
        //String name = JOptionPane.showInputDialog("What is your name?: ");  String answer
        //System.out.println(name);

        String[] responses = {"This is a bad test", "Okay", "OMG NOT A TEST!","I hate tests"};
        ImageIcon icon = new ImageIcon("src/logo.png");
        JOptionPane.showOptionDialog(
            null,
            "This is a test",
            "Test", 
            JOptionPane.YES_NO_CANCEL_OPTION, 
            JOptionPane.INFORMATION_MESSAGE, 
            icon, 
            responses, 
            0);
    
    }
}
