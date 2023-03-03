import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainMenu extends JFrame {
    
    MainMenu() {

        JLabel label = new JLabel();

        ImageIcon icon = new ImageIcon("minion.gif");
        label.setIcon(icon);
        this.add(label);

        JButton button = new JButton();

        EventHandler handler = new EventHandler();
        button.addActionListener(handler);
        button.setText("START GAME");
        button.setFont(new Font("Arial", Font.BOLD, 25));
        button.setFocusable(false);
        this.add(button);

        this.setTitle("Snake Game"); 
        this.setLayout(new FlowLayout());
       
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.MAGENTA);
    }


    //Event Handler

    private class EventHandler implements ActionListener  {

        public void actionPerformed (ActionEvent event) {

            //Goes to Color Menu frame
            new ColorMenu();
        
            //Close main menu frame
            dispose();
        
        }
    }
}

    


