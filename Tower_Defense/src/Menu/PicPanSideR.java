package Menu;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PicPanSideR extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Image i1 = new ImageIcon("Zombie1.png").getImage();
	Image i2 = new ImageIcon("Zombie2.png").getImage();
	Image i3 = new ImageIcon("Skelet1.png").getImage();
	Image i4 = new ImageIcon("Skelet2.png").getImage();

	double im1;
	double im2;
	double im3;

	public PicPanSideR() {
		this.setPreferredSize(new Dimension(165, 609));
		im1 = randomIMG();
		im2 = randomIMG();
		im3 = randomIMG();
	}

	protected void paintComponent(Graphics g) {
		if(im1<0.25)
			g.drawImage(i1,0,0,null);
		else if(im1<0.50)
			g.drawImage(i2, 0, 0, null);
		else if(im1<0.75)
			g.drawImage(i3, 0, 0,99,171, null);
		else
			g.drawImage(i4, 0, 0,99,171, null);
		
		if(im2<0.25)
			g.drawImage(i1,50,200,null);
		else if(im2<0.50)
			g.drawImage(i2,50,200, null);
		else if(im2<0.75)
			g.drawImage(i3,50,200,99,171, null);
		else
			g.drawImage(i4,50,200,99,171, null);
		
		
		if(im3<0.25)
			g.drawImage(i1,0,390,null);
		else if(im3<0.50)
			g.drawImage(i2,0,390, null);
		else if(im3<0.75)
			g.drawImage(i3,0,390,99,171, null);
		else
			g.drawImage(i4,0,390,99,171, null);
	}

	public double randomIMG() {
		double i = Math.random();
		return i;
	}

	public void animate() {
		if(im1<0.25)
			im1=0.40;
		else if(im1<0.50)
			im1=0.01;
		else if(im1<0.75)
			im1=0.90;
		else
			im1=0.60;
		
		if(im2<0.25)
			im2=0.40;
		else if(im2<0.50)
			im2=0.01;
		else if(im2<0.75)
			im2=0.90;
		else
			im2=0.60;
		
		if(im3<0.25)
			im3=0.40;
		else if(im3<0.50)
			im3=0.01;
		else if(im3<0.75)
			im3=0.90;
		else
			im3=0.60;
	}
}