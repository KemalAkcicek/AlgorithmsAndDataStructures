package Graph;

public class FindJudge {

	public int findJudge(int n, int[][] trust) {

		if (n == 1)
			return 1;

		int count[] = new int[n + 1];

		for (int[] temp : trust) {

			count[temp[0]]--;
			count[temp[1]]++;

		}

		for (int i = 0; i < count.length; i++) {

			if (count[i] == n - 1) {

				return i;
			}
		}

		return -1;

	}

}
