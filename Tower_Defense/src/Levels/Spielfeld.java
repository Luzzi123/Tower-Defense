package Levels;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Spielfeld extends JPanel{
	
	public Spielfeld(Level1 l) {
		this.setPreferredSize(new Dimension(640, 480));
		
	}
	@Override
	protected void paintComponent(Graphics g) {
		g.clearRect(0, 0, 640, 480);
		g.drawLine(0, 0, 640, 480);
		drawallNormTow(g);
		drawallSlowTow(g);
		drawallFlameTow(g);
		drawallHRTow(g);
		
	}
	
	private void drawallHRTow(Graphics g) {
		for(int i=0;i<Level1.allHighRangeTower.size();i++){
			g.drawRect((int)Level1.allHighRangeTower.get(i).getPositionx(),(int)Level1.allHighRangeTower.get(i).getPositiony(),30,50);
		}
	}
	private void drawallFlameTow(Graphics g) {
		for(int i=0;i<Level1.allFlameTower.size();i++){
			g.drawRect((int)Level1.allFlameTower.get(i).getPositionx(),(int)Level1.allFlameTower.get(i).getPositiony(),40,40);
		}
	}
	private void drawallSlowTow(Graphics g) {
		for(int i=0;i<Level1.allSlowTower.size();i++){
			g.drawRect((int)Level1.allSlowTower.get(i).getPositionx(),(int)Level1.allSlowTower.get(i).getPositiony(),20,20);
		}
	}
	private void drawallNormTow(Graphics g) {
		for(int i=0;i<Level1.allNormTower.size();i++){
			g.drawRect((int)Level1.allNormTower.get(i).getPositionx(),(int)Level1.allNormTower.get(i).getPositiony(),25,25);
		}
	}
}
