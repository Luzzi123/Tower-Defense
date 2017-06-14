package enemys;

import Levels.*;

public abstract class EnemyALG implements EnemyInterface {
	private boolean visble = false;
	private int hp;
	private int defaultMoveCountdown;
	private int moveCountdown;
	private int wayarraypos =0;
	private int posx;
	private int posy;
	private int wichpic=1;
	private int wichpiccountdown=30;
	private int wichpiccountdowndefault=30;

	public EnemyALG(int hp, int posx, int posy, int firstMoveCountdown, int defaCountDown) {
		setHp(hp);
		setPosx(posx);
		setPosy(posy);
		setFirstMoveCountdown(firstMoveCountdown);
		setDefaultMoveCountdown(defaCountDown);
	}

	private void setPosy(int posy) {
		this.posy = posy;
	}
	private void setPosx(int posx) {
		this.posx = posx;
	}
	public int getHp() {
		return hp;
	}
	private void setHp(int hp) {
		this.hp = hp;
	}
	public int getPosx() {
		return posx;
	}
	public int getPosy() {
		return posy;
	}
	public int getMoveCountdown() {
		return moveCountdown;
	}
	public void setFirstMoveCountdown(int moveCountdown) {
		this.moveCountdown = moveCountdown;
	}
	public boolean isVisble() {
		return visble;
	}
	public void setVisble(boolean visble) {
		this.visble = visble;
	}
	public int getDefaultMoveCountdown() {
		return defaultMoveCountdown;
	}
	public void setDefaultMoveCountdown(int defaultMoveCountdown) {
		this.defaultMoveCountdown = defaultMoveCountdown;
	}
	
	public void checkmove(int enemyArrayPos, String wichEnemy) {
		if (moveCountdown <= 0) {
			move(enemyArrayPos, wichEnemy);
		}
		else{
			moveCountdown--;
		}
	}
	public void move(int enemyArrayPos, String wichEnemy) {
		if (wayarraypos+2 < Level1.way.size()) {
			posx = Level1.way.get(wayarraypos).getX();
			posy = Level1.way.get(wayarraypos).getY();
			wayarraypos++;
			setwichpiccountdown(getwichpiccountdown()-1);
		}
		else {
			Level1.delEnemy(enemyArrayPos, wichEnemy);
		}
		if (wayarraypos == 1) {
			setVisble(true);
		}
		Level1.sp.repaint();
		moveCountdown = defaultMoveCountdown;
	}
	public int getwichpic(){
		return wichpic;
	}
	public void setwichpic(int wichpic){
		this.wichpic= wichpic;
	}
	public int getwichpiccountdown(){
		return wichpiccountdown;
	}
	public void settodefault(){
		wichpiccountdown=wichpiccountdowndefault;
	}
	public void setwichpiccountdown(int wichpiccountdown){
		this.wichpiccountdown=wichpiccountdown;
	}
}
