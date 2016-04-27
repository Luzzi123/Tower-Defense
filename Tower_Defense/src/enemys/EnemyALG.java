package enemys;

public abstract class EnemyALG {
	private int hp;
	private double movespeed;
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
		return movespeed;
	}
	private void setHp(int hp) {
		this.hp = hp;
	}
	private void setMovespeed(double movespeed2) {
		this.movespeed = movespeed2;
	}
	public double getPosx() {
		return posx;
	}
	public double getPosy() {
		return posy;
	}
	
	
}
