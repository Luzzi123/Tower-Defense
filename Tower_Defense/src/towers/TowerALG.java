package towers;

public abstract class TowerALG implements TowerInterface{
	private int dmg;
	private int rangePXL;
	private int shotdelay;
	private int lvl=1;
	private Position position;
	
	public TowerALG(int dmg, int range, int shotdelay) {
		super();
		setDmg(dmg);
		setRangePXL(range);
		setShotdelay(shotdelay);
		setPosition(new Position());
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
	public Position getPosition() {
		return position;
	}
	protected void setPosition(Position position) {
		this.position = position;
	}
}