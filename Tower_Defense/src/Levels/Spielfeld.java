package Levels;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

import javafx.scene.image.Image;

public class Spielfeld extends JPanel {

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
		drawWay(g);
		drawEnemy(g);
		drawselectedTow(g);
		drawallNormTow(g);
		drawallSlowTow(g);
		drawallFlameTow(g);
		drawallHRTow(g);
		drawBase(g);
	}

	private void drawWay(Graphics g) {
		for (int i = 5; i < Level1.way.size(); i++) {
			g.drawLine(Level1.way.get(i-5).getX(),Level1.way.get(i-5).getY(),Level1.way.get(i).getX(),Level1.way.get(i).getY());
		}
	}

	private void drawselectedTow(Graphics g) {
		if (Level1.mouseposX >= 15 && Level1.mouseposY >= 15 && Level1.mouseposX <= 624 && Level1.mouseposY <= 464) {
			if (Level1.nt.isSelected() == true) {
				g.drawRect((int) Level1.mouseposX - 15, (int) Level1.mouseposY - 15, 30, 30);
			} else if (Level1.hrt.isSelected() == true) {
				g.drawRect((int) Level1.mouseposX - 15, (int) Level1.mouseposY - 15, 30, 30);
			} else if (Level1.ft.isSelected() == true) {
				g.drawRect((int) Level1.mouseposX - 15, (int) Level1.mouseposY - 15, 30, 30);
			} else if (Level1.st.isSelected() == true) {
				g.drawRect((int) Level1.mouseposX - 15, (int) Level1.mouseposY - 15, 30, 30);
			}
		}
	}

	private void drawallHRTow(Graphics g) {
		for (int i = 0; i < Level1.allHighRangeTower.size(); i++) {
			g.drawRect((int) Level1.allHighRangeTower.get(i).getPositionx(),
					(int) Level1.allHighRangeTower.get(i).getPositiony(), 30, 30);
		}
	}

	private void drawallFlameTow(Graphics g) {
		for (int i = 0; i < Level1.allFlameTower.size(); i++) {
			g.drawRect((int) Level1.allFlameTower.get(i).getPositionx(),
					(int) Level1.allFlameTower.get(i).getPositiony(), 30, 30);
		}
	}

	private void drawallSlowTow(Graphics g) {
		for (int i = 0; i < Level1.allSlowTower.size(); i++) {
			g.drawRect((int) Level1.allSlowTower.get(i).getPositionx(), (int) Level1.allSlowTower.get(i).getPositiony(),
					30, 30);
		}
	}

	private void drawallNormTow(Graphics g) {
		for (int i = 0; i < Level1.allNormTower.size(); i++) {
			g.drawRect((int) Level1.allNormTower.get(i).getPositionx(), (int) Level1.allNormTower.get(i).getPositiony(),
					30, 30);
		}
	}
	
	private void drawEnemy(Graphics g){
		for(int i=0; i<Level1.normenemys.size();i++)
			if(Level1.normenemys.get(i).isVisble()==true)	
				g.drawOval(Level1.normenemys.get(i).getPosx()-15, Level1.normenemys.get(i).getPosy()-15, 30, 30);
		for(int i=0;i<Level1.speedenemy.size();i++)
			if(Level1.speedenemy.get(i).isVisble())
				g.drawOval(Level1.speedenemy.get(i).getPosx()-10, Level1.speedenemy.get(i).getPosy()-10, 20, 20);
	}
	
	private void drawBase(Graphics g){
		if(Level1.way.size()>0)
			g.drawRoundRect(Level1.way.get(Level1.way.size()-1).getX()- 16, Level1.way.get(Level1.way.size()-1).getY()-50, 100, 100, 10, 10);
	}
}
