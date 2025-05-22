package Graph;

public class RedunantConnection {

	public int[] findRedundantConnection(int[][] edges) {

		int n = edges.length + 1;

		int parent[] = new int[n];

		for (int i = 0; i <= n; i++) {

			parent[i] = i;
		}

		for (int[] edge : edges) {

			int u = edge[0];
			int v = edge[1];

			int pu = union(parent, u);
			int pv = union(parent, v);

			if (pu == pv) {

				return edge;
			}

			parent[pu] = pv;

		}

		return new int[0];
	}

	private int union(int[] parent, int x) {

		if (parent[x] != x) {

			parent[x] = union(parent, parent[x]);

		}

		return parent[x];
	}

}
