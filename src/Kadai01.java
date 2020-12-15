
public class Kadai01 {

	/**
	 * 課題01
	 * 文字列の左右の文字を反転して返す メソッド
	 * @param s　対象の文字
	 * @return 左右を反転した結果
	 */
	String ReverseString(String s) {
		StringBuffer dest=new StringBuffer();

		try{
			for(int i=s.length()-1; i>=0; i--)
				dest.append(s.charAt(i));
			return dest.toString();
		}catch(NullPointerException e){
			System.out.println("値が入力されていません。");
			return "0";
		}

	}
}
