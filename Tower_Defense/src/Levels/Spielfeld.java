package Levels;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;
public class Spielfeld extends JPanel{
	
	private Object[][] array = new Object[5][5];	
	 
	public Spielfeld() {
		this.setPreferredSize(new Dimension(640, 480));
		array = new Object[20][20];
		
	}
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		g.drawLine(0, 0, 640, 480);
	}
}
