package Levels;

import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;
public class Spielfeld extends JPanel{
	
	private Object[][] array = new Object[5][5];
	private ArrayList<Object> allTower;
	private Level1 l;
	
	public Spielfeld(Level1 l) {
		this.setPreferredSize(new Dimension(640, 480));
		array = new Object[20][20];
		
		this.l = l;
		
	}
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		g.clearRect(0, 0, 640, 480);
		g.drawLine(0, 0, 640, 480);
		g.drawRect(l.getPositionx(), l.getPositiony(), 20, 30);
	}
	
}
