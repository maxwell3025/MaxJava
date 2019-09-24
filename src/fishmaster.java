
public class fishmaster {

	public static void main(String[] args) {
		
		fish myfish = new fish(18);
		myfish.dive(72);
		myfish.dive(64);
		String fishReaction;
		fishReaction = myfish.say("Hello");
		System.out.println(fishReaction);
	}
	

}
