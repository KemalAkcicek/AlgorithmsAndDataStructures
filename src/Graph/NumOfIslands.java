package Graph;

public class NumOfIslands {

	public int numIslands(char[][] grid) {

		int count = 0;

		for (int i = 0; i < grid.length; i++) {

			for (int j = 0; j < grid[i].length; j++) {

				if (grid[i][j] == '1') {

					count++;

					dfs(grid, i, j);
				}

			}

		}

		return count;
	}

	private void dfs(char[][] grid, int i, int j) {

		if (grid[i][j] == '0' || i < 0 || j < 0 || i >= grid.length || j >= grid[i].length) {

			return;
		}

		grid[i][j] = '0';

		dfs(grid, i + 1, j);// alta
		dfs(grid, i - 1, j);// yukarıya
		dfs(grid, i, j + 1);// sağa
		dfs(grid, i, j - 1);// sola

	}

}
