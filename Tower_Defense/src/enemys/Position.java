package enemys;

public class Position {
	protected double x;
	protected double y;
	
	public Position(int x,int y){
		setX(x);
		setY(y);
	}

	
	protected void setX(double x) {
		this.x = x;
	}
	protected void setY(double y) {
		this.y = y;
	}
	protected double getX() {
		return x;
	}
	protected double getY() {
		return y;
	}
	
	
	
	
	
	
	
}
