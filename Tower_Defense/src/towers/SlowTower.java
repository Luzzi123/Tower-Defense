package towers;

public class SlowTower extends TowerALG {
	private int slow; // Slow wird in % gez�hlt!

	public SlowTower(double positionx, double positiony) {
		super(5, 50, 2000, positionx, positiony, 150);
	}

	public String toString() {
		return "SlowTower: " + super.toString() + "\n";
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

	public int getPrice() {
		return 150;
	}

}
