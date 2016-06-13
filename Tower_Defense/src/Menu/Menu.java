package Menu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Levels.*;

public class Menu {
	private Image icon= new ImageIcon("Game Icon.png").getImage();

	protected static MouseMotionListener listener = new MouseMotionListener() {

		@Override
		public void mouseMoved(MouseEvent e) {
			ovap.repaint();
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub

		}
	};
	protected static boolean rdy = false;
	protected static JFrame frame = new JFrame("Menu");
	protected static JPanel pan = new JPanel();
	protected static OverallPane ovap= new OverallPane();
	
	Image img= new ImageIcon("Start_Way.png").getImage();

	public static void main(String[] args) throws InterruptedException, IOException {
		new Menu();
		while(true){
			if(ovap.but.isSelected()==true){
				frame.dispose();
				Level1.main(args);
				break;
			}
			ovap.animate();
			Thread.sleep(500);
		}
	}

	public Menu() {
		//Modelliere Frame
		frame.setBounds(650,210,646, 609);
		frame.setIconImage(icon);
		frame.setLayout(new BorderLayout());
		frame.setResizable(false);
		// Modelliere pan
		pan.setBackground(Color.BLACK);
		pan.setLayout(new BorderLayout());
		pan.add(ovap, BorderLayout.NORTH);
		
		frame.add(pan);
		frame.addMouseMotionListener(listener);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		rdy = true;
	}
}
