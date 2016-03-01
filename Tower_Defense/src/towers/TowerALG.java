package towers;

public abstract class TowerALG implements TowerInterface{
	private int dmg;
	private int rangePXL;
	private int shotdelay;
	private int lvl=1;
	private PositionTower position;
	
	public TowerALG(int dmg, int range, int shotdelay) {
		super();
		setDmg(dmg);
		setRangePXL(range);
		setShotdelay(shotdelay);
		setPosition(new PositionTower());
	}	
	
	
	
	
	
	public int getDmg() {
		return dmg;
	}
	public int getRange() {
		return rangePXL;
	}
	public int getLvl() {
		return lvl;
	}
	protected void setDmg(int dmg) {
		this.dmg = dmg;
	}
	protected void setRangePXL(int range) {
		this.rangePXL = range;
	}
	public int getShotdelay() {
		return shotdelay;
	}
	protected void setShotdelay(int shotdelay) {
		this.shotdelay = shotdelay;
	}
	public PositionTower getPosition() {
		return position;
	}
	protected void setPosition(PositionTower position) {
		this.position = position;
	}
}