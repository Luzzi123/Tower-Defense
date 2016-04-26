package enemys;

public class Position {
	protected int x;
	protected int y;
	
	public Position(int x,int y){
		setX(x);
		setY(y);
	}
	


	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Position [getX()=" + getX() + ", getY()=" + getY() + "]";
	}
	
	
	
	
	
	
	
}
