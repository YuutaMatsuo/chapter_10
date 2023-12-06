package animals;

public class Main {
	public static void main(String[] args) {
		Dog dog = new Dog();
		
		dog.name = "ポチ";
		dog.sleep();
		dog.howl();
		
		Bird bird = new Bird();
		
		Animal animal = new Animal();
		animal.name = "どうぶつ";
		
		bird.name = "ぼんじり";
		bird.sleep();
		bird.fly();
		System.out.println(bird.getFlying());
		
		bird.showName();
	}
}
