
public class car {
	float howlong=0;
	float speed;
	float time;
	boolean engine=false;

	public void start () {
	engine=true;
	}
	public void drive (float speed, float time ) {
		if (engine=true) {
			howlong=time*speed+howlong;}
		System.out.println (howlong*speed);
	}
	public void stop () {
		engine=false;
	}
}
