package animals;

//Animalクラスを親クラス（スーパークラス）として持つクラス
public class Bird extends Animal{
	//復習３
	//boolean型「flying」
	private boolean flying;

	//暗黙的にディフォルトコンストラクタが呼び出される
//	public Bird() {
//		super();
//	}
	
	//復習4
	//sleep()のオーバーライド
	//ぐっすり眠ったと出力する
	public void sleep() {
		System.out.println("ぐっすり眠った");
	}
	
	//復習２
	//メソッドの差分コーディングをする
	//fly(); フィールド「flying」の値を「true」で代入する
	public void fly() {
		this.flying = true;
	}
	
	public boolean getFlying() {
		return flying;
	}
	
	public void showName() {
		System.out.println(this.name);
		System.out.println(super.name);
	}
}
