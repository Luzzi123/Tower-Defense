package towers;

public abstract class TowerALG implements TowerInterface{
	private int dmg;
	private int rangePXL;
	private int shotdelay;
	private int lvl=1;
	private double positionx;
	private double positiony;
	private int price;
	private int whichpic=1;

	public TowerALG(int dmg, int rangePXL, int shotdelay, double positionx, double positiony, int price) {
		super();
		setDmg(dmg);
		setRangePXL(rangePXL);
		setShotdelay(shotdelay);
		setPositionx(positionx);
		setPositiony(positiony);
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
	public double getPositionx() {
		return positionx;
	}
	public void setPositionx(double positionx) {
		this.positionx = positionx;
	}
	public double getPositiony() {
		return positiony;
	}
	public void setPositiony(double positiony) {
		this.positiony = positiony;
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
	public int getPrice(){
		return price;
	}

	public int getWhichpic() {
		return whichpic;
	}

	public void setWhichpic(int whichpic) {
		this.whichpic = whichpic;
	}
}