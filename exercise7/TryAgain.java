import javax.swing.JFrame;

import java.awt.event.ActionEvent;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.*;


public class TryAgain extends JFrame {
    
    TryAgain() {

        JLabel label = new JLabel();
        label.setText("GAME OVER");
        label.setFont(new Font("Arial", Font.BOLD, 25));
        this.add(label);

        JButton tryAgainButton = new JButton();
        tryAgainButton.setText("Play Again");
        tryAgainButton.setFont(new Font("Arial", Font.BOLD, 25));
        tryAgainButton.setFocusable(false);

        EventHandler1 tryhandler = new EventHandler1();
        tryAgainButton.addActionListener(tryhandler);

        JButton exitButton = new JButton();
        exitButton.setText("Exit");
        exitButton.setFont(new Font("Arial", Font.BOLD, 25));
        exitButton.setFocusable(false);
        exitButton.addActionListener(e -> System.exit(0));

        EventHandler2 exhandler = new EventHandler2();
        exitButton.addActionListener(exhandler);

        
        this.add(tryAgainButton);
        this.add(exitButton);

        this.setTitle("Snake Game"); 
        this.setLayout(new FlowLayout());
       
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.MAGENTA);
    }

    //Event handlers

    private class EventHandler1 implements ActionListener  {


        @Override
        public void actionPerformed (ActionEvent event) {

            //Goes to game frame
            new GameFrame();
        
             //Close main menu frame
             dispose();
           
        }
    }

    private class EventHandler2 implements ActionListener  {


        @Override
        public void actionPerformed (ActionEvent event) {

            //Goes to game frame
            new GameFrame();
        
             //Close main menu frame
             dispose();
           
        }
    }

   

}
