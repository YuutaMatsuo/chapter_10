package animals;

public class Animal {
	String name;
	
	//デフォルトコンストラクタ（引数なし・処理なし）が暗黙的に挿入される
	//親クラスのコンストラクタで引数ありで定義をすると、
	//暗黙的なデフォルトコンストラクタではエラーとなる
	public Animal() {
		System.out.println("Animalクラスのコンストラクタが動きました");
	}
	
	public void sleep() {
		System.out.println("眠った");
	}
	
}
