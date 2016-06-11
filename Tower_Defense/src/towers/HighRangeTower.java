package towers;

public class HighRangeTower extends TowerALG {

	public HighRangeTower(double positionx, double positiony) {
		super(50, 200, 5000, positionx, positiony, 500);
	}

	public String toString() {
		return "HighRangeTower: " + super.toString() + "\n";
	}

	@Override
	public void lvlUpTo2() {
		super.setDmg(100);
		super.setRangePXL(300);
		super.setShotdelay(4000);
	}

	@Override
	public void lvlUpTo3() {
		super.setDmg(150);
		super.setRangePXL(500);
		super.setShotdelay(3000);
	}

	public int getPrice() {
		return 500;
	}
}
