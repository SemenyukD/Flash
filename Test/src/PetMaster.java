
public class PetMaster {

	public static void main(String[] args) {
		
		Pet myPet = new Pet();
		myPet.eat ();
		//String petreaction;
		String petreaction = myPet.say("���! �����!");
		System.out.println(petreaction);
		myPet.sleep();

	}

}
