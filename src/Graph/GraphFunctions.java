package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GraphFunctions {

	// Burada bağımlılığı map e verdiğin zaman bağimliliği solid i kısmını uymuş
	// oluyor esneklik kazandırıyor
	Map<String, List<String>> graph;

	public GraphFunctions() {

		graph = new HashMap<String, List<String>>();

	}

	public boolean addVertex(String vertex) {

		if (!graph.containsKey(vertex)) {

			List<String> newList = new ArrayList<String>();

			graph.put(vertex, newList);
		}

		return true;

	}

	public boolean addEdge(String vertex1, String vertex2) {

		if (graph.containsKey(vertex1) && graph.containsKey(vertex2)) {

			List<String> list1 = graph.get(vertex1);
			list1.add(vertex2);
			List<String> list2 = graph.get(vertex2);
			list2.add(vertex1);

		}

		return true;

	}

	public boolean removeEdge(String vertex1, String vertex2) {

		if (graph.containsKey(vertex1) && graph.containsKey(vertex2)) {

			List<String> list1 = graph.get(vertex1);
			List<String> list2 = graph.get(vertex2);

			list1.remove(vertex2);
			list2.remove(vertex1);

		}

		return false;
	}

	public boolean removeVertex(String vertex) {

		if (!graph.containsKey(vertex))
			return false;

		for (String neighbor : graph.get(vertex)) {

			graph.get(neighbor).remove(vertex);

		}

		graph.remove(vertex);

		return false;

		/*
		 * if (graph.containsKey(vertex)) {
		 * 
		 * Set<String> keySet = graph.keySet();
		 * 
		 * for (String temp : keySet) {
		 * 
		 * List<String> list = graph.get(temp);
		 * 
		 * if (list.contains(vertex)) {
		 * 
		 * list.remove(vertex);
		 * 
		 * graph.put(temp, list); }
		 * 
		 * }
		 * 
		 * graph.remove(vertex); }
		 */
	}

	public boolean graphPrint() {

		Set<String> keySet = graph.keySet();

		for (String temp : keySet) {

			System.out.println("Vertex:" + temp + " Değerleri: " + graph.get(temp));

		}

		return true;
	}

}
