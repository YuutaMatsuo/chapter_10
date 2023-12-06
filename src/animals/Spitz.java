package animals;

public class Spitz extends Dog{
//	String name;
//	public void sleep();
	
	//howlメソッドのオーバーライド
	public void howl() {
		//親（Dog)クラスのhowlメソッドと同じように1度吠える
		super.howl(); //親クラスのメソッド呼び出し
		//さらに「ワンワン」と吠える
		System.out.println("ワンワン！");
		
		// superでアクセス出来るのは自分の親クラスまで
//		super.super.sleep(); //この書き方はエラーになる
	}
}
