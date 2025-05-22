package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class ValidPath {

	// [[4,3],[1,4],[4,8],[1,7],[6,4],[4,2],[7,4],[4,0],[0,9],[5,4]]
	public boolean validPath(int n, int[][] edges, int source, int destination) {

		Map<Integer, List<Integer>> adjacentList = new HashMap<Integer, List<Integer>>();

		// Graf kur ve bidirectional graph kur
		for (int[] temp : edges) {

			adjacentList.computeIfAbsent(temp[0], k -> new ArrayList<>()).add(temp[1]);
			adjacentList.computeIfAbsent(temp[1], k -> new ArrayList<>()).add(temp[0]);

		}
		// Bfs çözümü
		boolean visited[] = new boolean[n];
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(source);
		visited[source] = true;

		while (!queue.isEmpty()) {

			int node = queue.poll();

			if (node == destination)
				return true;

			List<Integer> list = adjacentList.getOrDefault(node, new ArrayList<>());

			for (int neighbor : list) {

				if (!visited[neighbor]) {

					visited[neighbor] = true;
					queue.add(neighbor);

				}

			}

		}

		return false;
	}

}
