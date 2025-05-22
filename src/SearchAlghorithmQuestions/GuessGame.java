package SearchAlghorithmQuestions;

public class GuessGame {

	int pick;

	int guess(int num) {
		if (num == pick)
			return 0;
		return num > pick ? -1 : 1;
	}
}
