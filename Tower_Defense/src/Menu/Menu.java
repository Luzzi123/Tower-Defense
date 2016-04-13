package Menu;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Levels.Level1;

public class Menu{
	static JFrame frame= new JFrame();	
	static JPanel abstpan= new JPanel();
	static JButton playbutton= new JButton("Play");
	static JButton exitbutton= new JButton("Exit");
	
	
	public Menu(){
		
		try {
			frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("TestBackground.jpg")))));
		} catch (IOException e) {
			e.printStackTrace();
		}
		frame.setUndecorated(true);
		frame.setBounds(653,210,640,581);
		frame.setLayout(new BorderLayout());
		abstpan.setLayout(new BoxLayout(abstpan,BoxLayout.Y_AXIS));
		abstpan.setPreferredSize(new Dimension(100, 100));
		
		ActionListener actionbyexit= new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.exit(0);
			}
		};
		ActionListener actionbyplay= new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new Level1();
				frame.dispose();
			}
			
		};
		exitbutton.addActionListener(actionbyexit);
		playbutton.addActionListener(actionbyplay);
		
		
		abstpan.add(playbutton,abstpan);
		abstpan.add(exitbutton,abstpan);
		frame.add(abstpan,BorderLayout.NORTH);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String [] args) {
		new Menu();
	}
	
	
	
	
	
}