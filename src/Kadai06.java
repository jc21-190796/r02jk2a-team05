public class Kadai06 {

	/**
	 * 課題06
	 * 引数として渡された配列の中で、降順で2番目の値を返す
	 * @param d 数値が入っている配列
	 * @return 配列の中の降順で2番目の値
	 */
	int get2ndMax(int[] d) {
		if (d.length == 0) {
			System.out.println("この配列は空っぽです。");
		}
		int max = d[0];
		if (d.length <=1) {
			System.out.println("この配列にはデータが2つ以上入っていません。");
		}
		for(int i = 1; i < d.length; i++) {
			if(max < d[i]) {
				max = d[i];
			}
		}

		int max2;
		if (d[0] == max) {
			max2 = d[1];
		}else {
			max2 = d[0];
		}
			for (int j = 0; j < d.length; j++) {
				if (d[j] != max) {
					if(max2 < d[j]) {
						max2 = d[j];
					}
				}
			}
			return max2;
		}

}