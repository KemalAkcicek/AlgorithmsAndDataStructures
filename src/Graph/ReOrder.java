package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ReOrder {

	// Adjancey List tutacağız
	Map<Integer, List<Integer>> graph = new HashMap<Integer, List<Integer>>();

	// Edges tutacağız
	Set<String> edges = new HashSet<String>();

	Set<Integer> visited = new HashSet<Integer>();

	int count = 0;

	public int minReorder(int n, int[][] connections) {

		// n = 6, connections = [[0,1],[1,3],[2,3],[4,0],[4,5]]

		// n = 5, connections = [[1,0],[1,2],[3,2],[3,4]]

		for (int[] temp : connections) {

			int u = temp[0];
			int v = temp[1];

			edges.add(u + "," + v);

			graph.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
			graph.computeIfAbsent(v, k -> new ArrayList<>()).add(u);

		}

		dfs(0);
		return count;
	}

	private void dfs(int city) {

		visited.add(city);

		for (int neighor : graph.getOrDefault(city, new ArrayList<>())) {

			if (!visited.contains(neighor)) {

				String edge = city + "," + neighor;

				if (edges.contains(edge)) {

					count++;
				}

				dfs(neighor);
			}

		}

	}

}
