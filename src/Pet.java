public class Pet {
	boolean sick;
	float weight;
	float height;
	int health;
	String emotion;
	String color;

	public String say(String aWord) {
		String petResponse = "OK!! OK!! " + aWord;
		return petResponse;
	}
	public void eat(){
		System.out.println(
		"I¡¯m so hungry¡­let me have a snack like nachos!");
	}
	public void sleep(){
		System.out.println(
		"Good night, see you tomorrow");
	}
}
