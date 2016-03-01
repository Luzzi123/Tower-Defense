package towers;

public class FlameTower extends TowerALG {
	public FlameTower() {
		super(5,50,100);
	}

	
	
	public void lvlUpTo2() {
		super.setDmg(6);
		super.setRangePXL(75);
	}

	@Override
	public void lvlUpTo3() {
		super.setDmg(10);
		super.setRangePXL(100);
	}

}
