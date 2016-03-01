package towers;

public class NormalTower extends TowerALG{

	public NormalTower() {
		super(15,100,500);
	}
	
	public NormalTower(int dmg,int range,int shotdelay){
		super(dmg,range,shotdelay);
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
