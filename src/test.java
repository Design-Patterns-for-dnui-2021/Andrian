
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Helicopter helicopter = new Helicopter();
		helicopter.setTakeOff(new VerticalTakeOff());
		helicopter.setFlight(new SubSonicFly());
		helicopter.info();
		System.out.print("\n");
		
		Airplane airplane = new Airplane();
		airplane.setTakeOff(new LongDistanceTakeOff());
		airplane.setFlight(new SubSonicFly());
		airplane.info();
		System.out.print("\n");
		
		Fighter fighter = new Fighter();
		fighter.setTakeOff(new LongDistanceTakeOff());
		fighter.setFlight(new SuperSonicFly());
		fighter.info();
		System.out.print("\n");
		
		Harrier harrier = new Harrier();
		harrier.setTakeOff(new VerticalTakeOff());
		harrier.setFlight(new SuperSonicFly());
		harrier.info();
		System.out.print("\n");
		
	}

}
