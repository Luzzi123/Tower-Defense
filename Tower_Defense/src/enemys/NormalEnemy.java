package enemys;

public class NormalEnemy extends EnemyALG {
	
	public NormalEnemy(int posx, int posy,int firstmoveCount){
		super(40,posx,posy,firstmoveCount,5);
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
