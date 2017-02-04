package multipleof3or5;

public class MultipleChallenge {
	public boolean multipleOf3Or5Only(int n) {
		if (n % 3 == 0 && n % 5 == 0)
			return false;
		else if (n % 3 == 0 || n % 5 == 0)
			return true;
		else
			return false;
	}

}
