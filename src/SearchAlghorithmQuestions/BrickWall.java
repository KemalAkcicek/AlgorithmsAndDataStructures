package SearchAlghorithmQuestions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BrickWall {

	public int leastBricks(List<List<Integer>> wall) {

		Map<Integer, Integer> myHashmap = new HashMap<Integer, Integer>();

		for (List<Integer> list : wall) {

			int gapIndex = 0;

			for (int i = 0; i < list.size() - 1; i++) {

				gapIndex += list.get(i);

				if (!myHashmap.containsKey(gapIndex)) {

					myHashmap.put(gapIndex, 1);
				} else {

					myHashmap.put(gapIndex, myHashmap.get(gapIndex) + 1);

				}

			}

		}

		int max = 0;

		for (int temp : myHashmap.values()) {

			max = Math.max(max, temp);
		}

		return wall.size() - max;
	}

}
