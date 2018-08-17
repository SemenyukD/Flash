
public class FishMaster {
	
	public static void main (String [] arg) {
		Fish myFish = new Fish ();
		myFish.dive(2);
		myFish.dive(50);
		myFish.dive(49);
		myFish.sleep();
		
	//String fishreaction;
	//String fishreaction = myFish.say("Hello\n");
	//System.out.println(fishreaction);

	System.out.println(myFish.say("Hello\n"));
	}
}
