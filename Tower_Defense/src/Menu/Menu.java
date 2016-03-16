package Menu;

import javax.swing.*;
import java.awt.BorderLayout;
import java.io.*;
import javax.imageio.*;

public class Menu {
	static JFrame menu = new JFrame("Menu");
	public Menu(){
		try{
			menu.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("Green_Smiley.jpg")))));
		}catch(IOException e){
			System.out.println("IMG Doesn't exist");
		}
		menu.setResizable(false);
		menu.setLayout(new BorderLayout());
		menu.setSize(700,700);
		menu.setVisible(true);
		menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		new Menu();
	}
}
