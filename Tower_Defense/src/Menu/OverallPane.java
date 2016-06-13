package Menu;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JToggleButton;


public class OverallPane extends JPanel{
	protected JToggleButton but = new JToggleButton("<html><center><p>Play</p><p>Game</p></center></html>");
	protected static JButton but1 = new JButton("Exit");
	ImageIcon startbut = new ImageIcon("Start_Button.png");
	ImageIcon exitbut = new ImageIcon("Exit_Button.png");
	protected PicPanSideL FillerPan1 = new PicPanSideL();
	protected PicPanMiddle FillerPan2 = new PicPanMiddle();
	protected PicPanSideR FillerPan3 = new PicPanSideR();

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Image i= new ImageIcon("Start_Way.png").getImage();
	
	public OverallPane(){
		this.setPreferredSize(new Dimension(650, 609));
		this.setLayout(new GridBagLayout());
		// Modelliere Buttons
		but.setPreferredSize(new Dimension(90, 70));
		but.setIcon(startbut);
		but1.setPreferredSize(new Dimension(90, 70));
		but1.setIcon(exitbut);
		but1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		//put in the Panels and Buttons
		GridBagConstraints c= new GridBagConstraints();
		c.fill= GridBagConstraints.WEST;
		c.gridx=0;
		c.gridy=0;
		this.add(FillerPan1, c);
		c.gridx=1;
		this.add(but, c);
		c.gridx=2;
		this.add(FillerPan2, c);
		c.gridx=3;
		this.add(but1, c);
		c.gridx=4;
		this.add(FillerPan3, c);
		
		
	}
	
	protected void paintComponent(Graphics g){
		g.clearRect(0, 0, this.getWidth(), this.getHeight());
		g.drawImage(i, 0,0, this.getWidth(), this.getHeight(), null);
	}
	
	protected void animate(){
		FillerPan1.animate();
		FillerPan2.animate();
		FillerPan3.animate();
		this.repaint();
	}

}
