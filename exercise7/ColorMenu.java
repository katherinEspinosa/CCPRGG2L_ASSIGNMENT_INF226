import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JLabel;
import java.awt.*;

public class ColorMenu extends JFrame {
    
    //JList
    JList colorList;
    //Color Arrays

    private String [] colorNameArray = {"GRAY", "LIGHT GRAY", "WHITE", "BLACK"};
    private Color [] colorClassArray = {Color.GRAY, Color.LIGHT_GRAY, Color.WHITE, Color.BLACK};

    ColorMenu() {

        JLabel label = new JLabel();
        label.setText("CHOOSE BACKGROUND COLOR");
        label.setFont(new Font("Arial", Font.BOLD, 20));
        this.add(label);

        //JList
         colorList = new JList(colorNameArray);
         //Restricts to one selection 
         
         colorList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
         colorList.setFont(new Font("Arial", Font.BOLD, 25));

         BGColorEventHandler bgcolorHandler = new BGColorEventHandler();
         colorList.addListSelectionListener(bgcolorHandler);

         this.add(colorList);

         this.setTitle("Snake Game"); 
         this.setLayout(new FlowLayout());
        
         this.setDefaultCloseOperation(EXIT_ON_CLOSE);
         this.setSize(500,500);
         this.setVisible(true);
         this.setLocationRelativeTo(null);
         this.getContentPane().setBackground(Color.MAGENTA);


    }

    private class BGColorEventHandler implements ListSelectionListener {

        @Override
        public void valueChanged(ListSelectionEvent e) {

            //para mabago yung value ng bg color gagawa ka ng object ni game panel 
            GamePanel gp = new GamePanel();
            gp.gameBGColor = colorClassArray[colorList.getSelectedIndex()];// para yung pipiliin mo dun sa list ay yun yung mapipili 

            //then open game frame
            new GameFrame();

            dispose();

         }
    }
}
