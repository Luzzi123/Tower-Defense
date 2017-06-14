package Levels;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Spielfeld extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Image wayimg = new ImageIcon("Level_Way.png").getImage();
	private Image speeden1 = new ImageIcon("Zombie1.png").getImage();
	private Image speeden2 = new ImageIcon("Zombie2.png").getImage();
	private Image normen1 = new ImageIcon("Skelet1.png").getImage();
	private Image normen2 = new ImageIcon("Skelet2.png").getImage();
	private Image field = new ImageIcon("Field.png").getImage();
	private Image normT = new ImageIcon("Tower/Normal Tower.png").getImage();
	private Image slowT = new ImageIcon("Tower/Slow Tower.png").getImage();
	private Image fireT = new ImageIcon("Tower/Flame Tower.png").getImage();
	private Image hrT = new ImageIcon("Tower/HIGHRANGE Tower.png").getImage();
	private Image base = new ImageIcon("Base/Base.png").getImage();

	public Spielfeld(Level1 l) {
		this.setPreferredSize(new Dimension(640, 480));
	}

	@Override
	protected void paintComponent(Graphics g) {		
			g.clearRect(0, 0, this.getWidth(), this.getHeight());
			drawField(g);
			drawWay(g);
			drawselectedTow(g);
			drawallNormTow(g);
			drawallSlowTow(g);
			drawallFlameTow(g);
			drawallHRTow(g);
			drawBase(g);
			drawEnemy(g);
	}

	private void drawField(Graphics g) {
		g.drawImage(field, 0, 0, 640, 480, null);
	}

	private void drawWay(Graphics g) {
		for (int i = 5; i < Level1.way.size(); i++) {
			g.drawImage(wayimg, Level1.way.get(i - 5).getX() - 17, Level1.way.get(i - 5).getY() - 17, null);
		}
	}

	private void drawselectedTow(Graphics g) {
		if (Level1.mouseposX >= 15 && Level1.mouseposY >= 15 && Level1.mouseposX <= 624 && Level1.mouseposY <= 464) {
			if (Level1.nt.isSelected() == true) {
				g.drawImage(normT, (int) Level1.mouseposX - 20, (int) Level1.mouseposY - 14, 40, 29, null);
			} else if (Level1.hrt.isSelected() == true) {
				g.drawImage(hrT, (int) Level1.mouseposX - 20, (int) Level1.mouseposY - 20, 40, 40, null);
			} else if (Level1.ft.isSelected() == true) {
				g.drawImage(fireT, (int) Level1.mouseposX - 20, (int) Level1.mouseposY - 20, 40, 40, null);
			} else if (Level1.st.isSelected() == true) {
				g.drawImage(slowT, (int) Level1.mouseposX - 20, (int) Level1.mouseposY - 16, 40, 32, null);
			}
		}
	}

	private void drawallHRTow(Graphics g) {
		for (int i = 0; i < Level1.allHighRangeTower.size(); i++) {
			g.drawImage(hrT, (int) Level1.allHighRangeTower.get(i).getPositionx(),
					(int) Level1.allHighRangeTower.get(i).getPositiony(), 40, 40, null);
		}
	}

	private void drawallFlameTow(Graphics g) {
		for (int i = 0; i < Level1.allFlameTower.size(); i++) {
			g.drawImage(fireT, (int) Level1.allFlameTower.get(i).getPositionx(),
					(int) Level1.allFlameTower.get(i).getPositiony(), 40, 40, null);
		}
	}

	private void drawallSlowTow(Graphics g) {
		for (int i = 0; i < Level1.allSlowTower.size(); i++) {
			g.drawImage(slowT, (int) Level1.allSlowTower.get(i).getPositionx(),
					(int) Level1.allSlowTower.get(i).getPositiony(), 40, 32, null);
		}
	}

	private void drawallNormTow(Graphics g) {
		for (int i = 0; i < Level1.allNormTower.size(); i++) {
			g.drawImage(normT, (int) Level1.allNormTower.get(i).getPositionx(),
					(int) Level1.allNormTower.get(i).getPositiony(), 40, 29, null);
		}
	}

	private void drawEnemy(Graphics g) {
		// Normenemy-------------------------------------------------------------------------------------------------------------------------------
		for (int i = 0; i < Level1.normenemys.size(); i++) {
			if (Level1.normenemys.get(i).isVisble() == true) {
				if (Level1.normenemys.get(i).getWichpic() == 1 && Level1.normenemys.get(i).getwichpiccountdown() <= 0) {
					g.drawImage(normen1, Level1.normenemys.get(i).getPosx() - 20, Level1.normenemys.get(i).getPosy() - 66, 40, 66, null);
					Level1.normenemys.get(i).setWichpic(2);
					Level1.normenemys.get(i).wichpiccoutdowntodefault();
				}
				else if (Level1.normenemys.get(i).getWichpic() == 1) {
					g.drawImage(normen1, Level1.normenemys.get(i).getPosx() - 20,
							Level1.normenemys.get(i).getPosy() - 66, 40, 66, null);
				}

				if (Level1.normenemys.get(i).getWichpic() == 2 && Level1.normenemys.get(i).getwichpiccountdown() <= 0) {
					g.drawImage(normen2, Level1.normenemys.get(i).getPosx() - 20,
							Level1.normenemys.get(i).getPosy() - 62, 40, 62, null);
					Level1.normenemys.get(i).setWichpic(1);
					Level1.normenemys.get(i).wichpiccoutdowntodefault();
				} else if (Level1.normenemys.get(i).getWichpic() == 2) {
					g.drawImage(normen2, Level1.normenemys.get(i).getPosx() - 20,
							Level1.normenemys.get(i).getPosy() - 62, 40, 62, null);
				}
			}
		}
		// Speedenemy-------------------------------------------------------------------------------------------------------------------------------
		for (int i = 0; i < Level1.speedenemy.size(); i++)
			if (Level1.speedenemy.get(i).isVisble() == true) {
				if (Level1.speedenemy.get(i).getWichpic() == 1 && Level1.speedenemy.get(i).getwichpiccountdown() <= 0) {
					g.drawImage(speeden1, Level1.speedenemy.get(i).getPosx() - 20,
							Level1.speedenemy.get(i).getPosy() - 66, 40, 66, null);
					Level1.speedenemy.get(i).setWichpic(2);
					Level1.speedenemy.get(i).wichpiccoutdowntodefault();
				} else if (Level1.speedenemy.get(i).getWichpic() == 1) {
					g.drawImage(speeden1, Level1.speedenemy.get(i).getPosx() - 20,
							Level1.speedenemy.get(i).getPosy() - 66, 40, 66, null);
				}

				if (Level1.speedenemy.get(i).getWichpic() == 2 && Level1.speedenemy.get(i).getwichpiccountdown() <= 0) {
					g.drawImage(speeden2, Level1.speedenemy.get(i).getPosx() - 20,
							Level1.speedenemy.get(i).getPosy() - 62, 40, 62, null);
					Level1.speedenemy.get(i).setWichpic(1);
					Level1.speedenemy.get(i).wichpiccoutdowntodefault();
				} else if (Level1.speedenemy.get(i).getWichpic() == 2) {
					g.drawImage(speeden2, Level1.speedenemy.get(i).getPosx() - 20,
							Level1.speedenemy.get(i).getPosy() - 62, 40, 62, null);
				}
			}

	}

	private void drawBase(Graphics g) {
		if (Level1.way.size() > 0)
			g.drawImage(base, Level1.way.get(Level1.way.size() - 1).getX() - 47,
					Level1.way.get(Level1.way.size() - 1).getY() - 100, 94, 100, null);
	}
}
