package Levels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

import enemys.*;
import towers.*;

public class Level1 implements MouseListener, MouseMotionListener {
	protected static double mouseposX = 0.0;
	protected static double mouseposY = 0.0;

	// Gegner
	public static ArrayList<NormalEnemy> normenemys = new ArrayList<NormalEnemy>();
	protected static ArrayList<SpeedEnemy> speedenemy = new ArrayList<SpeedEnemy>();
	protected static ArrayList<Integer> normdelList = new ArrayList<Integer>();
	protected static ArrayList<Integer> speeddelList = new ArrayList<Integer>();
	// Weg
	public static ArrayList<Position> way = new ArrayList<Position>();
	// Türme
	protected static ArrayList<NormalTower> allNormTower = new ArrayList<NormalTower>();
	protected static ArrayList<SlowTower> allSlowTower = new ArrayList<SlowTower>();
	protected static ArrayList<FlameTower> allFlameTower = new ArrayList<FlameTower>();
	protected static ArrayList<HighRangeTower> allHighRangeTower = new ArrayList<HighRangeTower>();
	// Buttons, etc.
	static JToggleButton nt = new JToggleButton("<html><center>Normal<br>Tower</center></html>", false);
	static JToggleButton st = new JToggleButton("<html><center>Slow<br>Tower</center></html>", false);
	static JToggleButton hrt = new JToggleButton("<html><center>High-Rage<br>Tower</center></html>", false);
	static JToggleButton ft = new JToggleButton("<html><center>Flame<br>Tower</center></html>", false);
	protected static JLabel lb = new JLabel();
	public static Spielfeld sp = new Spielfeld(null);
	private static BufferedReader wayreader;
	private static BufferedReader enemyreader;

