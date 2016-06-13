package Levels;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

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

	public Spielfeld(Level1 l) {
		this.setPreferredSize(new Dimension(640, 480));
	}

	@Override
	protected void paintComponent(Graphics g) {
		g.clearRect(0, 0, 640, 480);
		// drawField(g);
		drawWay(g);
		drawEnemy(g);
		drawselectedTow(g);
		drawallNormTow(g);
		drawallSlowTow(g);
		drawallFlameTow(g);
		drawallHRTow(g);
		drawBase(g);
	}

	// private void drawField(Graphics g) {
	// g.drawImage(field, 0, 0, null);
	// }

	private void drawWay(Graphics g) {
		for (int i = 5; i < Level1.way.size(); i++) {
			g.drawImage(wayimg, Level1.way.get(i - 5).getX() - 17, Level1.way.get(i - 5).getY() - 17, null);
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

	private void drawEnemy(Graphics g) {
		// Normenemy-------------------------------------------------------------------------------------------------------------------------------
		for (int i = 0; i < Level1.normenemys.size(); i++) {
			if (Level1.normenemys.get(i).isVisble() == true) {
				if (Level1.normenemys.get(i).getWichpic() == 1 && Level1.normenemys.get(i).getwichpiccountdown() <= 0) {
					g.drawImage(normen1, Level1.normenemys.get(i).getPosx() - 20,
							Level1.normenemys.get(i).getPosy() - 66, 40, 66, null);
					Level1.normenemys.get(i).setWichpic(2);
					Level1.normenemys.get(i).wichpiccoutdowntodefault();
				} else if (Level1.normenemys.get(i).getWichpic() == 1) {
					g.drawImage(normen1, Level1.normenemys.get(i).getPosx() - 20,
							Level1.normenemys.get(i).getPosy() - 66, 40, 66, null);
					Level1.normenemys.get(i).setwichpiccountdown(Level1.normenemys.get(i).getwichpiccountdown() - 1);
				}

				if (Level1.normenemys.get(i).getWichpic() == 2 && Level1.normenemys.get(i).getwichpiccountdown() <= 0) {
					g.drawImage(normen2, Level1.normenemys.get(i).getPosx() - 20,
							Level1.normenemys.get(i).getPosy() - 62, 40, 62, null);
					Level1.normenemys.get(i).setWichpic(1);
					Level1.normenemys.get(i).wichpiccoutdowntodefault();
				} else if (Level1.normenemys.get(i).getWichpic() == 2) {
					g.drawImage(normen2, Level1.normenemys.get(i).getPosx() - 20,
							Level1.normenemys.get(i).getPosy() - 62, 40, 62, null);
					Level1.normenemys.get(i).setwichpiccountdown(Level1.normenemys.get(i).getwichpiccountdown() - 1);
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
					Level1.speedenemy.get(i).setwichpiccountdown(Level1.speedenemy.get(i).getwichpiccountdown() - 1);
				}

				if (Level1.speedenemy.get(i).getWichpic() == 2 && Level1.speedenemy.get(i).getwichpiccountdown() <= 0) {
					g.drawImage(speeden2, Level1.speedenemy.get(i).getPosx() - 20,
							Level1.speedenemy.get(i).getPosy() - 62, 40, 62, null);
					Level1.speedenemy.get(i).setWichpic(1);
					Level1.speedenemy.get(i).wichpiccoutdowntodefault();
				} else if (Level1.speedenemy.get(i).getWichpic() == 2) {
					g.drawImage(speeden2, Level1.speedenemy.get(i).getPosx() - 20,
							Level1.speedenemy.get(i).getPosy() - 62, 40, 62, null);
					Level1.speedenemy.get(i).setwichpiccountdown(Level1.speedenemy.get(i).getwichpiccountdown() - 1);
				}
			}

	}

	private void drawBase(Graphics g) {
		if (Level1.way.size() > 0)
			g.drawRoundRect(Level1.way.get(Level1.way.size() - 1).getX() - 16,
					Level1.way.get(Level1.way.size() - 1).getY() - 50, 100, 100, 10, 10);
	}
}
