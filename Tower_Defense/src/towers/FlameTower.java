package towers;

public class FlameTower extends TowerALG {
	public FlameTower(double positionx, double positiony) {
		super(5, 50, 100, positionx, positiony, 250);
	}

	public String toString() {
		return "FlameTower: " + super.toString() + "\n";
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

	public int getPrice() {
		return 250;
	}

}
