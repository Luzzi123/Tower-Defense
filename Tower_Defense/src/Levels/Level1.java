package Levels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JToggleButton;

public class Level1 {
	
public static void main(String[] args){          
	
		JFrame l1 = new JFrame("Level 1");      
		l1.setLayout(new BorderLayout());
		
		l1.setLocationRelativeTo(null);
       
        JPanel jp = new JPanel();
        jp.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.NORTH;
        
        
        JToggleButton nt = new JToggleButton("<html><center>Normal<br>Tower</center></html>",false);
        c.gridx = 0;
        c.gridy = 0;
        jp.add(nt,c);
        nt.setPreferredSize(new Dimension(90,75));
        
        JToggleButton st = new JToggleButton("<html><center>Slow<br>Tower</center></html>",false);
        c.gridx = 1;
        c.gridy = 0;
        jp.add(st,c);
        st.setPreferredSize(new Dimension(90,75));
        
        JToggleButton hrt = new JToggleButton("<html><center>High-Rage<br>Tower</center></html>",false);
        c.gridx = 2;
        c.gridy = 0;
        jp.add(hrt,c);
        hrt.setPreferredSize(new Dimension(110,75));
        
        
        JToggleButton ft = new JToggleButton("<html><center>Flame<br>Tower</center></html>",false);
        c.gridx = 3;
        c.gridy = 0;
        jp.add(ft,c);
        ft.setPreferredSize(new Dimension(90,75));
        
        /**
        JProgressBar lb = new JProgressBar(0, 100);
        lb.setValue(50);
		lb.setStringPainted(true);
		c.gridx = 6;
		c.gridy = 6;
		jp.add(lb,c);
		*/
		
		jp.setBackground(Color.RED);
        		
        l1.add(jp, BorderLayout.NORTH);
        l1.add(new JButton("dummy"), BorderLayout.CENTER);
        l1.pack();
        l1.setVisible(true);
        l1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
	}
}
