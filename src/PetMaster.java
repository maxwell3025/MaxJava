import java.io.File;
import java.io.FileOutputStream;

public class PetMaster {

	public static void main(String[] args) throws Exception {
		String petReaction;
		Pet myPet = new Pet();
		myPet.eat();
		petReaction = myPet.say("tweet tweeet");
		System.out.println(petReaction);
		petReaction = myPet.say("Good Moring!");
		System.out.println(petReaction);
		Pet flufkins = new Pet();
		petReaction = flufkins.say("meow");
		System.out.println(petReaction);

		File outputFile = new File("test.txt");
		FileOutputStream os = new FileOutputStream(outputFile);
		os.write("My test text".getBytes());
		os.close();
	}

}
