package Menu;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PicPanMiddle extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Image i1 = new ImageIcon("Zombie1.png").getImage();
	Image i2 = new ImageIcon("Zombie2.png").getImage();
	double im1;
	double im2;

	public PicPanMiddle() {
		this.setPreferredSize(new Dimension(120, 609));
		im1=randomIMG();
		im2=randomIMG();
	}

	protected void paintComponent(Graphics g) {
		if(im1<0.50)
			g.drawImage(i1,0,100,null);
		else
			g.drawImage(i2, 0, 100, null);
		if(im2<0.50)
			g.drawImage(i1,0,300,null);
		else
			g.drawImage(i2, 0, 300, null);
		
	}
	
	public double randomIMG(){
		double i1= Math.random();
		return i1;
	}
	
	public void animate(){
		if(im1<0.50)
			im1=0.60;
		else
			im1=0.40;
		if(im2<0.50)
			im2=0.60;
		else
			im2=0.40;
		
	}
}