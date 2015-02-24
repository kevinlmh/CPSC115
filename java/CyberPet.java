public class CyberPet {
	// data
	private boolean isEating = true;
	private boolean isSleeping = false;
	
	// methods
	public void eat() {
		isEating = true;
		isSleeping = false;
		System.out.println("Pet is eating.");
		return;
	}	// end of eat()
	
	public void sleep() {
		isSleeping = true;
		isEating = false;
		System.out.println("Pet is sleeping.");
		return;
	}	// end of sleep()
	
}	// end of CyberPet
