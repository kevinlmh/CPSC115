public class CyberPetUI {
	public static void main(String argv[]){
		System.out.println("main() is starting.");
		CyberPet pet1 = new CyberPet();
		CyberPet pet2 = new CyberPet();
		pet1.sleep();
		pet2.eat();
		pet2.sleep();
		System.out.println("main() is finished.");
		return;
	}	//end of main
}	//end of CyberPetUI
