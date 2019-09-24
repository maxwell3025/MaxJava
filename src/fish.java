
public class fish extends Pet{

	int currentDepth;
	
	fish(int startingPos){
		currentDepth=startingPos;
	}
	
	public int dive (int howDeep){
		currentDepth=currentDepth + howDeep;
		System.out.println("Diving for " + howDeep +
		" feet");
		if (currentDepth > 100)	{
		currentDepth = 100;
		System.out.println("I am a fish, not a whale");
		}
		System.out.println("I'm at " + currentDepth +
		" feet below sea level");
		return currentDepth;
	};
	public String say (String something) {
		return "fish no talk";
	}

}