package Levels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.MouseInfo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

import towers.*;

public class Level1 implements MouseListener,MouseMotionListener {
	public static double mouseposX = 0.0;
	public static double mouseposY = 0.0;
	protected static ArrayList<Position> way = new ArrayList<Position>();
	protected static ArrayList<NormalTower> allNormTower = new ArrayList<NormalTower>();
	protected static ArrayList<SlowTower> allSlowTower= new ArrayList<SlowTower>();
	protected static ArrayList<FlameTower> allFlameTower = new ArrayList<FlameTower>();
	protected static ArrayList<HighRangeTower> allHighRangeTower= new ArrayList<HighRangeTower>();
	
	static JToggleButton nt = new JToggleButton("<html><center>Normal<br>Tower</center></html>", false);
	static JToggleButton st = new JToggleButton("<html><center>Slow<br>Tower</center></html>", false);
	static JToggleButton hrt = new JToggleButton("<html><center>High-Rage<br>Tower</center></html>", false);
	static JToggleButton ft = new JToggleButton("<html><center>Flame<br>Tower</center></html>", false);
	protected static Spielfeld sp = new Spielfeld(null);

	public Level1() {
		JFrame l1 = new JFrame("Level 1");
		l1.setSize(640,580);
		l1.setLayout(new BorderLayout());
		l1.setLocationRelativeTo(null);

		JPanel jp = new JPanel();
		jp.setLayout(new GridBagLayout());
		jp.setBackground(Color.RED);

		// Define ActionListener
		ActionListener actionNT = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				if (nt.isSelected() == true) {
					st.setSelected(false);
					hrt.setSelected(false);
					ft.setSelected(false);
					System.out.println("Click somewhere to place a Normal Tower.");
				}
			}
		};
		ActionListener actionST = new ActionListener() {
			public void actionPerformed(ActionEvent actionevent) {
				if (st.isSelected() == true) {
					nt.setSelected(false);
					hrt.setSelected(false);
					ft.setSelected(false);
					System.out.println("Click somewhere to place a Slow Tower.");
				}
			}
		};
		ActionListener actionHRT = new ActionListener() {
			public void actionPerformed(ActionEvent actionevent) {
				if (hrt.isSelected() == true) {
					nt.setSelected(false);
					ft.setSelected(false);
					st.setSelected(false);
					System.out.println("Click somewhere to place a High Range Tower.");
				}
			}
		};
		ActionListener actionFT = new ActionListener() {
			public void actionPerformed(ActionEvent actionevent) {
				if (ft.isSelected() == true) {
					nt.setSelected(false);
					st.setSelected(false);
					hrt.setSelected(false);
					System.out.println("Click somewhere to place a Flame Tower.");
				}
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

		l1.add(jp, BorderLayout.NORTH);
		l1.add(sp, BorderLayout.CENTER);
		l1.setResizable(false);
		l1.setVisible(true);
		l1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Level1();
		while(true){
			sp.repaint();
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		if (nt.isSelected() == true || st.isSelected() == true || hrt.isSelected() == true || ft.isSelected() == true) {
			System.out.println("___________________________________________");
			if (nt.isSelected() == true) {
				allNormTower.add(new NormalTower(arg0.getX()-15, arg0.getY()-15));
				System.out.println("Normal Tower has been set.");
				nt.setSelected(false);
			} else if (st.isSelected() == true) {
				allSlowTower.add(new SlowTower(arg0.getX()-15,arg0.getY()-15));
				System.out.println("Slow Tower has been set.");
				st.setSelected(false);
			} else if (hrt.isSelected() == true) {
				allHighRangeTower.add(new HighRangeTower(arg0.getX()-15, arg0.getY()-15));
				System.out.println("High Range Tower has been set.");
				hrt.setSelected(false);
			} else if (ft.isSelected() == true) {
				allFlameTower.add(new FlameTower(arg0.getX()-15, arg0.getY()-15));
				System.out.println("Flame Tower has been set.");
				ft.setSelected(false);
			}
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
		mouseposX = sp.getMousePosition().getX();
		mouseposY = sp.getMousePosition().getY();
	}
	
	
}
