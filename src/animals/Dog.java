package animals;

//Animalクラスを親クラス（スーパークラス）として持つクラス
public class Dog extends Animal{
	//上書きしないメンバは省略する
//	String name;
//	
//	public void sleep() {
//		System.out.println("眠った");
//	}
	
	//復習１
	//メソッドの差分コーディングをする
	//howl();「ワン」と出力する
	public void howl() {
		System.out.println("ワン");
	}
}
