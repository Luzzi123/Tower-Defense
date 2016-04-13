package Levels;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Spielfeld extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Spielfeld(Level1 l) {
		this.setPreferredSize(new Dimension(640, 480));
		
	}
	@Override
	protected void paintComponent(Graphics g) {
		g.clearRect(0, 0, 640, 480);
		drawselectedTow(g);
		drawallNormTow(g);
		drawallSlowTow(g);
		drawallFlameTow(g);
		drawallHRTow(g);
		
	}
	
	
	
	private void drawselectedTow(Graphics g) {
		if(Level1.mouseposX >= 15 && Level1.mouseposY >= 15 && Level1.mouseposX<=624 && Level1.mouseposY<=474){
			if(Level1.nt.isSelected()==true){
				g.drawRect((int)Level1.mouseposX-15,(int)Level1.mouseposY-15, 30, 30);
			}
			else if(Level1.hrt.isSelected()==true){
				g.drawRect((int)Level1.mouseposX-15,(int)Level1.mouseposY-15, 30, 30);
			}
			else if(Level1.ft.isSelected()==true){
				g.drawRect((int)Level1.mouseposX-15,(int)Level1.mouseposY-15, 30, 30);
			}
			else if(Level1.st.isSelected()==true){
				g.drawRect((int)Level1.mouseposX-15,(int)Level1.mouseposY-15, 30, 30);
			}
		}
	}
	private void drawallHRTow(Graphics g) {
		for(int i=0;i<Level1.allHighRangeTower.size();i++){
			g.drawRect((int)Level1.allHighRangeTower.get(i).getPositionx(),(int)Level1.allHighRangeTower.get(i).getPositiony(),30,30);
		}
	}
	private void drawallFlameTow(Graphics g) {
		for(int i=0;i<Level1.allFlameTower.size();i++){
			g.drawRect((int)Level1.allFlameTower.get(i).getPositionx(),(int)Level1.allFlameTower.get(i).getPositiony(),30,30);
		}
	}
	private void drawallSlowTow(Graphics g) {
		for(int i=0;i<Level1.allSlowTower.size();i++){
			g.drawRect((int)Level1.allSlowTower.get(i).getPositionx(),(int)Level1.allSlowTower.get(i).getPositiony(),30,30);
		}
	}
	private void drawallNormTow(Graphics g) {
		for(int i=0;i<Level1.allNormTower.size();i++){
			g.drawRect((int)Level1.allNormTower.get(i).getPositionx(),(int)Level1.allNormTower.get(i).getPositiony(),30,30);
		}
	}
}
