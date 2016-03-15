package towers;

public class HighRangeTower extends TowerALG {

	public HighRangeTower(double positionx, double positiony){
		super(50,1300,5000, positionx, positiony);
	}

	@Override
	public void lvlUpTo2() {
		super.setDmg(100);
		super.setRangePXL(2000);
		super.setShotdelay(4000);
	}

	@Override
	public void lvlUpTo3() {
		super.setDmg(150);
		super.setRangePXL(2500);
		super.setShotdelay(3000);
	}
}
