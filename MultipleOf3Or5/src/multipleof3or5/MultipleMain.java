package multipleof3or5;

public class MultipleMain {

	public static void main(String[] args) {
		MultipleChallenge multiplechallenge = new MultipleChallenge();

		int case1 = 25;
		int case2 = 16;
		int case3 = 34;
		int case4 = 15;
		int case5 = 18;
		int case6 = 30;
		int case7 = 60;

		boolean expected1 = true;
		boolean expected2 = false;
		boolean expected3 = false;
		boolean expected4 = false;
		boolean expected5 = true;
		boolean expected6 = false;
		boolean expected7 = true;

		boolean result1 = multiplechallenge.multipleOf3Or5Only(case1);
		boolean result2 = multiplechallenge.multipleOf3Or5Only(case2);
		boolean result3 = multiplechallenge.multipleOf3Or5Only(case3);
		boolean result4 = multiplechallenge.multipleOf3Or5Only(case4);
		boolean result5 = multiplechallenge.multipleOf3Or5Only(case5);
		boolean result6 = multiplechallenge.multipleOf3Or5Only(case6);
		boolean result7 = multiplechallenge.multipleOf3Or5Only(case7);

		if (result1 == expected1)
			System.out.println("pass");
		else
			System.out.println("fail");

		if (result2 == (expected2))
			System.out.println("pass");
		else
			System.out.println("fail");

		if (result3 == (expected3))
			System.out.println("pass");
		else
			System.out.println("fail");

		if (result4 == (expected4))
			System.out.println("pass");
		else
			System.out.println("fail");

		if (result5 == (expected5))
			System.out.println("pass");
		else
			System.out.println("fail");

		if (result6 == (expected6))
			System.out.println("pass");
		else
			System.out.println("fail");

		if (result7 == (expected7))
			System.out.println("pass");
		else
			System.out.println("fail");
	}
}
