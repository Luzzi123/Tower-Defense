package enemys;

public class Position {
	protected static int x;
	protected static int y;
	
	public Position(int x,int y){
		setX(x);
		setY(y);
	}

	
	private void setX(int x) {
		this.x = x;
	}
	private void setY(int y) {
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	
	
	
	
	
	
}
