package SearchAlgorithm;

public class SearchAlghoritms {

	public boolean sequantialSearchUnordered(int[] array, int number) {

		boolean found = false;

		int index = 0;

		while (index < array.length && !found) {

			if (array[index] == number) {

				found = true;

			} else {
				index++;
			}

		}

		return found;
	}

	public boolean sequantialSearchOrdered(int[] array, int number) {

		int index = 0;
		boolean found = false;

		while (index < array.length && !found) {

			if (array[index] == number) {

				found = true;
			}

			if (array[index] > number) {

				break;
			}

			else {

				index++;
			}

		}

		return found;
	}

	public boolean binarySearch(int[] array, int number) {

		boolean found = false;

		int firstPointer = 0;
		int lastPointer = array.length - 1;

		while (firstPointer <= lastPointer && !found) {

			int mid = (firstPointer + lastPointer) / 2;

			if (array[mid] == number) {
				found = true;

			} else {

				if (array[mid] < number) {

					firstPointer = mid + 1;

				} else {

					lastPointer = mid - 1;
				}

			}

		}

		return found;
	}

}
