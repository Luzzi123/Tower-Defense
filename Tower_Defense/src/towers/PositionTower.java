package towers;

import java.awt.MouseInfo;
public class PositionTower {
	private double y;
	private double x;
	
	public PositionTower(){
		setY(MouseInfo.getPointerInfo().getLocation().getY());
		setX(MouseInfo.getPointerInfo().getLocation().getX());
	}
	
	
	public double getY() {
		return y;
	}
	private void setY(double y) {
		this.y = y;
	}
	public double getX() {
		return x;
	}
	private void setX(double x) {
		this.x = x;
	}
	
	
	public String toString() {
		return "Position [getY()=" + getY() + ", getX()=" + getX() + "]";
	}
	
	
}