	public Level1() {
		// JFrame bearbeitung
		JFrame l1 = new JFrame("Level 1");
		l1.setLayout(new BorderLayout());
		l1.setLocationRelativeTo(null);
		l1.setBounds(650, 210, 0, 0);

		JPanel jp = new JPanel();
		jp.setLayout(new GridBagLayout());
		jp.setBackground(Color.LIGHT_GRAY);

		// Define ActionListener
		ActionListener actionNT = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				if (nt.isSelected() == true) {
					st.setSelected(false);
					hrt.setSelected(false);
					ft.setSelected(false);
					lb.setText("Click somewhere to place a Normal Tower.");
				} else
					lb.setText("");
			}
		};
		ActionListener actionST = new ActionListener() {
			public void actionPerformed(ActionEvent actionevent) {
				if (st.isSelected() == true) {
					nt.setSelected(false);
					hrt.setSelected(false);
					ft.setSelected(false);
					lb.setText("Click somewhere to place a Slow Tower.");
				} else
					lb.setText("");
			}
		};
		ActionListener actionHRT = new ActionListener() {
			public void actionPerformed(ActionEvent actionevent) {
				if (hrt.isSelected() == true) {
					nt.setSelected(false);
					ft.setSelected(false);
					st.setSelected(false);
					lb.setText("Click somewhere to place a High Range Tower.");
				} else
					lb.setText("");
			}
		};
		ActionListener actionFT = new ActionListener() {
			public void actionPerformed(ActionEvent actionevent) {
				if (ft.isSelected() == true) {
					nt.setSelected(false);
					st.setSelected(false);
					hrt.setSelected(false);
					lb.setText("Click somewhere to place a Flame Tower.");
				} else
					lb.setText("");
			}
		};

		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.NORTH;
		c.gridx = 0;
		c.gridy = 0;

		nt.addActionListener(actionNT);
		jp.add(nt, c);
		nt.setPreferredSize(new Dimension(90, 75));

		c.gridx = 1;
		c.gridy = 0;
		st.addActionListener(actionST);
		jp.add(st, c);
		st.setPreferredSize(new Dimension(90, 75));

		c.gridx = 2;
		c.gridy = 0;
		hrt.addActionListener(actionHRT);
		jp.add(hrt, c);
		hrt.setPreferredSize(new Dimension(110, 75));

		c.gridx = 3;
		c.gridy = 0;
		ft.addActionListener(actionFT);
		jp.add(ft, c);
		ft.setPreferredSize(new Dimension(90, 75));

		sp.addMouseListener(this);
		sp.addMouseMotionListener(this);

		lb.setPreferredSize(new Dimension(0, 25));

		l1.add(jp, BorderLayout.NORTH);
		l1.add(sp, BorderLayout.CENTER);
		l1.add(lb, BorderLayout.SOUTH);
		l1.setResizable(false);
		l1.pack();
		l1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		l1.setVisible(true);
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		new Level1();
		readway();
		readenemys();
		sp.repaint();
		Thread.sleep(3000);
		while (true) {
			moveenemys();
			checkNormDelList();
			Thread.sleep(5);
		}
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		if (nt.isSelected() == true || st.isSelected() == true || hrt.isSelected() == true || ft.isSelected() == true) {
			if (nt.isSelected() == true) {
				allNormTower.add(new NormalTower(arg0.getX() - 15, arg0.getY() - 15));
				nt.setSelected(false);
			} else if (st.isSelected() == true) {
				allSlowTower.add(new SlowTower(arg0.getX() - 15, arg0.getY() - 15));
				st.setSelected(false);
			} else if (hrt.isSelected() == true) {
				allHighRangeTower.add(new HighRangeTower(arg0.getX() - 15, arg0.getY() - 15));
				hrt.setSelected(false);
			} else if (ft.isSelected() == true) {
				allFlameTower.add(new FlameTower(arg0.getX() - 15, arg0.getY() - 15));
				ft.setSelected(false);
			}
			lb.setText("");
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		mouseposX = 0.0;
		mouseposY = 0.0;

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		mouseposX = e.getX();
		mouseposY = e.getY();
		sp.repaint();
	}

	public static void readway() throws IOException {
		wayreader = new BufferedReader(new FileReader("Weg_Level1.txt"));
		String zeile = wayreader.readLine();
		while (zeile != null) {
			String[] weg = zeile.split("/");
			String x = weg[0];
			String y = weg[1];
			int xPos = Integer.parseInt(x);
			int yPos = Integer.parseInt(y);
			way.add(new Position(xPos, yPos));
			zeile = wayreader.readLine();
		}
	}

	public static void readenemys() throws IOException {
		enemyreader = new BufferedReader(new FileReader("Enemys_Level1.txt"));
		String line = enemyreader.readLine();
		String[] allenemys = line.split(";");
		for (int i = 0; i < allenemys.length; i++) {
			if (allenemys[i].equals("norm") == true) {
				normenemys.add(new NormalEnemy(way.get(0).getX(), way.get(0).getY(), 1500 * (i + 1)));
			} else if (allenemys[i].equals("speed") == true) {
				speedenemy.add(new SpeedEnemy(way.get(0).getX(), way.get(0).getY(), 1500 * (i + 1)));
			}
		}
	}

	public static void moveenemys() {
		for (int i = 0; i < normenemys.size(); i++) {
			NormalEnemy enemy = normenemys.get(i);
			enemy.checkmove(i, "norm");
			normenemys.remove(i);
			normenemys.add(i, enemy);
		}
		for (int i = 0; i < speedenemy.size(); i++) {
			SpeedEnemy enemy = speedenemy.get(i);
			enemy.checkmove(i, "speed");
			speedenemy.remove(i);
			speedenemy.add(i, enemy);
		}
	}

	public static void delEnemy(int enemyArrayPos, String wichEnemy) {
		if (wichEnemy.equals("norm")) {
			normdelList.add(enemyArrayPos);
		} else {
			speeddelList.add(enemyArrayPos);
		}
	}

	private static void checkNormDelList() {
		int nubToRem;
		if (normdelList.size() > 0) {
			for (int i = 0; i < normdelList.size();) {
				nubToRem = normdelList.get(0);
				normenemys.remove(nubToRem);
				normenemys.add(nubToRem, null);
				normdelList.remove(0);
			}
			for (int i = 0; i < normenemys.size(); i++) {
				if (normenemys.get(i) == null) {
					normenemys.remove(i);
					i--;
				}
			}
		}
		else if(speeddelList.size()>0){
			for (int i = 0; i < speeddelList.size();) {
				nubToRem = speeddelList.get(0);
				speedenemy.remove(nubToRem);
				speedenemy.add(nubToRem, null);
				speeddelList.remove(0);
			}
			for (int i = 0; i < speedenemy.size(); i++) {
				if (speedenemy.get(i) == null) {
					speedenemy.remove(i);
					i--;
				}
			}
		}
	}

}
