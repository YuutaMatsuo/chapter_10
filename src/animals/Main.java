package animals;

public class Main {
	public static void main(String[] args) {
		Dog dog = new Dog(); 
		dog.name = "ポチ";
		dog.sleep();
		dog.howl();
		
		Bird bird = new Bird();
		bird.name = "ぼんじり";
		bird.sleep();
		
		Spitz spitz = new Spitz();
		spitz.howl();

	}
}
