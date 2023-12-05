package p01;

public class SuperHero extends Hero {
	//継承をすることで親クラスがもっているフィールドやメソッド部分を省略することが出来る
	//フィールド
	//String name;
	//int hp;
	
	//差分のフィールド
	private boolean flying;
	
	//コンストラクタ
	pubnlic SuperHero(String name,int hp) {
		this.name = name;
		this.hp = hp;
	}
	
	//attack()とrun()は上書きせずそのまま受け継ぐ（記載しない）
	
	//attack()をオーバライド（上書き）してみる
	public void attack() {
//		System.out.println(this.name + "の攻撃！");
//		System.out.println("敵に20のダメージ！");
		
		//親クラス（Heroクラスのメソッドを呼び出す！
//		super.attack();
//		super.attack();
//		親クラスのメソッドの呼び出し
		super.attack();
		super.attack();
	}
	
	//差分のメソッド
	public void fly() {
		this.flying = true;
		System.out.println(this.name + "は飛び上がった！");
	}
	
	public void land() {
		this.flying = false;
		System.out.println(this.name + "は着地した！");
	}
	
	
}
