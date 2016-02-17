package enemys;

public class EnemyALG {
	private int hp;
	private int movespeed;
	
	public EnemyALG(){
		setHp(hp);
		setMovespeed(movespeed);
	}

	
	public int getHp() {
		return hp;
	}
	public int getMovespeed() {
		return movespeed;
	}
	private void setHp(int hp) {
		this.hp = hp;
	}
	private void setMovespeed(int movespeed) {
		this.movespeed = movespeed;
	}
	
	
}
