package towers;

public class TowerALG {
	private int dmg;
	private int rangePXL;
	private int shotdelay;
	private int lvl=1;
	
	public TowerALG(int dmg, int range, int shotdelay) {
		super();
		setDmg(dmg);
		setRangePXL(range);
		setShotdelay(shotdelay);
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
	private void setDmg(int dmg) {
		this.dmg = dmg;
	}
	private void setRangePXL(int range) {
		this.rangePXL = range;
	}












	public int getShotdelay() {
		return shotdelay;
	}












	private void setShotdelay(int shotdelay) {
		this.shotdelay = shotdelay;
	}
}