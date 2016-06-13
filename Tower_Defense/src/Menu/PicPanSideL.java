package Menu;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PicPanSideL extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Image i1 = new ImageIcon("Zombie1.png").getImage();
	Image i2 = new ImageIcon("Zombie2.png").getImage();

	protected static double im1;
	protected static double im2;
	protected static double im3;
	public PicPanSideL() {
		this.setPreferredSize(new Dimension(165, 609));
		im1=randomIMG();
		im2=randomIMG();
		im3=randomIMG();
	}

	protected void paintComponent(Graphics g) {
		if(im1<0.50)
			g.drawImage(i1,0,0,null);
		else
			g.drawImage(i2, 0, 0, null);
		if(im2<0.50)
			g.drawImage(i1,50,200,null);
		else
			g.drawImage(i2, 50, 200, null);
		if(im3<0.50)				
			g.drawImage(i1,0, 390,null);
		else
			g.drawImage(i2,0, 390,null);
	}
	
	public double randomIMG(){
		double i= Math.random();
		return i;
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
		if(im3<0.50)
			im3=0.60;
		else
			im3=0.40;
		
	}
}
