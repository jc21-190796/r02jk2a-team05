public class Kadai04 {

	/**
	 * 課題04
	 * 文字列の中に含まれるアルファベットの中で、一番多く使われている文字を返す
	 * @param s 文字列
	 * @return sの中に入っていた文字
	 */
	char getMaxString(String s) {

		char a[] = s.toCharArray();
		int max = 0;
		char ch = a[0];
		char cha ;
		for (int i = 0; i < a.length-1; i++) {
			int count = 1;

			for (int j = 1; j < a.length; j++) {

				if (a[i] == a[j]) {
					count++;
				}

				if (count > max) {
					if (a[i] < cha) {

					}

				}

			}

		}




		char c = ' ';
		return c;
	}
}
