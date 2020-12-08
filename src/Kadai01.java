
public class Kadai01 {

	/**
	 * 課題01
	 * 文字列の左右の文字を反転して返すメソッド
	 * @param s　対象の文字
	 * @return 左右を反転した結果
	 */
	String ReverseString(String s) {
		StringBuffer dest=new StringBuffer();
		for(int i=s.length()-1; i>=0; i--)
			dest.append(s.charAt(i));
		return dest.toString();
	}
}
