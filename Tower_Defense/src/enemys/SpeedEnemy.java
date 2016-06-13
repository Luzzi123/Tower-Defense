package enemys;

public class SpeedEnemy extends EnemyALG {
	public SpeedEnemy(int posx, int posy, int firstmoveCount){
		super(20,posx,posy,firstmoveCount,1);
	}

	@Override
	public int getWichpic() {
		return super.getwichpic();
	}

	@Override
	public void setWichpic(int wichpic) {
		super.setwichpic(wichpic);
	}
	
	public int getwichpiccountdown(){
		return super.getwichpiccountdown();
	}
	public void setwichpiccountdown(int wichpiccountdown){
		super.setwichpiccountdown(wichpiccountdown);
	}
	public void wichpiccoutdowntodefault(){
		super.settodefault();
	}
}
