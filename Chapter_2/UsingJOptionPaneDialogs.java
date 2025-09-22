import javax.swing.*;

public class UsingJOptionPaneDialogs {
    public static void main(String[] args) {
       
        while (true) {
            
            String name = JOptionPane.showInputDialog(null, "What is your name:");

        
            if (name == null) {
                System.exit(0);
            }

           
            int response = JOptionPane.showConfirmDialog(null,
                    "Do you want to display your name?",
                    "Confirm Name",
                    JOptionPane.YES_NO_OPTION);

            
            if (response == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Hi " + name + "!");
                break;
            }
        }
    }
}
