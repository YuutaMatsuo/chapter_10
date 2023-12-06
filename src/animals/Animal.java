package animals;

public class Animal {
	String name;
	
	public Animal() {
		this.name = "どうぶつ";
	}
	
	public void sleep() {
		System.out.println("眠った");
	}
	
	public void run() {
		System.out.println(this.name + "は走った");
	}
}
