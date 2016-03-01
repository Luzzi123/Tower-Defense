package Levels;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

public class Level1 {
public static void main(String[] args){      
        
		JFrame l1 = new JFrame("Level 1");      
        l1.setSize(700,750);
        l1.setLocationRelativeTo(null);
       
        JPanel jp = new JPanel();
        jp.setSize(new Dimension(80,10));
        
        
        JToggleButton nt = new JToggleButton("<html><center>Normal<br>Tower</center></html>",false);
        jp.add(nt);
        nt.setPreferredSize(new Dimension(90,75));
        
        JToggleButton st = new JToggleButton("<html><center>Slow<br>Tower</center></html>",false);
        jp.add(st);
        st.setPreferredSize(new Dimension(90,75));
        
        JToggleButton hrt = new JToggleButton("<html><center>High-Rage<br>Tower</center></html>",false);
        jp.add(hrt);
        hrt.setPreferredSize(new Dimension(90,75));
        
        JToggleButton ft = new JToggleButton("<html><center>Flame<br>Tower</center></html>",false);
        jp.add(ft);
        ft.setPreferredSize(new Dimension(90,75));
        
 
        l1.add(jp);
        l1.setVisible(true);
        l1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
