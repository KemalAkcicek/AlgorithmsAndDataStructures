package Questions;

import java.util.Stack;

public class DailyTempatures {

	public int[] dailyTemperatures(int[] temperatures) {

		int result[] = new int[temperatures.length];

		Stack<Integer> stack = new Stack<Integer>();

		for (int i = 0; i < temperatures.length; i++) {

			while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {

				int index = stack.pop();

				result[index] = i - index;

			}
			stack.push(i);

		}

		return result;
	}

	public static void main(String[] args) {

		DailyTempatures dailyTempatures = new DailyTempatures();

		int tempatures[] = { 73, 74, 75, 71, 69, 72, 76, 73 };

		int tempatures2[] = { 30, 40, 50, 60 };

		int tempatures3[] = { 89, 62, 70, 58, 47, 47, 46, 76, 100, 70 };

		System.out.println(dailyTempatures.dailyTemperatures(tempatures).toString());
		System.out.println(dailyTempatures.dailyTemperatures(tempatures2).toString());
		System.out.println(dailyTempatures.dailyTemperatures(tempatures3).toString());

	}

}
