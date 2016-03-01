package towers;

public class SlowTower extends TowerALG {
	private int slow;	//Slow wird in % gezählt!
	public SlowTower() {
		super(5,50,2000);
	}
	public SlowTower(int dmg,int range, int shotdelay){
		super(dmg,range,shotdelay);
		setSlow(25);
	}
	
	
	@Override
	public void lvlUpTo2() {
		setSlow(50);
		super.setDmg(10);
		super.setRangePXL(100);
	}
	
	@Override
	public void lvlUpTo3() {
		setSlow(75);	
		super.setDmg(15);
		super.setRangePXL(150);
	}
	
	public int getSlow() {
		return slow;
	}
	private void setSlow(int slow) {
		this.slow = slow;
	}
	
	
	
}
