package Levels;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Level1 {
	public static void main(String[] args){      
        
		JFrame l1 = new JFrame("Level 1");      
        l1.setSize(700,750);
        l1.setLocationRelativeTo(null);
        l1.setVisible(true);
        l1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel p1 = new JPanel();
        
        JButton b1 = new JButton("Test");
        p1.add(b1);
        l1.add(p1);
    }
}
