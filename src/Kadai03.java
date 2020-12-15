import java.util.Arrays;

public class Kadai03 {

	/**
	 * 課題03
	 * 文字列の中に含まれるアルファベットを調べて、返すメソッド
	 * @param s 文字列
	 * @return sの中に入っていた文字
	 * 例：引数がAPPLE→戻り値は{'A','E','L','P'}の配列になる
		配列の要素数は、含まれるアルファベットの個数とする（上記例では、char[4]とする）
		大文字と小文字は同じと考え、戻り値は大文字とする
		例：引数がApplePie→戻り値は{'A','E','I','L','P'}の配列になる
	 */
	char[] CharacterList(String s) {//s= fafafdrfc
		String s2 = s.replaceAll("[^A-Za-z]","");//文字列から数字を除去
		String s3 = s2.toUpperCase();//大文字に変換

		char[]chars = s3.toCharArray();
	    Arrays.sort(chars);
	    char  []  wkchar  =  new  char[chars.length];

	    char  temp  =  chars[0];
	    int   j  =  0;
	    int   i;

	    for  (  i = 1;i < chars.length;  i++ ) {
	    	if  (  chars [ i ]  !=  temp ) {
	    		wkchar [ j ]  =  temp;
	    		j++;
	    		temp  =  chars[ i ];
		    }
	    }
	    if  (  i  ==  chars.length )
	    	wkchar[ j ]  =  temp;

//	    String s4 = new String(chars);// 文字列を並び替える

		//char[] c = new char[chars.length];
		char[] c = new  char [ j + 1 ];//cの配列にcharsを入れる
		for ( i = 0; i < c.length; i++)
			c[i]=wkchar[i];
			//int count = 0;
			/*for(char x: chars) {
				if(c[count] != x) {
					count++;
					c[count] = x;
				}
			}*/
		return c;
		}
	}

