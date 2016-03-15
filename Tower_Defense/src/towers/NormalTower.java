package towers;

public class NormalTower extends TowerALG{

	public NormalTower(double positionx, double positiony) {
		super(15,100,500, positionx, positiony);
	}
	
	public NormalTower(int dmg,int range,int shotdelay, double positionx, double positiony){
		super(dmg,range,shotdelay, positionx, positiony);
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
	
}
