//GUI TEST
package dragongame;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;

public class Test1 {

    public static void main(String[] args) {
        //Set the frame size
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(800,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setVisible(true);
        
        panel.setLayout(null);
        //Words on the frame
        JLabel Title = new JLabel("Welcome to Till The End - A Tower Defense Game!");
        Title.setBounds(160, 100, 600, 150);
        //Set the font type and size
        Font fn = new Font("",Font.BOLD,20);
        Title.setFont(fn);
        panel.add(Title);
        
        //Start button settings
        JButton startbutton = new JButton("START");
        startbutton.setBounds(350, 250, 80, 25);
        panel.add(startbutton);
        //startbutton.setBorder(null);
        startbutton.setBackground(Color.white);
        
        //continue progress button
        JButton contbutton = new JButton("CONTINUE");
        contbutton.setBounds(341, 290, 100, 25);
        panel.add(contbutton);
        contbutton.setBackground(Color.white);
        
        

    }
    
}
