package p01;

public class Hero {
	// フィールド
	private String name;
	private int hp;

	// コンストラクタ
	public Hero(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	
	//攻撃する
	public void attack() {
		System.out.println(this.name + "の攻撃！");
		System.out.println("敵に5のダメージ！");
	}
	
	//逃げる
	public void run() {
		System.out.println(this.name + "は逃げ出した！");
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
}
