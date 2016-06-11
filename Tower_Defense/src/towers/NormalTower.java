package towers;

public class NormalTower extends TowerALG{

	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "NormalTower: " + super.toString() + "\n";
	}

	public NormalTower(double positionx, double positiony) {
		super(15,100,500, positionx, positiony,50);
	}

	@Override
	public void lvlUpTo2() {
		super.setDmg(25);
		super.setRangePXL(150);
	}

	@Override
	public void lvlUpTo3() {
		super.setDmg(50);
		super.setRangePXL(200);
		super.setShotdelay(300);
	}
	
	public int getPrice(){
		return 50;
	}
	
}
