package challenge;

public class PosNegMain {

	public static void main(String[] args) {
		PosNegChallenge posnegchallenge = new PosNegChallenge();

		boolean expected1 = true;
		boolean expected2 = false;

		boolean result1 = posnegchallenge.posNeg(1, -1, false);
		boolean result2 = posnegchallenge.posNeg(-1, 1, false);
		boolean result3 = posnegchallenge.posNeg(1, 1, false);
		boolean result4 = posnegchallenge.posNeg(-1, -1, false);
		boolean result5 = posnegchallenge.posNeg(-1, -1, true);
		boolean result6 = posnegchallenge.posNeg(1, -1, true);
		boolean result7 = posnegchallenge.posNeg(-1, 1, true);
		boolean result8 = posnegchallenge.posNeg(1, 1, true);

		// boundary cases
		boolean result9  = posnegchallenge.posNeg(0, 1, false);
		boolean result10 = posnegchallenge.posNeg(-9, -1, true);
		boolean result11 = posnegchallenge.posNeg(7, 0, false);
		boolean result12 = posnegchallenge.posNeg(5, -1, true);
		boolean result13 = posnegchallenge.posNeg(1, 0, true);
		boolean result14 = posnegchallenge.posNeg(9, -9,false);
		boolean result15 = posnegchallenge.posNeg(8, -1, true);
		
		if (result1 == expected1)
			System.out.println("pass");
		else
			System.out.println("fail");
		if (result2 == expected1)
			System.out.println("pass");
		else
			System.out.println("fail");
		if (result3 == expected2)
			System.out.println("pass");
		else
			System.out.println("fail");
		if (result4 == expected2)
			System.out.println("pass");
		else
			System.out.println("fail");
		if (result5 == expected1)
			System.out.println("pass");
		else
			System.out.println("fail");
		if (result6 == expected2)
			System.out.println("pass");
		else
			System.out.println("fail");
		if (result7 == expected2)
			System.out.println("pass");
		else
			System.out.println("fail");
		if (result8 == expected2)
			System.out.println("pass");
		else
			System.out.println("fail");
		if (result9 == expected2)
			System.out.println("pass");
		else
			System.out.println("fail");
		if (result10 == expected2)
			System.out.println("pass");
		else
			System.out.println("fail");
		if (result11 == expected2)
			System.out.println("pass");
		else
			System.out.println("fail");
		if (result12 == expected2)
			System.out.println("pass");
		else
			System.out.println("fail");
		if (result13 == expected2)
			System.out.println("pass");
		else
			System.out.println("fail");
		if (result14 == expected2)
			System.out.println("pass");
		else
			System.out.println("fail");
		if (result15 == expected2)
			System.out.println("pass");
		else
			System.out.println("fail");
	}
}
