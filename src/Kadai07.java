import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Kadai07 {


	/**
	 * 課題07
	 * 文字列の中がすべて半角の数字で構成されているかをTrue、Falseで返すメソッド
	 * @param s 検査対象文字列
	 * @return 半角数字のみで構成されていたらtrue
	 */
	boolean isNumeric(String s) {
		String suji = "^[0-9]";
		 boolean result = true;
		    if( s == null || s.isEmpty() ) return false ;

		    Pattern p1 = Pattern.compile(suji);
		    Matcher m1 = p1.matcher(s);
		    return result;
		  }
		}