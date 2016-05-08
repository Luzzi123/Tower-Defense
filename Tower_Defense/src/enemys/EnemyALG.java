package enemys;

public abstract class EnemyALG {
	private boolean visble = false;
	private int hp;
	private double moveCountdown;
	private int posx;
	private int posy;
	
	public EnemyALG(int hp, double movespeed, int posx, int posy){
		setHp(hp);
		setMovespeed(movespeed);
		setPosx(posx);
		setPosy(posy);
	}

	
	private void setPosy(int posy) {
		this.posy=posy;
	}
	private void setPosx(int posx) {
		this.posx=posx;
	}
	public int getHp() {
		return hp;
	}
	public double getMovespeed() {
		return moveCountdown;
	}
	private void setHp(int hp) {
		this.hp = hp;
	}
	private void setMovespeed(double movespeed2) {
		this.moveCountdown = movespeed2;
	}
	public int getPosx() {
		return posx;
	}
	public int getPosy() {
		return posy;
	}


	public boolean isVisble() {
		return visble;
	}


	public void setVisble(boolean visble) {
		this.visble = visble;
	}
	
	
}
